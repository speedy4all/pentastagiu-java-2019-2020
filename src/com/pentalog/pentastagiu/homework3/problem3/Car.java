package com.pentalog.pentastagiu.homework3.problem3;

public class Car implements Connectable{
    private int power;
    private int maxSpeed;

//    public Car(int power, int maxSpeed){
//        this.power = power;
//        this.maxSpeed = maxSpeed;
//    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress...Car");
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }



}
