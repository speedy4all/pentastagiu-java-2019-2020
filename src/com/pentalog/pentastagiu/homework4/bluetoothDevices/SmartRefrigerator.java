package com.pentalog.pentastagiu.homework4.bluetoothDevices;

public class SmartRefrigerator implements Connectable{
    String name;
    int price;

    public SmartRefrigerator(String name, int price){
        this.name = name;
        this.price = price;
        System.out.println("The Smart Refrigerator is created");
    }

    @Override
    public String connectToBluetooth() {
        return "Connect to bluetooth in progress... " + this.name;
    }
}
