package com.pentalog.pentastagiu.homework3.exercise2;

public class VegetarianRestaurant extends Restaurant implements Taxes{
    private double taxWithDiscount;
    public void calculateTax(){
        tax = income * 2 / 10;
        taxWithDiscount = tax * 7 / 10;
        System.out.println("The tax for the vegetarian restaurant is: " + taxWithDiscount + "$");

    }
}
