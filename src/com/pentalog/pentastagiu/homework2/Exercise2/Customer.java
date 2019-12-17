package com.pentalog.pentastagiu.homework2.Exercise2;

public class Customer {
    private static int idCounter = 1;
    private int id;
    private String name;
    private Membership membership;

    public Customer(String name, Membership membership) {
        this.name = name;
        this.membership = membership;
        this.id = idCounter;
        idCounter++;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    @Override
    public String toString() {
        return "Customer: " + name;
    }
}
