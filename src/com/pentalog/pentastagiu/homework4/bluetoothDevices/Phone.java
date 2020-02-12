package com.pentalog.pentastagiu.homework4.bluetoothDevices;

public class Phone implements Connectable{
    String name;
    int price;

    public Phone(String name, int price){
        this.name = name;
        this.price = price;
        System.out.println("The Phone is created");
    }

    @Override
    public String connectToBluetooth() {
        return "Connect to bluetooth in progress... " + this.name;
    }
}
