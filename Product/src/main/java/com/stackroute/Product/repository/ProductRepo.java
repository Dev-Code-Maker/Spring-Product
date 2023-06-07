package com.stackroute.Product.repository;

import com.stackroute.Product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Mark as Repository interface
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
