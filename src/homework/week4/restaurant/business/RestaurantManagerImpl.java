package homework.week4.restaurant.business;

import homework.week4.restaurant.domain.Restaurant;

import javax.swing.*;
import java.util.*;

public class RestaurantManagerImpl implements RestaurantManager {

    private List<Restaurant> Specifics = new ArrayList<>();
    private Map<String, List<Restaurant>> RestaurantsList = new HashMap<>();

    public void addRestaurants() {
        Restaurant r = new Restaurant();
        r.setName(JOptionPane.showInputDialog("Restaurant's name: "));
        r.setNumberOfGuests(Integer.parseInt(JOptionPane.showInputDialog("Add clients: ")));
        r.setMenuPrice(Integer.parseInt(JOptionPane.showInputDialog("Add the menu price: ")));
        r.setIncome(r.getMenuPrice()*r.getNumberOfGuests());
        r.setHealthyFood(Boolean.parseBoolean(JOptionPane.showInputDialog("Is the food healthy? (Type true or false)")));
        Specifics.add(r);
        RestaurantsList.put(r.getName(),Specifics);
        System.out.println(r.toString());
    }

    @Override
    public void addCustomers() {
        Iterator<Restaurant> it = Specifics.iterator();
        boolean search = false;
        String input = JOptionPane.showInputDialog("Type the name of the restaurant you want to access:");
        while (it.hasNext()) {
            Restaurant restaurant = it.next();
            if (restaurant.getName().equals(input)) {
                search = true;
                System.out.println(restaurant.toString());
                System.out.println(("Welcome, you have arrived at " + restaurant.getName() + " !"));
                int initial = restaurant.getNumberOfGuests();
                int modified = restaurant.setNumberOfGuests(Integer.parseInt(JOptionPane.showInputDialog("Add more clients:")));
                int sum = initial + modified;
                restaurant.setNumberOfGuests(sum);
                restaurant.setIncome(restaurant.getMenuPrice()*restaurant.getNumberOfGuests());
                System.out.println("Update! \n " + restaurant.toString());
                }
        }
        if (!search) System.out.println("The restaurant name is not valid or non existent!");
    }

    public void calculateTaxes(){
        Iterator<Restaurant> it = Specifics.iterator();
        boolean search = false;
        String input = JOptionPane.showInputDialog("Type the name of the restaurant you want to access:");
        while (it.hasNext()) {
            Restaurant restaurant = it.next();
            if (restaurant.getName().equals(input)) {
                search = true;
                System.out.println(restaurant.toString());
                if (restaurant.isHealthyFood()) {
                    double taxes = (restaurant.getIncome() * 0.2) - ((restaurant.getIncome() * 0.2) * 0.3);
                    System.out.println("Taxes for a healthy restaurant are " + taxes + " $.");
                } else {
                    double taxes = restaurant.getIncome() * 0.2;
                System.out.println("Taxes for this restaurant are " + taxes + " $.");
                }
            }
        }
        if (!search) System.out.println("The restaurant name is not valid or non existent!");
    }

}
