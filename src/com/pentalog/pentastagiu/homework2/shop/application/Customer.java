package com.pentalog.pentastagiu.homework2.shop.application;

public class Customer {
    private Integer id;
    private String name;
    private Membership membershipType;

    public enum Membership {
        GOLD,
        SILVER,
        NOMEMBERSHIP };

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Membership getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(Membership membershipType) {
        this.membershipType = membershipType;
    }

    public Customer(Integer id, String name, Membership membershipType) {
        this.id = id;
        this.name = name;
        this.membershipType = membershipType;
    }
}
