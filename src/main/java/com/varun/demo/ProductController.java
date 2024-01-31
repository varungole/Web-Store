package com.varun.demo;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @GetMapping
    public List<Product> getProduct()
    {
        return productService.getAllProducts();
    }
    
    @PostMapping
    public Product saveProduct(@RequestBody Product product)
    {
       return productService.saveProduct(product);
    }
}
