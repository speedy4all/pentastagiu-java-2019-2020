package com.pentalog.pentastagiu.homework3.problem3;

public class Problem3App {


    public static void main(String[] args) {

        Car car = new Car("SUV",550000);
        Phone phone = new Phone("Nokia", 150);
        SmartRefrigerator fridge = new SmartRefrigerator("Artic", 15000);
        Object[] testArray = {car, phone, fridge};

        for ( Object object: testArray) {
            ((Connectable) object).connectToBlueTooth();
        }

    }
}
