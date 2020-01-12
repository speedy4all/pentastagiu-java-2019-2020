package com.pentalog.pentastagiu.homework3.App2;

public class RestaurantApp {
    public static void main(String[] args) {
        Vegetarian vegetarian = new Vegetarian();
        FastFood fastFood = new FastFood();

        System.out.println("Vegetarian restaurant income: " + vegetarian.calculateNewIncome(12) + ", the tax it has to pay to the local authorities " + vegetarian.calculateTaxes());
        System.out.println("Fast food restaurant income: " + fastFood.calculateNewIncome(10) + ", the tax it has to pay to the local authorities " + fastFood.calculateTaxes());
    }
}
