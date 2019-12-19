package com.pentalog.pentastagiu.homework2.shop;

public class Candy extends Product {
    private int quantity;
    private double price;

    public Candy(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
