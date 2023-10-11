package Ecommerce.shopping.appRepository;

import Ecommerce.shopping.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRespository extends CrudRepository<Product,Integer> {
}
