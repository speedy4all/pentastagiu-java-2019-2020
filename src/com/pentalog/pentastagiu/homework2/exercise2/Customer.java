package com.pentalog.pentastagiu.homework2.exercise2;

public class Customer {
    private static int idCounter = 1;
    private int id;
    private String name;
    private Membership membership;

    public Customer(String name, Membership membership) {
        this.name = name;
        this.id = idCounter;
        idCounter++;
        setMembership(membership);
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        if (this.membership == null) {
            throw new IllegalArgumentException("Membership can not be null.");
        }
        this.membership = membership;
    }

    @Override
    public String toString() {
        return "Customer: " + name;
    }
}
