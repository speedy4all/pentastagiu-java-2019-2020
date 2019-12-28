package com.pentalog.pentastagiu.homework3.restaurants;

import com.pentalog.pentastagiu.homework3.exceptions.RestaurantIllegalInstantiation;
import com.pentalog.pentastagiu.homework3.exceptions.RestaurantIllegalParameters;

import java.util.*;

public abstract class Restaurant {
    private String name;
    private double income;
    private int numberOfGuests;
    private double taxDiscount;
    private List<Guest> guests;
    private Set<Menu> menus;

    public Restaurant(String name, double taxDiscount) {
        if(name == null || taxDiscount < 0){
            throw new RestaurantIllegalInstantiation("Numele nu poate fi null sau discount-ul de taxa nu poate fi negativ");
        }
        this.name = name;
        this.guests = new ArrayList<>();
        this.menus = new HashSet<>();
        this.taxDiscount = taxDiscount;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public double getTaxDiscount() {
        return taxDiscount;
    }

    public void setTaxDiscount(double taxDiscount) {
        this.taxDiscount = taxDiscount;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public Set<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }

    public void addMenu(Menu menu){
        menus.add(menu);
    }

    public void accommodateGuest(Guest guest, Menu menu){
        if(guest == null || menu == null){
            throw new RestaurantIllegalParameters("Clientul sau meniul nu pot fi null");
        }
        Optional<Menu> foundMenu = menus.stream()
                .filter(menu::equals)
                .findAny();
        Optional<Guest> foundGuest = guests.stream()
                    .filter(guestInList -> guestInList.getName().equals(guest.getName()))
                    .findAny();
        if(foundMenu.isPresent() && !foundGuest.isPresent()){
            numberOfGuests++;
            income += menu.getPrice();
            guests.add(guest);
        }
        else{
            throw new RestaurantIllegalParameters("Meniul nu exista sau utilizatorul deja este client");
        }

    }

    public abstract double payTaxesIncome();

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", income=" + income +
                ", numberOfGuests=" + numberOfGuests +
                ", taxDiscount=" + taxDiscount +
                ", guests=" + guests +
                ", menus=" + menus +
                '}';
    }
}
