package com.pentalog.pentastagiu.homework2;

public class Candy extends Product {
    private int quantity;

    public Candy(int id, String name, double price, int quantity) {
        super(id, name, price);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
