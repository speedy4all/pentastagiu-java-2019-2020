package com.pentalog.pentastagiu.homework3.RestaurantExercise;

public class Application {
    public static void main(String[] args) {
        Restaurant firstFastFood=new FastFood();
        firstFastFood.setIncome(30);
        firstFastFood.setNumberOfGuests(10);
       firstFastFood.setPriceOfMenu(3);

        Restaurant firstVegetarian=new Vegetarian();
        firstVegetarian.setIncome(12);
        firstVegetarian.setNumberOfGuests(6);
        firstVegetarian.setPriceOfMenu(2);

        int guestsThatArrive=3;
        for(int i=0; i<guestsThatArrive;i++){
            firstFastFood.newGuest();
            firstVegetarian.newGuest();
        }
        System.out.println("The income of the fastfood is " + firstFastFood.getIncome() + " The tax that the fastfood has to pay is " + firstFastFood.getTax());
        System.out.println("The income of the vegetarian is " + firstVegetarian.getIncome() + " The tax that the fastfood has to pay is " + firstVegetarian.getTax());
    }
}
