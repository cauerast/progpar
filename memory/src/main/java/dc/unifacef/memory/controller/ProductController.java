package dc.unifacef.memory.controller;

import dc.unifacef.memory.Service.ProductService;
import dc.unifacef.memory.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController // control of rest requisitions
@RequestMapping("/product") // responses endpoint
public class ProductController {
    // GET requisition

    // Dependence injection
    // Call a method without an instance
    @Autowired
    ProductService service;

    // ResponseEntity is a type of data that returns Controller data to Frontend
    @GetMapping
    public ResponseEntity<List<Product>> consult(){
        return ResponseEntity.ok(service.consult());
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product){
        Product newProduct = service.create(product);
        // URI - Uniform Resource Identifier;

        URI uri = URI.create("/product/" + newProduct.getID());
        return ResponseEntity.created(uri).body(newProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remove(@PathVariable Long id){
        if(service.remove(id)){
            return ResponseEntity.noContent().build(); // success 204
        } else {
            return ResponseEntity.notFound().build(); // client error 404
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Product> patch(@PathVariable Long id, @RequestBody Product newProduct){
        Product response = service.patch(id, newProduct);
        if(response != null){
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
