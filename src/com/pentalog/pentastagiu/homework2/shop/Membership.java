package com.pentalog.pentastagiu.homework2.shop;

public enum Membership {
    DEFAULT(0), SILVER(10), GOLD(20);

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    private int discountPercentage;

    private Membership(int p_discountPercentage){
        discountPercentage = p_discountPercentage;
    }

}
