package com.pentalog.pentastagiu.homework2.shop;

public class Product {
    protected int id;
    protected String name;
    protected int price;

    public Product() {

    }

    public int getPrice(){
        return this.price;
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


}
