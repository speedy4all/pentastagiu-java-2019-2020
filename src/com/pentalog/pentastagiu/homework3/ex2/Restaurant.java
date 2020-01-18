package com.pentalog.pentastagiu.homework3.ex2;

public class Restaurant {
    protected int numberOfGuests=0;
    protected double income=0;
    protected double tax=0;
    double menuPrice=13;
    public void accomodateNewGuests(int numberOfNewGuests) {
        numberOfGuests=numberOfGuests+numberOfNewGuests;
        while (numberOfNewGuests!=0) {
            income = income+menuPrice;
            numberOfNewGuests--;
        }
        System.out.println("The income is: "+ income + "lei");


    }
}
