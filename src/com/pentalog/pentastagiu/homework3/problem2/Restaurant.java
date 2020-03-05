package com.pentalog.pentastagiu.homework3.problem2;

public class Restaurant {
    int numberGuests;
    double income;
    int fixedMenu;
    Type type;

    public Restaurant(int fixedMenu, Type type) {
        this.fixedMenu = fixedMenu;
        this.type = type;
        this.numberGuests = 0;
        double income = 0;
    }

    public int getNumberGuests() {
        return numberGuests;
    }

    public void setNumberGuests(int numberGuests) {
        this.numberGuests = numberGuests;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getFixedMenu() {
        return fixedMenu;
    }

    public void setFixedMenu(int fixedMenu) {
        this.fixedMenu = fixedMenu;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    protected void accomodateGuests(int newGuests) {
        this.numberGuests += newGuests;
        this.income += newGuests * this.fixedMenu;
    }

    protected double calculateTaxes() {
        double tax;
        switch (type) {
            case NORMAL:
                tax =  this.income*0.2;
                break;
            default:
                tax = this.income*0.2*0.7;
                break;
        }
        return tax;
    }


}

enum Type {
    NORMAL,
    VEGETARIAN
}
