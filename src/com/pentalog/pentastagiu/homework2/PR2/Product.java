package com.pentalog.pentastagiu.homework2.PR2;

public class Product {
    int id;
    String name; ///default definition
    int price;
    int quantity; ///this quantity refers the number of items from the same product in the inventory

    public Product()
    {}
    public Product(int id,String name,int price,int quantity)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "#" + id + "- " + name + " at the price of " + price + " lei. Available items: " + quantity;

    }

    public String toString1() {
        return name + " at the price of " + price + " lei. ";

    }

}
