package com.pentalog.pentastagiu.homework2;

public class Candy extends Product {

    private Double quantity;
    private String assortment;

    public Double getQuantity() {
        return quantity;
    }

    public String getAssortment() {
        return assortment;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public void setAssortment(String assortment) {
        this.assortment = assortment;
    }

    public Candy(Integer productId, String prodName, Double price, Shop shop, Double quantity, String assortment) {
        super(productId, prodName, price, shop);
        this.quantity = quantity;
        this.assortment = assortment;
    }
}
