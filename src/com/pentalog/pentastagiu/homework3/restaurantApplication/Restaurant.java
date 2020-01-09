package com.pentalog.pentastagiu.homework3.restaurantApplication;

public abstract class Restaurant {

    private Double restaurantIncomes;
    private Double guestMenuToPay;
    private final Double PERCENT_TAXES_TO_PAY=0.20;
    private Double guestTotalOrder;
    private Guests guests=new Guests();
    private Double priceOfMenu;

    public abstract  Double calculatingTaxes(Double totalIncome);
    public abstract void displayTheMenu();
    public abstract Double menu(Integer guestOrder);

    public Double calculateTotalRestaurantIncomes(Double guestMenuToPay) {
        restaurantIncomes+=guestMenuToPay;
        return restaurantIncomes;
    }

    public Double guestTotalOrderPrice(Double priceOfMenu, Integer quantity) {
        guestTotalOrder=priceOfMenu*quantity;
        return guestTotalOrder;
    }

    public Double getPERCENT_TAXES_TO_PAY() {
        return PERCENT_TAXES_TO_PAY;
    }

    public Double getGuestMenuToPay() {
        return guestMenuToPay;
    }
    public void setGuestMenuToPay(Double guestMenuToPay) {
        this.guestMenuToPay = guestMenuToPay;
    }
    public Double getRestaurantIncomes() {
        return restaurantIncomes;
    }
    public void setRestaurantIncomes(Double restaurantIncomes) {
        this.restaurantIncomes = restaurantIncomes;
    }

    public Guests getGuests() {
        return guests;
    }
    public void setGuests(Guests guests) {
        this.guests = guests;
    }

    public Double getGuestTotalOrder() {
        return guestTotalOrder;
    }

    public void setGuestTotalOrder(Double guestTotalOrder) {
        this.guestTotalOrder = guestTotalOrder;
    }

    public Double getPriceOfMenu() {
        return priceOfMenu;
    }

    public void setPriceOfMenu(Double priceOfMenu) {
        this.priceOfMenu = priceOfMenu;
    }


}

