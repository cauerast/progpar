package dc.unifacef.db.Repository;

import dc.unifacef.db.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
  // This interface will contain a CRUD;
  // save(), findAll(), findById(), delete(), existsById(), count().
  // This class is the closest to the system's database
  // Hibernate transforms this information into database commands
}
