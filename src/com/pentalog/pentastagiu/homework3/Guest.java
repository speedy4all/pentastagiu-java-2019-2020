package com.pentalog.pentastagiu.homework3;

public class Guest {

    static int VEGETARIAN_GUESTS_NO;
    static int FAST_FOOD_GUESTS_NO;

    private double consumption;
    private String guestType;

    public Guest(double consumption, String guestType) {
        this.consumption = consumption;
        this.guestType = guestType;
        if(guestType.toLowerCase().equals("vegetarian"))
            VEGETARIAN_GUESTS_NO++;
        else
            FAST_FOOD_GUESTS_NO++;
    }

    public double getConsumption() {
        return consumption;
    }
}
