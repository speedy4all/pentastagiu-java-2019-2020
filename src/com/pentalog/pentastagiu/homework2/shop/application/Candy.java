package com.pentalog.pentastagiu.homework2.shop.application;

public class Candy extends Product {
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Candy(Integer id, String name, Double price, Integer quantity) {
        super(id, name, price);
        this.quantity = quantity;
    }
}
