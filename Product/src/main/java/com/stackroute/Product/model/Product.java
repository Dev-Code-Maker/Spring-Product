package com.stackroute.Product.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// Mark this class as an entity
// Define a table name in the database
// Define the primary key
// Define the columns of the table
@Entity
@Table(name = "product")
public class Product {

    // Declare a product entity with variables such as id, name, description, quality
    @Id
    private int id;
    private String name;
    private String description;
    private int quantity;

    // default constructor
    public Product() {
    }

    // parameterized constructor
    public Product(int id, String name, String description, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    // Generate getters and setters for the above variables
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String productName) {
        this.name = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String productDescription) {
        this.description = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int productQuantity) {
        this.quantity = productQuantity;
    }

}
