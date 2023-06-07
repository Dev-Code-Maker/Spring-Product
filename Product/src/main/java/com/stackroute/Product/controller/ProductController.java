package com.stackroute.Product.controller;

import com.stackroute.Product.model.Product;
import com.stackroute.Product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Mark as Rest Controller
@RestController
public class ProductController {

    // Autowire ProductService class
    // Autowire annotation
    // Create a method to save product
    // Create a method to get all products

    @Autowired
    private ProductService productService;

    // Post mapping to get product and store it in database
    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    // Get mapping to get all products
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
