package com.pentalog.pentastagiu.homework3.exercise3;

public class SmartRefrigerator implements IConnectable{

    private String color = "white";
    private String mark = "Arctic";

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress...(smart refrigerator)");
    }
}
