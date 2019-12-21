package com.pentalog.pentastagiu.homework2.ex2;

public class Candy extends Product
{
    int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Candy(int id, String name, int price) {
        super(id, name, price);

    }
}
