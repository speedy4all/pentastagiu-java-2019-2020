package com.pentalog.pentastagiu.homework2.Exercise2;

public class Basket {
    private double priceBeforeDiscount = 0;
    private double priceAfterDiscount = 0;
    private Customer customer;

    public Basket(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
        priceBeforeDiscount += product.getPrice();
    }

    public double getTotalPriceAfterDiscount() {
        Membership membership = customer.getMembership();
        double discount = 0;

        switch (membership) {
            case GOLD:
                discount = priceBeforeDiscount * 0.2;
                break;
            case SILVER:
                discount = priceBeforeDiscount * 0.1;
                break;
            case NO_MEMBERSHIP:
                discount = priceBeforeDiscount;
                break;
        }

        priceAfterDiscount = priceBeforeDiscount - discount;
        return priceAfterDiscount;
    }

    public double getPriceBeforeDiscount() {
        return priceBeforeDiscount;
    }

    @Override
    public String toString() {
        return "Basket: " + "price before discount=" + priceBeforeDiscount +
                ", price after discount=" + priceAfterDiscount + " " + customer;
    }
}
