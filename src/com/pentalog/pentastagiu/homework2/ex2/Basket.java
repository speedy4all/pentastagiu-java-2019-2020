package com.pentalog.pentastagiu.homework2.ex2;

public class Basket {
    int totalprice;
    Customer customer;

    public Basket(int totalprice, Customer customer) {
        this.totalprice = totalprice;
        this.customer = customer;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
