package com.tutorial.crudmongoback.CRUD.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class ProductDto {
    @NotBlank(message = "Error, Entering the category is required")
    private String category;
    @NotBlank(message = "Error, Entering the name is required")
    private String name;
    @Min(value = 1, message = "Error, entering the price is required")
    private int price;

    public ProductDto() {
    }

    public ProductDto(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory(){return  category;}

    public void setCategory(String category) {this.category = category;}


}
