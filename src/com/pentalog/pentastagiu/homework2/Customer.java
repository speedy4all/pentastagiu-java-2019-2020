package com.pentalog.pentastagiu.homework2;

public class Customer {
    private static int counterCustomer = 1;
    private int id;
    private String name;
    private Membership membership;
    public enum Membership {
        GOLD,
        SILVER,
        WITHOUT;

        private static double discount;

        public static double getDiscount(Membership membership) {
            switch (membership) {
                case GOLD:
                    discount = 0.2;
                    return discount;
                case SILVER:
                    discount = 0.1;
                    return discount;
                default:
                    discount = 0;
                    return discount;
            }
        }
    }

    public Customer(){}
    public Customer(String name, Membership membership) {
        this.id = counterCustomer++;
        this.name = name;
        this.membership = membership;
    }

    public int getId() {
        return id;
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
}
