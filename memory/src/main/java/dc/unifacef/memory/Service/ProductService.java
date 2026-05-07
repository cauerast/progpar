package dc.unifacef.memory.Service;

import dc.unifacef.memory.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private Long id = 1L;
    List<Product> products = new ArrayList<Product>();

    // consult product at the list
    public List<Product> consult() {
        return this.products;
    }

    public Product create(Product product){
        product.setID(id);
        id++;
        this.products.add(product);
        return product;
    }
}
