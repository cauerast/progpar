package dc.unifacef.db.Service;

import dc.unifacef.db.Repository.ProductRepository;
import dc.unifacef.db.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    // dependency injection by constructor
    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    // list products table
    public List<Product> list() {
        return repo.findAll(); // select * from produtos;
    }

    // list product table by id
    public Optional<Product> findById(Long id) {
        return repo.findById(id); // select * from produtos where id = id;
    }

    public boolean remove(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }

    public Product patch(long id, Product product) {
        if (repo.existsById(id)) {
            product.setId(id);
            return repo.save(product); // product has id, so it update (an existent product)
        }
        return null;
    }

    // create a product in db
    public Product save(Product product) {
        if (product.getDescription().equals("robo")) {
            return null;
        } else {
            return repo.save(product); // product doesn't have id, so it make an insert to db
        }
    }
}