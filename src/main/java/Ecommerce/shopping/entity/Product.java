package Ecommerce.shopping.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cart")
@Getter
@Setter
public class Product {

  @Id
   private int id;
   private String product_name;
   private String product_color;
   private double product_price;
   private String product_type;

}
