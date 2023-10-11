package Ecommerce.shopping.controller;


import Ecommerce.shopping.appRepository.ProductRespository;
import Ecommerce.shopping.entity.Product;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shopping")
public class ProductController {


    @Autowired
    ProductRespository productRespository;
    @PostMapping(value = "/product")
    public Product addProduct(@Valid @RequestBody Product product){
      return productRespository.save(product);

    }

    @GetMapping("/product/allProducts")
    public List<Product> getAllProducts(){
        List<Product> allprods=   new ArrayList<>();
        Iterable<Product> it=productRespository.findAll();
        it.forEach(allprods::add);
        return allprods;
    }
    public void deleteProduct()


}
