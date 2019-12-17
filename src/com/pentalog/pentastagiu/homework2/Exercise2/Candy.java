package com.pentalog.pentastagiu.homework2.Exercise2;

public class Candy extends Product {
    private int quantity;

    public Candy(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Candy: " + super.getName() + " " + super.getPrice() + " " + quantity;
    }
}
