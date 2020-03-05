package com.pentalog.pentastagiu.homework2;

public class Product {
    private static int id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.id++;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
