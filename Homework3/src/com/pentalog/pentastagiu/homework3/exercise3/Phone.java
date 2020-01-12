package com.pentalog.pentastagiu.homework3.exercise3;

public class Phone implements IConnectable {

    private String color = "white";
    private String mark = "Samsung";

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress...(phone)");
    }
}

