package com.pentalog.pentastagiu.homework3.restaurants;

public class Menu {
    private String name;
    private double price;

    public Menu(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }
    @Override
    public boolean equals(Object otherMenu){
        if(otherMenu == null){
            return false;
        }
        if(otherMenu instanceof Menu){
            return ((Menu) otherMenu).name.equals(name);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
