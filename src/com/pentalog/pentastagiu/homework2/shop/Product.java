package com.pentalog.pentastagiu.homework2.shop;

public class Product {
    private static int idCounter;
    protected int id;
    protected String name;
    protected float price;

    Product(String name, float price) {
        if (price < 0)
            throw new IllegalArgumentException("Price must be at least 0");
        id = ++idCounter;
        this.name = name;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price >= 0)
            this.price = price;
    }

}
