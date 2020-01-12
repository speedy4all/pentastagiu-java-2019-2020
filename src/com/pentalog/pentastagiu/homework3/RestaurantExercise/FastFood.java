package com.pentalog.pentastagiu.homework3.RestaurantExercise;

public class FastFood extends Restaurant {

    @Override
    public double getTax() {
        int value = getIncome();
        return value * 0.2;
    }
}
