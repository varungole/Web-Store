package com.varun.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //A table in relational database
public class Product {
    
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // create unique identity
    private Long id;

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