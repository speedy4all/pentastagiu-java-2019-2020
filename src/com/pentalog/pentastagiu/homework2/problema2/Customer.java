package com.pentalog.pentastagiu.homework2.problema2;

public class Customer {
    private static int id = 0;
    private String name;
    private Status membership;

    public Customer(String name, Status membership) {
        id++;
        this.name = name;
        this.membership = membership;
    }

    public Status getMembership() {
        return membership;
    }

    public void setMembership(Status membership) {
        this.membership = membership;
    }
}
