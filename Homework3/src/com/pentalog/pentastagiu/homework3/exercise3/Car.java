package com.pentalog.pentastagiu.homework3.exercise3;

public class Car implements IConnectable {

    private int miles = 500;
    private String color = "black";

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress...(car)");
    }
}