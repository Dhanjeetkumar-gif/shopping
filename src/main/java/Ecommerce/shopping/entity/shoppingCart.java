package Ecommerce.shopping.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.yaml.snakeyaml.events.Event;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cart")
@Getter
@Setter
public class shoppingCart {

  @Id
   private int id;
   private String color;
   private double price;
   private String tag;

}
