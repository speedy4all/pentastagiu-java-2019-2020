package com.pentalog.pentastagiu.homework3.ex2;

public class Candy extends Product {
    private float quantity;

    public Candy(int id, String name, double price, float quantity) {
        super(id, name, price);
        this.quantity = quantity;
    }
}

