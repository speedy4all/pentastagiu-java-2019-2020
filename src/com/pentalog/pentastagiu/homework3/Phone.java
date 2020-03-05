package com.pentalog.pentastagiu.homework3;

public class Phone implements Connectable{
    private String name;

    public Phone(String name) {
        this.name = name;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress..."+name);
    }
}
