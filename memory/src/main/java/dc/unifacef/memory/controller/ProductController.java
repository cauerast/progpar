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
}
