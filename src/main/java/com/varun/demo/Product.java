package com.varun.demo;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "products")
public class Product {
    
    @Id //primary key
    private String id;

    private String name;
    private double price;

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

}   
