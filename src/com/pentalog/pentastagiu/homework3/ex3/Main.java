package com.pentalog.pentastagiu.homework3.ex3;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        Phone phone=new Phone();
        SmartRefrigerator smartRefrigerator=new SmartRefrigerator();
        Student student=new Student();
        Object[] instances={car, phone, smartRefrigerator, student};

        for(int i=0; i<instances.length; i++) {
            if(instances[i] instanceof Car) {
                ((Car)instances[i]).connectToBluetooth();
            } else if(instances[i] instanceof Phone) {
                ((Phone)instances[i]).connectToBluetooth();
            } else if(instances[i] instanceof SmartRefrigerator) {
                ((SmartRefrigerator)instances[i]).connectToBluetooth();
            }
        }

    }
}
