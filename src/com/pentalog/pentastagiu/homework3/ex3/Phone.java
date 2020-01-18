package com.pentalog.pentastagiu.homework3.ex3;

public class Phone implements Connectable {
    private String name = "Samsung";
    private int year = 2018;
    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress...PHONE");
    }
}
