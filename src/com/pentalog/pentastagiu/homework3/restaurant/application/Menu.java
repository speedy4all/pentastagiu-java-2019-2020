package com.pentalog.pentastagiu.homework3.restaurant.application;

public class Menu {

    private String type;
    private Double price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Menu(String type, Double price) {
        this.type = type;
        this.price = price;
    }
}
