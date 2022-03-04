package com.pentalog.pentastagiu.homework3.restaurants;

public class Restaurants {
    private int guests;
    private float income;
    private float priceForMenu;

    Restaurants(int guests, float income, float priceForMenu){
        this.guests = guests;
        this.income = income;
        setIncome(this.income);
        this.priceForMenu = priceForMenu;
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public float getPriceForMenu() {
        return priceForMenu;
    }

    public void setPriceForMenu(float priceForMenu) {
        this.priceForMenu = priceForMenu;
    }
    public float calculateIncome(){
        return this.income + this.guests * this.priceForMenu;
    }

    public float calculateTax(){
        return (income + guests*priceForMenu)*20/100;
    }

    public void addGuest(String guest){
         setGuests(getGuests()+1);
    }

}
