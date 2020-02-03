package com.pentalog.pentastagiu.homework3.problem3;

public class Car implements Connectable{
    private int power;
    private int maxSpeed;


    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress...Car");
    }

}
