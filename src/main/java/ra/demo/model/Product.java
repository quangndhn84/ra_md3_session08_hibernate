package ra.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Product")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @Column(name = "product_id", columnDefinition = "char(5)")
    private String productId;
    @Column(name = "product_name", columnDefinition = "varchar(100)", unique = true, nullable = false)
    private String productName;
    private float price;
    @Column(name = "product_status")
    private boolean status;
    //Product - Categories: N-1
    @ManyToOne
    @JoinColumn(name = "catalog_id",referencedColumnName = "catalog_id")
    private Categories catalog;
}
