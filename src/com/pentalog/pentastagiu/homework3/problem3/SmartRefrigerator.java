package com.pentalog.pentastagiu.homework3.problem3;

public class SmartRefrigerator implements Connectable{
    private int capacity;
    private String manufacturer;

//    public SmartRefrigerator(int capacity, String manufacturer){
//        this.capacity = capacity;
//        this.manufacturer = manufacturer;
//    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress...Smart Refrigerator");

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
