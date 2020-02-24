package com.pentalog.pentastagiu.homework2;

import java.text.DecimalFormat;

public class Basket {
    private double totalPrice;
    private Customer customer;
    DecimalFormat df = new DecimalFormat("##.##");

    public Basket(Customer customer){
        this.customer = customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void addProduct (Product product){
        totalPrice += product.getPrice();
       // System.out.println("The total price for the products is: " + totalPrice);
    }

    public void getFinalPrice(Customer customer) {
        switch (customer.getMembership()) {
            case GOLD:
                totalPrice = totalPrice - totalPrice * Customer.Membership.getDiscount(Customer.Membership.GOLD);
                System.out.println("You have to pay " + df.format(totalPrice) + " for this shopping");
                break;
            case SILVER:
                totalPrice -= totalPrice * Customer.Membership.getDiscount(Customer.Membership.SILVER);
                System.out.println("You have to pay " + df.format(totalPrice) + " for this shopping");
                break;
            default:
                totalPrice = totalPrice;
                System.out.println("No discount available for you! You must pay " + df.format(totalPrice));
                break;
        }
    }
}
