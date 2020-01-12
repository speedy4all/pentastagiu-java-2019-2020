package homework.week4.Restaurants;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Restaurant {
    private String name;
    private int nrGuests;
    private double income;
    private List<Guest> guests;
    private Set<Menu> menus;

    public Restaurant(String name) {
        this.name = name;
        this.guests = new ArrayList<>();
        this.menus = new HashSet<>();
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrGuests() {
        return nrGuests;
    }

    public void setNrGuests(int nrGuests) {
        this.nrGuests = nrGuests;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void addGuests(Guest guests) {
        this.guests.add(guests);
    }

    public Set<Menu> getMenus() {
        return menus;
    }

    public void addMenus(Menu menu) {
        this.menus.add(menu);
    }

    public void accomodateGuests(Guest guest, Menu menu) {
        if (!(guests.contains(guest))) {
            if (menus.contains(menu)) {
                nrGuests++;
                income += menu.getPrice();
                guests.add(guest);
            }
            else {
                System.out.println("The menu doesn't exists.");
            }
        }
        else {
            System.out.println("The guest is already in restaurant.");
        }
    }

    public abstract double payTaxes();

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", nrGuests=" + nrGuests +
                ", income=" + income +
                ", guests=" + guests +
                ", menus=" + menus +
                '}';
    }
}
