package com.pentalog.pentastagiu.homework2.Shop;


import com.pentalog.pentastagiu.homework2.Shop.CustomerMembership.MembershipType;

public class Basket {
    private int totalPrice;
    private Customer customer;

    public Basket(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {

        totalPrice += product.getPrice();
    }


    public int getTotalPrice() {
        MembershipType membershipType = customer.getMembershipType();
        int finalPrice = 0;
        switch (membershipType) {
            case GOLD:
                finalPrice += totalPrice - totalPrice * 20 / 100;
                break;
            case SILVER:
                finalPrice += totalPrice - totalPrice * 10 / 100;
                break;
            default:
                finalPrice += totalPrice;

        }
        return finalPrice;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    @Override
    public String toString() {
        return "Basket{" +
                "totalPrice=" + totalPrice +
                ", customer=" + customer +
                '}';
    }
}
