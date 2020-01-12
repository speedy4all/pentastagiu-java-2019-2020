package com.pentalog.pentastagiu.homework2.exercise2;

public enum Membership {
    GOLD(0.2),
    SILVER(0.1),
    NO_MEMBERSHIP(1.0);

    private double discount;

    Membership(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
