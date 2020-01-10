package homework.week4.restaurant.main;

import homework.week4.restaurant.business.RestaurantManagerImpl;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        RestaurantManagerImpl restaurantManager = new RestaurantManagerImpl();

        int option;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("     OPTIONS     \nPlease select from the options below" + "\n1. Add Restaurants" + "\n2. Add more clients" + "\n3. Calculate taxes" + "\n4. Exit"));
            switch (option) {
                case 1:
                    restaurantManager.addRestaurants();
                    break;
                case 2:
                    restaurantManager.addCustomers();
                    break;
                case 3:
                    restaurantManager.calculateTaxes();
                    break;
                case 4:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid action!");
                    break;
            }
        } while (option != 4);
    }
}
