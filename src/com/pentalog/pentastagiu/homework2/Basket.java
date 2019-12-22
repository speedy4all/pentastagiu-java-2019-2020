package com.pentalog.pentastagiu.homework2;

public class Basket {
    private double totalPrice;
    Customer customer;

    public Basket(){

    }

    public Basket(Customer customer){
        this.customer = customer;
    }
    public Basket(double totalPrice, Customer customer) {
        this.totalPrice = totalPrice;
        this.customer = customer;
    }

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

    public void addProducts (double pricePerItem){
        totalPrice += pricePerItem;
        //System.out.println("The total price for the products is: " + totalPrice);
    }

    public void getFinalPrice(String membership) {
        Customer.Membership membershipType = Customer.Membership.valueOf(membership);
        switch (membershipType) {
            case GOLD:
                totalPrice = totalPrice - totalPrice * 0.2;
                System.out.println("You have to pay " + totalPrice + " for this shopping");
                break;
            case SILVER:
                totalPrice -= totalPrice * 0.1;
                System.out.println("You have to pay " + totalPrice + " for this shopping");
                break;
            case WITHOUT:
                totalPrice = totalPrice;
                System.out.println("No discount available for you! You must pay " + totalPrice);
                break;
            default:
                System.out.println("Invalid type of membership.");
        }
    }
}
