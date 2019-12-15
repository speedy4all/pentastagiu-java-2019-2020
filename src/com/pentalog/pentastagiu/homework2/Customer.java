package com.pentalog.pentastagiu.homework2;

enum membershipStatus{
    GOLD,
    SILVER,
    NO_MEMBERSHIP
}
public class Customer {

    private int id;
    private String name;
    private membershipStatus status;

    public Customer(int id, String name, membershipStatus status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public membershipStatus getStatus() {
        return status;
    }

    public void setStatus(membershipStatus status) {
        this.status = status;
    }
}
