package com.pentalog.pentastagiu.homework2.Shop;

public class Basket {
    private Customer customer;
    private double totalPrice;

    public Basket(Customer customer) {
        this.customer = customer;
    }

    public double getTotalPrice() {

        double discount = 0;
        switch(customer.getMembership()) {
            case NOMEMBERSHIP:
                discount = 0.0;
                break;
            case SILVER:
                discount = 0.1;
                break;
            case GOLD:
                discount = 0.2;
                break;
        }

        double reducedPrice = totalPrice - totalPrice*discount;
        return reducedPrice;

    }

    public void UpdatePrice(double price) {
        totalPrice = totalPrice + price;
    }

    public void Add(Product product) {
        this.UpdatePrice(product.getPrice());
    }
}
