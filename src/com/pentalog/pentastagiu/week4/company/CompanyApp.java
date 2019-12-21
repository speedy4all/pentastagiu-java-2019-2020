package com.pentalog.pentastagiu.week4.company;

public class CompanyApp {

    public static void main(String[] args) {
        // polymorphism applies also to interfaces:
        // declare a reference of interface type(Imposable) that references an implementation type (Freelancer)
        // at runtime it knows to identify the actual type of object(Freelancer) and it calls the method as expected
        Imposable employee1 = new Freelancer();
        System.out.println("Imposit taken from a freelancer: " + employee1.calculateImposit());
    }
}
