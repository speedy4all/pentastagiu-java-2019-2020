package com.pentalog.pentastagiu.homework2;

public class Candy extends Product{
    private double quantity;

    public Candy(String name, double price, double quantity) {
        super(name, price);
        if (quantity <= 0) {
            throw new IllegalArgumentException("Invalid quantity!");
        }
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Invalid quantity!");
        }
        this.quantity = quantity;
    }
}
