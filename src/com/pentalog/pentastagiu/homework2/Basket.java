package com.pentalog.pentastagiu.homework2;

public class Basket {
    private double totalPrice;
    private Customer customer;

    public Basket(Customer customer) {
        this.totalPrice = 0;
        this.customer = customer;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
