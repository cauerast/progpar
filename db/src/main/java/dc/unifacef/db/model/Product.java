package dc.unifacef.db.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String name;
    @Column
    private Double price;
    @Column (length = 500)
    private String desc;
}
