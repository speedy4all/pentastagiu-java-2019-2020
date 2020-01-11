package com.pentalog.pentastagiu.homework3.restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {
    private String name;
    private String address;
    private int maxNumberOfGuests;
    private int numberOfGuests;
    private double income;
    private Map<Menu, Double> menus;
    private List<List<Menu>> tables;
    private RestaurantType restaurantType;

    public String getName() {
        return name;
    }

    public Restaurant(String name, String address, int maxNumberOfGuests, RestaurantType restaurantType) {
        this.name = name;
        this.address = address;
        this.maxNumberOfGuests = maxNumberOfGuests;
        this.tables = new ArrayList<>(maxNumberOfGuests);
        this.restaurantType = restaurantType;
        menus = new HashMap<>();
    }

    public int getMaxNumberOfGuests() {
        return maxNumberOfGuests;
    }

    public void setMaxNumberOfGuests(int maxNumberOfGuests) {
        if (maxNumberOfGuests <= 0) throw new IllegalArgumentException();
        this.maxNumberOfGuests = maxNumberOfGuests;
    }

    public void addMenu(Menu menu, Double price) {
        if (price < 0) throw new IllegalArgumentException();
        menus.putIfAbsent(menu, price);
    }

    public void changeMenuPrice(Menu menu, Double price) {
        if (price < 0) throw new IllegalArgumentException();
        menus.put(menu, price);
    }

    public double getIncome() {
        return this.income;
    }

    public RestaurantType getRestaurantType() {
        return restaurantType;
    }

    public List<Menu> getMenus() {
        List<Menu> menus = new ArrayList<>();
        menus.addAll(this.menus.keySet());
        return menus;
    }

    public Double checkPriceMenu(Menu menu) {
        if (menus.containsKey(menu) == false) throw new IllegalArgumentException();
        return menus.get(menu);
    }

    public void accommodateGuest(List<Menu> orders) {
        if (numberOfGuests == maxNumberOfGuests) {
            System.out.println("Restaurant is full now.");
            return;
        }
        numberOfGuests++;
        orders.forEach(element -> income += menus.get(element));
    }
}
