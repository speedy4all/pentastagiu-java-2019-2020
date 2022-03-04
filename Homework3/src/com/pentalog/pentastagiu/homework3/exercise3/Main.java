package com.pentalog.pentastagiu.homework3.exercise3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Phone phone = new Phone();
        SmartRefrigerator smartRefrigerator = new SmartRefrigerator();
        Student student = new Student();
        Object[] objects = {car, phone, smartRefrigerator, student};

        for(int i = 0; i < objects.length; i++){
            if(objects[i] instanceof Car){
                ((Car)objects[i]).connectToBluetooth();
            }else if(objects[i] instanceof Phone){
                ((Phone)objects[i]).connectToBluetooth();
            }else if(objects[i] instanceof SmartRefrigerator){
                ((SmartRefrigerator)objects[i]).connectToBluetooth();
            }
        }
    }
}