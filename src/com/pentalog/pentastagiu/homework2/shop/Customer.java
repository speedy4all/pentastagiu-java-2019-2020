package com.pentalog.pentastagiu.homework2.shop;

import java.sql.SQLOutput;

public class Customer {
    public enum Membership{
        GOLD,
        SILVER,
        NOMEMBERSHIP
    }

    private static int id=0;
    private String name;
    private Membership membership;

    public Customer(String name, Membership membership) {
        this.name = name;
        this.membership = membership;
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", membership=" + membership +
                '}';
    }
}
