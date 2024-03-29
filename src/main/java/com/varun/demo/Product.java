package com.varun.demo;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "products")
public class Product {

    @Id
    private String id;

    private String name;
    private double price;

    // Constructors, getters, setters, etc.

    public Product() {
        // Default constructor for MongoDB
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}  