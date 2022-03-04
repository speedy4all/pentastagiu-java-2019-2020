package com.pentalog.pentastagiu.week4.homework3.RestaurantApp;

public class FastFood extends Restaurant implements Imposable {

    public double fixedPriceMenu=12.50;
    private int numberOfCurrentGuests;


    public FastFood(int restaurantCapacity, int numberOfCurrentGuests) {
        super(restaurantCapacity);
        this.numberOfCurrentGuests = numberOfCurrentGuests;
    }

    public double incomeFromSale(){
        double income=numberOfCurrentGuests*fixedPriceMenu;
        System.out.println("The income from current customers is: "+income);
        return income;
    }

    @Override
    public double calculateTaxes() {
        return incomeFromSale()*20/100;
    }
}
