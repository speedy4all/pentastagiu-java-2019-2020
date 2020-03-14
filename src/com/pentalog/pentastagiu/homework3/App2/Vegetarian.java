package com.pentalog.pentastagiu.homework3.App2;

public class Vegetarian extends Restaurant {
    private double tax;
    private double discount;
    public double calculateTaxes(){
        tax = getIncome() * 0.2;
        discount = tax * 0.3;
        tax = tax - discount;
        return tax;
    }
}
