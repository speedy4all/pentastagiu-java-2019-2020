package com.pentalog.pentastagiu.homework3.ex2;

public class VegetarianRestaurant extends Restaurant{
    public void calculateTax() {
        tax=(0.2*income)*0.7;
        System.out.println("The tax for the vegetarian restaurant is "+tax+" lei");
    }
}
