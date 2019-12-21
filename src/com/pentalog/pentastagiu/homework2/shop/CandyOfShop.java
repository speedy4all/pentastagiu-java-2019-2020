package com.pentalog.pentastagiu.homework2.shop;

public class CandyOfShop extends ItemsOnSale {

    private double quantity;

    public CandyOfShop(double price, double quantity) {
        super(price);
        this.quantity = quantity;
    }

    public double pricePerQuantity(double price, double quantity){
        double newPrice= price/1000*quantity;
        return newPrice ;
    }
}
