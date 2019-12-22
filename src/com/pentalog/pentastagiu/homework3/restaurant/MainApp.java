package com.pentalog.pentastagiu.homework3.restaurant;

public class MainApp {
    public static void main(String[] args) {
        FastFoodRestaurant fast1=new FastFoodRestaurant(10);
        fast1.accommodateGuest(5);
        System.out.println("FastFood Restaurant");
        System.out.println(fast1.getTotalNumberOfGuest());
        fast1.calculateIncomeAndTaxes();

        VegetarianRestaurant veg1=new VegetarianRestaurant(10);
        veg1.accommodateGuest(5);
        System.out.println("Vegetarian Restaurant");
        System.out.println(veg1.getTotalNumberOfGuest());
        veg1.calculateIncomeAndTaxes();

    }
}
