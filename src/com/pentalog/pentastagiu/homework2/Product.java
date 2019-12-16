package com.pentalog.pentastagiu.homework2;

public class Product {

    private String name;
    private int ID;
    private double price;

    public Product (String name, int ID, double price) {
        this.name = name;
        this.ID = ID;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice() {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

}
