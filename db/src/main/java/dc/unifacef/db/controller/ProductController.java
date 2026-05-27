package dc.unifacef.db.controller;

import dc.unifacef.db.Service.ProductService;
import dc.unifacef.db.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // recebe as requisicoes
@RequestMapping("/products") // recebe somente as requisicoes de /products
public class ProductController {
    // object from ProductService. dependency injection
    // we use a constructor for this

    private final ProductService service;
    public ProductController(ProductService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Product>> list(){
        return ResponseEntity.ok(service.list());
    }

}
