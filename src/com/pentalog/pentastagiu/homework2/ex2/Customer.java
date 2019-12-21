package com.pentalog.pentastagiu.homework2.ex2;

public class Customer {
    int id;
    String name;
   String membership;

    public Customer(int id, String name, String membership) {
        this.id = id;
        this.name = name;
        this.membership = membership;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }
    public void modifygold(String membership)
    {

        this.membership=  "GOLD";
    }
    public void modifysilver(int price)
    {
        this.membership="SILVER";
    }
}
