package com.pentalog.pentastagiu.homework2.Shop;

public class Customer {
    enum Status{
        SILVER, GOLD, NOMEMBERSHIP
    }
    private int id;
    private String name;
    private Status membership;

    public Customer(int id, String name, Status membership) {
        this.id = id;
        this.name = name;
        this.membership = membership;
    }

    public Status getMembership() {
        return membership;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", membership=" + membership +
                '}';
    }
}
