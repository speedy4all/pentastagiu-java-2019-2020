package com.pentalog.pentastagiu.homework2;

public class Customer {

    private int id;
    private String name;
    private Tier membership;

    public Customer (int id, String name, Tier membership) {
        this.id = id;
        this.name = name;
        this.membership = membership;
    }

    public Tier getMembership() {
        return membership;
    }

    public void setMembership() {
        this.membership = membership;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer name: " + getName() +
                "\nID: " + getId() +
                "\nMemberShip tier: " + getMembership();
    }





    enum Tier {
        SILVER,
        GOLD,
        PLATINUM
    }
}
