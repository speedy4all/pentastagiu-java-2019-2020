package com.pentalog.pentastagiu.homework2.shop;

import com.pentalog.pentastagiu.homework2.shop.customermembership.MembershipType;

public class Customer {
    private long id;
    private String name;
    private Basket basket;
    private MembershipType membershipType;

    public Customer(long id, String name, Basket basket, MembershipType membershipType) {
        this.id = id;
        this.name = name;
        this.basket = basket;
        this.membershipType = membershipType;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", basket=" + basket +
                ", membershipType=" + membershipType +
                '}';
    }
}
