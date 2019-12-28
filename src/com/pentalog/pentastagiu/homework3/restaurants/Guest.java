package com.pentalog.pentastagiu.homework3.restaurants;

public class Guest {
    private String name;
    private Menu menu;
    /* other information ... */

    public Guest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                '}';
    }
}
