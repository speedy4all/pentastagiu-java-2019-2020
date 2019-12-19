package com.pentalog.pentastagiu.homework2_bookCandyShop;

public class Candy extends Product{
    private Double quantity;

    //constructors
    public Candy() {
    }
    public Candy(String productId, String productName, Double price, Double quantity) {
        super(productId, productName, price);
        this.quantity = quantity;
    }

    //getters and setters
    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "quantity=" + quantity +
                '}';
    }
}
