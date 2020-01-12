package com.pentalog.pentastagiu.homework3.RestaurantExercise;

public class Vegetarian extends Restaurant {

    @Override
    public double getTax() {
        int value = getIncome();
        return value * (0.2-(0.2 * 0.3));
    }


}
