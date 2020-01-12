package com.pentalog.pentastagiu.homework2.exercise2;

public class Product {
    private static int idCounter = 1;
    private int id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.id = idCounter;
        idCounter++;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product: " + name + " " + price;
    }
}
