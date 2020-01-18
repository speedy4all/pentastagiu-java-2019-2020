package com.pentalog.pentastagiu.homework3.ex3;

public class SmartRefrigerator implements Connectable {
    private String color= "black";
    private String name = "Whirlpool";
    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress...SR");
    }
}
