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

    // remove a product by your id
    public boolean remove(Long id){
        return this.products.removeIf(p -> p.getID().equals(id));
    }

    // patch the product by id
    public Product patch(Long id, Product newProduct){
        newProduct.setID(id);
        for(int i = 0; i < this.products.size(); i++){
            if(this.products.get(i).getID().equals(id)){
                // got it
                this.products.set(i, newProduct);
                return newProduct;
            }
        }
        return null; // product not found
    }
}
