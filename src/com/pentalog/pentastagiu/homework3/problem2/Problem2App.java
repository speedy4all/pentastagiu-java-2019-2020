package com.pentalog.pentastagiu.homework3.problem2;

public class Problem2App {

    public static void main(String[] args) {

        Restaurant veggy = new Restaurant(5,Type.VEGETARIAN);
        veggy.accomodateGuests(100);
        Restaurant fastFood = new Restaurant(5, Type.NORMAL);
        fastFood.accomodateGuests(100);

        System.out.println("Restaurant " + veggy.type +" has to pay taxes: " + veggy.calculateTaxes() + " for income: " + veggy.getIncome());
        System.out.println("Restaurant " + fastFood.type +" has to pay taxes: " + fastFood.calculateTaxes()+ " for income: " + fastFood.getIncome());

    }
}
