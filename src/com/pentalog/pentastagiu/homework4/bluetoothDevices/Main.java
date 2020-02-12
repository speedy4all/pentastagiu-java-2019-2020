package com.pentalog.pentastagiu.homework4.bluetoothDevices;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 30000, 2019);
        Phone phone = new Phone("Samsung", 900);
        SmartRefrigerator smartRefrigerator = new SmartRefrigerator("Arctic", 1000);
        Student student = new Student();

        ArrayList objects = new ArrayList<>();
        objects.add(car1);
        objects.add(phone);
        objects.add(smartRefrigerator);
        objects.add(student);

        for (int i = 0; i < objects.size(); i++) {
            if (objects.get(i) instanceof Connectable)
                System.out.println(((Connectable) objects.get(i)).connectToBluetooth());
        }
    }


}
