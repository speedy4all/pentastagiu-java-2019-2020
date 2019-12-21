package com.pentalog.pentastagiu.homework2;

public class Candy extends Product {
    private int quantity;

    Candy(String name, int price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }
}
