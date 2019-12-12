package com.pentalog.pentastagiu.homework2.problema2;

public class Candy extends Product {
    private int quantity;

    public Candy(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
