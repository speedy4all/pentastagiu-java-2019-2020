package com.pentalog.pentastagiu.homework.module1.week3.Pb2;

public class Candy extends ItemForSale {
    private int quantity;

    Candy(int price, String name)
    {
        super(price, name);
    }

    Candy(int price, String name, int quantity)
    {
        super(price, name);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0)
            return;
        this.quantity = quantity;
    }
}
