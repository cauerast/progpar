package dc.unifacef.db.controller;

import dc.unifacef.db.Service.ProductService;
import dc.unifacef.db.model.Product;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController // recebe as requisicoes
@RequestMapping("/product") // recebe somente as requisicoes de /products
public class ProductController {
  // object from ProductService. dependency injection
  // we use a constructor for this

  private final ProductService service;

  public ProductController(ProductService service) {
    this.service = service;
  }

  @GetMapping
  public ResponseEntity<List<Product>> list() {
    return ResponseEntity.ok(service.list());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<Product>> findById(@PathVariable Long id) {
    Optional<Product> prod = service.findById(id);
    if (prod.isEmpty()) {
      return ResponseEntity.notFound().build(); // 404
    }
    return ResponseEntity.ok(prod); // 200
  }

  @PostMapping
  public ResponseEntity<Product> create(@RequestBody Product product) {
    Product newProduct = service.save(product);
    if (newProduct != null) {
      URI uri = URI.create("/product/" + newProduct.getId());
      return ResponseEntity.created(uri).body(newProduct);
    }
    return ResponseEntity.noContent().build();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> remove(@PathVariable Long id) {
    if (service.remove(id)) {
      return ResponseEntity.noContent().build(); // 204
    }
    return ResponseEntity.notFound().build(); // 404

  }

  @PatchMapping("/{id}")
  public ResponseEntity<Product> patch(@PathVariable Long id, @RequestBody Product newProd) {
    Product response = service.patch(id, newProd);
    if (response != null) {
      return ResponseEntity.ok(response);
    }
    return ResponseEntity.notFound().build();

  }
}
