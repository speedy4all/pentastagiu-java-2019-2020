package com.pentalog.pentastagiu.homework2;

public class Candy extends Product {

    private double quantity;

    public Candy(String name, int ID, double price, double quantity) {
        super(name, ID, price);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;

    }


    @Override

    public String toString() {
        return "Candy name: " + getName() +
                " \nID: " + getID() +
                "\nPrice: " + getPrice() +
                "\nQuantity: " + getQuantity();
    }
}

