package com.pentalog.pentastagiu.homework3.ex3;

public class Car implements Connectable{
    private String color = "red";
    private String name = "Ford";
    private int year= 2016;

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress...CAR");
    }
}

