package com.tutorial.crudmongoback.CRUD.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {

    @Id
    private int id;
    private String name;
    private int price;
    private String category;

    public Product() {
    }

    public Product(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category= category;
    }

    //Todos de Id
    public int getId() {
        return id;
    }
    public void setId(int id) {this.id = id;}

    //Todos de name
    public String getName() {
        return name;
    }
    public void setName(String name) {this.name = name;}

    //Todos de price
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {this.price = price;}

   //Todos de category
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {this.category = category;}
}