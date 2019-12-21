package com.pentalog.pentastagiu.homework2;

import static com.pentalog.pentastagiu.homework2.Membership.NONE;

public class Customer {
    private int id;
    private String name;
    private Membership membership;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.membership = NONE;
    }

    public Customer(int id, String name, Membership membership) {
        this(id, name);
        this.membership = membership;
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

    public double getDiscount() {
        switch (this.membership) {
            case GOLD:
                return 0.8;
            case SILVER:
                return 0.9;
            default:
                return 1;
        }
    }
}
