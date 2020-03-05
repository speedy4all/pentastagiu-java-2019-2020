package com.pentalog.pentastagiu.homework2.shop;

public class Customer {
    private int idCustomer;
    private String name;
    private Membership userMembership;

    public Customer(int idCustomer, String name, Membership userMembership) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.userMembership = userMembership;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer){
        this.idCustomer = idCustomer;
    }

    public enum Membership{
        GOLD,
        SILVER,
        NOMEMBERSHIP
    }

    public Membership getUserMembership() {
        return userMembership;
    }

    public void setUserMembership(Membership userMembership) {
        this.userMembership = userMembership;
    }
};
