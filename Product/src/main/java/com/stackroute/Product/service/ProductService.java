package com.stackroute.Product.service;

import com.stackroute.Product.model.Product;
import com.stackroute.Product.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Mark as service class
@Service
public class ProductService {

    // Autowire ProductRepo class
    // Autowire annotation
    @Autowired
    private ProductRepo productRepo;

    // Create a method to save product
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    // Create a method to get all products
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
}
