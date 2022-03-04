package com.pentalog.pentastagiu.homework3.exercise2;

public class FastFoodRestaurant extends Restaurant implements Taxes{

    public void calculateTax(){
        tax = income * 2 / 10;
        System.out.println("The tax for the fast food restaurant is: " + tax + "$");
    }
}
