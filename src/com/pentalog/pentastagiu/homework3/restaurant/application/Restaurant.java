package com.pentalog.pentastagiu.homework3.restaurant.application;

public class Restaurant {

    private Integer guestNumber;
    private Double income;
    private Menu menu;
    public double tax;

    public Integer getGuestNumber() {
        return guestNumber;
    }

    public void setGuestNumber(Integer guestNumber) {
        this.guestNumber = guestNumber;
    }

    public Double getIncome() {
        income = guestNumber * menu.getPrice();
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Restaurant(Integer guestNumber, Menu menu) {
        this.guestNumber = guestNumber;
        this.menu = menu;
    }

    public void addGuestsNumber(Integer numberOfGuests) {
        guestNumber += numberOfGuests;
    }

    public Double calculateTax(Restaurant restaurant) {
        if(restaurant.getMenu().getType().equalsIgnoreCase("Vegetarian")) {
            tax = (getIncome() * 0.2) - ((getIncome() * 0.2) * 0.3);
        } else if(restaurant.getMenu().getType().equalsIgnoreCase("Fast Food")) {
            tax = getIncome() * 0.2;
        }
        return tax;
    }
}
