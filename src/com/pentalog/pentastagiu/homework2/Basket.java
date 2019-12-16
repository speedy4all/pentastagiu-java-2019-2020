package com.pentalog.pentastagiu.homework2;

public class Basket {

    private Customer user;
    private double totalPrice;

    public Basket(Customer user) {
        this.user = user;
    }

    public double getTotalPrice() {

        double discount = 0;
        switch(user.getMembership()) {
            case SILVER:
                discount = 0.1;
                break;
            case GOLD:
                discount = 0.2;
                break;
            case PLATINUM:
                discount = 0.4;
                break;
            default:
                discount = 0;
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

