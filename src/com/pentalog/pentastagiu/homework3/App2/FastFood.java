package com.pentalog.pentastagiu.homework3.App2;

public class FastFood extends Restaurant {
    private double tax;

    public double calculateTaxes(){
        tax = getIncome() * 0.2;
        return tax;
    }
}
