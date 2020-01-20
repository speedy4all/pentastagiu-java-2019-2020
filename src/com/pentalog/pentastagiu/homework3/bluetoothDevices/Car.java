package com.pentalog.pentastagiu.homework3.bluetoothDevices;

public class Car implements Connectable {
    private String name;
    private int price;
    private int year;

    public Car(String name, int price, int year){
        this.name = name;
        this.price = price;
        this.year = year;
        System.out.println("The car is created");
    }

    @Override
    public String connectToBluetooth() {
        return "Connect to bluetooth in progress... " + this.name;
    }
}
