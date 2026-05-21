package dc.unifacef.db.Service;

import dc.unifacef.db.Repository.ProductRepository;
import dc.unifacef.db.model.Product;

import java.util.List;
import java.util.Optional;

public class ProductService {

    // dependency injection
    private final ProductRepository repo;

    public ProductService(ProductRepository repo){
        this.repo = repo;
    }

    // list products table
    public List<Product> list(){
        return repo.findAll();
    }

    // list product table by id
    public Optional<Product> findById(Long id){
        return repo.findById(id);
    }

    public boolean remove(Long id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        return false;
    }


}
