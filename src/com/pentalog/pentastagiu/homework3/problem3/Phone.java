package com.pentalog.pentastagiu.homework3.problem3;

public class Phone implements Connectable{

    String name = "phone";
    int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void connectToBlueTooth() {
        System.out.println("Connect to bluetooth in progress..." + this.name);
    }
}
