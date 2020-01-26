package com.pentalog.pentastagiu.homework.module1.week3.Pb2;

public class ItemForSale {
    private float price;
    private String name;

    ItemForSale(int price, String name)
    {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(price < 0)
            return;
        this.price = price;
    }
}
