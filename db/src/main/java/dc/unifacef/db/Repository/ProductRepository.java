package dc.unifacef.db.Repository;

import dc.unifacef.db.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Long id(Long id);
    // that interface will contain a CRUD;
    // save(), findAll(), findById(), remove(), existsById(), count().
    // essa classe é a mais perto ao banco de dados do sistema
    // o hibernate transforma essas informacoes em comandos para o banco de dados
}
