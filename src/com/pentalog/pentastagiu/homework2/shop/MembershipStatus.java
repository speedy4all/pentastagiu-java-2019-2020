package com.pentalog.pentastagiu.homework2.shop;

public enum MembershipStatus {
    GOLD(0.20),
    SILVER(0.10),
    NO_MEMBERSHIP(0.00);


    private Double discountMembership;

    //constructor
    MembershipStatus(Double discountMembership) {
        this.discountMembership=discountMembership;
    }

    //getters and setters
    public Double getDiscountMembership() {
        return discountMembership;
    }

    public void setDiscountMembership(Double discountMembership) {
        this.discountMembership = discountMembership;
    }

}
