package com.pentalog.pentastagiu.homework2;

public class Customer {
    private static int id;
    private String name;
    private String membership;

    public Customer(String name) {
        this.id++;
        this.name = name;
        this.membership = "no membership";
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }
}
