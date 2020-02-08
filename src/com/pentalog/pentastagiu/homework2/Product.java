package com.pentalog.pentastagiu.homework2;

public abstract class Product {
    private static int counter = 1;
    private int id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.id = counter++;
        this.name = name;
        if (price <= 0.5) {
            throw new IllegalArgumentException("The price must be greater than 0.5.");
        }
        this.price = price;
    }

    public int getId() {
        return id;
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
        if (price <= 0.5) {
            throw new IllegalArgumentException("The price must be greater than 0.5.");
        }
        this.price = price;
    }
}
