package com.pentalog.pentastagiu.homework2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private Customer customer;
    private List<Product> products = new ArrayList<>();

    public Basket(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPriceAfterDiscount() {
        Membership membership = customer.getMembership();
        double priceBeforeDiscount = getPriceBeforeDiscount();
        double discount = priceBeforeDiscount * membership.getDiscount();

        return priceBeforeDiscount - discount;
    }

    public double getPriceBeforeDiscount() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Basket: " + "price before discount=" + getPriceBeforeDiscount() +
                ", price after discount=" + getTotalPriceAfterDiscount() + " " + customer;
    }
}
