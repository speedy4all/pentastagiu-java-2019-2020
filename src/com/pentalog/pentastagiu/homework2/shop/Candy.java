package com.pentalog.pentastagiu.homework2.shop;

public class Candy extends Product {
    private int quantity;

    public Candy(String name, float price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    public float getPrice() {
        return price / 1000 * quantity;
    }
}
