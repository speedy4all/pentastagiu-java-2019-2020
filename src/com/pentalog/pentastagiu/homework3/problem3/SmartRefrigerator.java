package com.pentalog.pentastagiu.homework3.problem3;

public class SmartRefrigerator implements Connectable{
    private int capacity;
    private String manufacturer;

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress...Smart Refrigerator");

    }

}
