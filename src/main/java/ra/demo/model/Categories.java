package ra.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Categories")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Categories {
    @Id
    @Column(name = "catalog_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int catalogId;
    @Column(name = "catalog_name", columnDefinition = "varchar(100)", nullable = false, unique = true)
    private String catalogName;
    //Nếu muốn tên column của bảng trùng với tên thuộc tính của lớp thì không cần sử dụng annotation @Column với tính name
    @Column(columnDefinition = "text")
    private String description;
    @Column(name = "catalog_status")
    private boolean status;
    //Categories - Product: 1-N
    /*
    * Fetch: LAZY, EAGER
    * OneToMany, OnetoOne: default LAZY
    * ManyToOne, ManyToMany: default EAGER
    * LAZY: Không lấy các dữ liệu entity liên quan, nhưng khi dùng các phương thức getListProducts thì lại lấy dữ liệu
    * EAGER: ấy các dữ liệu entity liên quan
    * */
    @OneToMany(mappedBy = "catalog",fetch = FetchType.EAGER)
    private List<Product> listProducts = new ArrayList<>();
}
