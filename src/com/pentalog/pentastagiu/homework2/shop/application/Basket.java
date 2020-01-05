package com.pentalog.pentastagiu.homework2.shop.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Basket {
    private Double totalPrice;
    private Customer customer;
    private HashMap<Integer, Product> basket = new HashMap<Integer, Product>();

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /* Basket: what does it have?: total price and a Customer(in this way each customer can add products
     to his basket and ask for info about the price he has to pay)
	what can it do? → update the total price each time a product is added to the basket, get total price
	 that a customer has to pay, based on the type of membership he has
    */
    public HashMap<Integer, Product> addProduct(Integer quantity, Product product) {
        basket.put(quantity, product);
        return basket;
    }

    public Double returnTotalPrice(HashMap<Integer, Product> basket) {
        for (Integer key: basket.keySet()) {
            if(customer.getMembershipType() == Customer.Membership.GOLD) {
                totalPrice += (basket.get(key).getPrice() * 0.2 * key);
            } else if (customer.getMembershipType() == Customer.Membership.SILVER) {
                totalPrice += (basket.get(key).getPrice() * 0.1 * key);
            } else {
                totalPrice += (basket.get(key).getPrice() * key);
            }
        }
        return totalPrice;
    }

    public Basket(Double totalPrice, Customer customer, HashMap<Integer, Product> basket) {
        this.totalPrice = totalPrice;
        this.customer = customer;
        this.basket = basket;
    }
}
