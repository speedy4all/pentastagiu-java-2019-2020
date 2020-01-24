package com.pentalog.pentastagiu.homework3.restaurant;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        VegetarianRestaurant vegetarianRestaurant=new VegetarianRestaurant();
        FastFoodRestaurant fastFoodRestaurant=new  FastFoodRestaurant();
        Scanner scan=new Scanner(System.in);



        Integer currentNumberOfVegetarianRestaurantGuests;
        Integer currentNumberOfFastFoodRestaurantGuests;
        Integer userChoice;
        Double incomesFastFoodRestaurant;
        Double incomesVegetarianRestaurant;
        Boolean addNewGuest=true;
        Double newGuestMenuPrice;
        Double guestTotalOrder=0.00;
        Integer quantity;
        Integer orderMore=1;
        Double guestNewOrder=0.00;
        Double taxFastFoodRestaurant;
        Double taxVegetarianRestaurant;

        //set current number of guests for restaurants
        vegetarianRestaurant.getGuest().setCurrentNumberOGuests(10);
        fastFoodRestaurant.getGuest().setCurrentNumberOGuests(15);

        //set current total incomes for restaurants
        vegetarianRestaurant.setRestaurantIncomes(2500.00);
        fastFoodRestaurant.setRestaurantIncomes(3200.00);

		/*
		fastFoodRestaurant.getGuests().setAddNewGuest(addNewGuest);
		System.out.println(fastFoodRestaurant.getGuests().calculateTotalNumberOfGuests());

		*/

        System.out.println("Enter the restaurant you want to manage\n1 - FAST FOOD RESTAURANT\n2 - VEGETARIAN RESTAURANT");
        userChoice=scan.nextInt();

        //FAST FOOD RESTAURANT OPERATIONS
        if(userChoice==1) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("FAST FOOD RESTAURANT");
            currentNumberOfFastFoodRestaurantGuests=fastFoodRestaurant.getGuest().getCurrentNumberOGuests();
            System.out.println("The fast food restaurant has currently " + currentNumberOfFastFoodRestaurantGuests + " guests ");
            incomesFastFoodRestaurant=fastFoodRestaurant.getRestaurantIncomes();
            System.out.println("The fast food restaurant has currently an income of " + incomesFastFoodRestaurant);

            System.out.println("--------------------------------------------------------------");
            System.out.println("New guest has arrived?\n1 - YES\n2 - NO");
            userChoice=scan.nextInt();
            while(userChoice==1) {
                fastFoodRestaurant.getGuest().setAddNewGuest(addNewGuest);
                System.out.println("New guest added!");
                System.out.println("--------------------------------------------------------------");
                while(orderMore==1) {
                    System.out.println("Choose what you want to order from the menu");
                    System.out.println("--------------------------------------------------------------");
                    fastFoodRestaurant.displayTheMenu();
                    System.out.println("--------------------------------------------------------------");
                    userChoice=scan.nextInt();
                    newGuestMenuPrice=fastFoodRestaurant.selectMenu(userChoice);
                    System.out.println("Enter the quantity");
                    quantity=scan.nextInt();
                    guestNewOrder+=fastFoodRestaurant.guestTotalOrderPrice(newGuestMenuPrice, quantity);
                    guestTotalOrder+=guestNewOrder;
                    System.out.println("Current guest order price: " + guestTotalOrder);
                    System.out.println("Do you want to order more?\n1 - YES\n2 - NO");
                    orderMore=scan.nextInt();
                    incomesFastFoodRestaurant=fastFoodRestaurant.calculateTotalRestaurantIncomes(guestNewOrder);
                    guestNewOrder=0.00;
                }
                System.out.println("New guest has arrived?\n1 - YES\n2 - NO");
                userChoice=scan.nextInt();
                orderMore=1;
                guestTotalOrder=0.00;

                System.out.println("--------------------------------------------------------------");
                currentNumberOfFastFoodRestaurantGuests=fastFoodRestaurant.getGuest().getCurrentNumberOGuests();
            }
            taxFastFoodRestaurant=fastFoodRestaurant.calculatingTaxes(incomesFastFoodRestaurant);
            System.out.println("The fast food restaurant has currently " + currentNumberOfFastFoodRestaurantGuests + " guests ");
            System.out.println("The fast food restaurant has  a total  income of " + incomesFastFoodRestaurant );
            System.out.println("The fast food restaurant has to pay to the authorities a tax of " + taxFastFoodRestaurant);


            //VEGETARIAN RESTAURANT OPERATIONS
        }else if(userChoice==2) {
            System.out.println("VEGETARIAN RESTAURANT");
            currentNumberOfVegetarianRestaurantGuests=vegetarianRestaurant.getGuest().getCurrentNumberOGuests();
            System.out.println("The vegetarian  restaurant has currently " + currentNumberOfVegetarianRestaurantGuests + " guests ");
            incomesVegetarianRestaurant=vegetarianRestaurant.getRestaurantIncomes();
            System.out.println("The vegetarian restaurant has currently an income of " + incomesVegetarianRestaurant);

            System.out.println("--------------------------------------------------------------");
            System.out.println("New guest has arrived?\n1 - YES\n2 - NO");
            userChoice=scan.nextInt();
            while(userChoice==1) {
                vegetarianRestaurant.getGuest().setAddNewGuest(addNewGuest);
                System.out.println("New guest added!");
                System.out.println("--------------------------------------------------------------");
                while(orderMore==1) {
                    System.out.println("Choose what you want to order from the menu");
                    System.out.println("--------------------------------------------------------------");
                    vegetarianRestaurant.displayTheMenu();
                    System.out.println("--------------------------------------------------------------");
                    userChoice=scan.nextInt();
                    newGuestMenuPrice=vegetarianRestaurant.selectMenu(userChoice);
                    System.out.println("Enter the quantity");
                    quantity=scan.nextInt();
                    guestNewOrder+=vegetarianRestaurant.guestTotalOrderPrice(newGuestMenuPrice, quantity);
                    guestTotalOrder+=guestNewOrder;
                    System.out.println("Current guest order price: " + guestTotalOrder);
                    System.out.println("Do you want to order more?\n1 - YES\n2 - NO");
                    orderMore=scan.nextInt();
                    incomesVegetarianRestaurant=vegetarianRestaurant.calculateTotalRestaurantIncomes(guestNewOrder);
                    guestNewOrder=0.00;
                }
                System.out.println("New guest has arrived?\n1 - YES\n2 - NO");
                userChoice=scan.nextInt();
                orderMore=1;
                guestTotalOrder=0.00;
                System.out.println("--------------------------------------------------------------");
                currentNumberOfVegetarianRestaurantGuests=vegetarianRestaurant.getGuest().getCurrentNumberOGuests();
            }
            taxVegetarianRestaurant=vegetarianRestaurant.calculatingTaxes(incomesVegetarianRestaurant);

            System.out.println("The vegetarian restaurant has currently " + currentNumberOfVegetarianRestaurantGuests + " guests ");
            System.out.println("The vegetarian restaurant has  a total  income of " + incomesVegetarianRestaurant );
            System.out.println("The vegetarian restaurant has to pay to the authorities a tax of " + taxVegetarianRestaurant);

        }else {
            System.out.println("Unknown restaurant");
        }
    }

}