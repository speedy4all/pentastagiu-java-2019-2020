package com.pentalog.pentastagiu.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.prefs.BackingStoreException;

public class Customer {

    private Integer customerId;
    private String name;


    public enum Membership {
        GOLD(0.20),
        SILVER(0.10),
        NORMAL(0.0);

        private double discount;

        Membership(double discount) {
            this.discount = discount;
        }

        public double getDiscount() {
            return discount;
        }
    }
    private Membership membership;

    public Membership getMembership() {
        return membership;
    }


    public Customer(Integer customerId, String name, Membership membership) {
        this.membership = membership;
        this.customerId = customerId;
        this.name = name;
    }
}
