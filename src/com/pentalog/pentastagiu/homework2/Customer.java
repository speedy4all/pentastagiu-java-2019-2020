package com.pentalog.pentastagiu.homework2;

public class Customer {
    private int id;
    private String name;
    private Basket basket;

    private static enum membership {GOLD, SILVER};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String name, Basket basket) {
        this.id++;
        this.name = name;
        this.basket = basket;
    }
}
