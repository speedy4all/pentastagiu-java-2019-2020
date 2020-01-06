package com.pentalog.pentastagiu.week4.homework3.RestaurantApp;

public class VegetarianRestaurant extends Restaurant implements Imposable{
   private double fixedPriceMenu=22.00;
   public int numberOfCurrentGuests;
   private double discountForTaxes=30/100;

    public VegetarianRestaurant(int restaurantCapacity, int numberOfCurrentGuests) {
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
        double discount=incomeFromSale()*discountForTaxes;

        return incomeFromSale()*20/100-discount;
    }
}
