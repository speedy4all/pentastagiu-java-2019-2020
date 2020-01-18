package com.pentalog.pentastagiu.homework3.ex2;

public class FastFoodRestaurant extends Restaurant{
    public void calculateTax(){
        tax=0.2*income;
        System.out.println("The tax for the fast food restaurant is "+ tax + "lei");
    }
}
