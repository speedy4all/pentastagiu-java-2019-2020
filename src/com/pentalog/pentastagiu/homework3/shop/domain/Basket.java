package com.pentalog.pentastagiu.homework3.shop.domain;

public class Basket {
    private double totalPrice;

    private Customer customer;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Basket:" +
                "Customer: "+ customer +
                "Total Price: " + totalPrice;
    }
}
