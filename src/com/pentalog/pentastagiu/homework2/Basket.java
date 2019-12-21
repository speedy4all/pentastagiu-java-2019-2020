package com.pentalog.pentastagiu.homework2;

public class Basket {
    private double price;
    private Customer customer;

    public Basket(Customer customer) {
        this.customer = customer;
        this.price = 0;
    }

    public void addProduct(Product product) {
        this.price += product.getPrice();
    }

    public double getPrice() {
        return this.price  * this.customer.getDiscount();
    }
}
