package com.pentalog.pentastagiu.homework3.App3;

import java.util.ArrayList;

public class ConnectivityApp {
    public static void main(String[] args) {
        Car car1 = new Car("Chevrolet", "Astra", 6.9, 2011, 186);
        Car car2 = new Car("Citroen", "Berlingo", 4.4, 2015, 166);
        Car car3 = new Car("Jaguar", "XE", 8.1, 2018, 250);

        Phone phone1 = new Phone("Samsung Galaxy Note10", "Android", 512, 6.8);
        Phone phone2 = new Phone("iPhone X", "iOS", 128, 6.1);
        Phone phone3 = new Phone("Huawei P30 Lite", "Android", 128, 6.15);

        SmartRefrigerator smartRefrigerator1 = new SmartRefrigerator("Samsung", 4, "Black", 22);
        SmartRefrigerator smartRefrigerator2 = new SmartRefrigerator("LG", 3, "Grey", 23.5);
        SmartRefrigerator smartRefrigerator3 = new SmartRefrigerator("Kenmore", 4, "Black", 23.9);

        Student student1 = new Student("Mircea", 20);
        Student student2 = new Student("Alina", 21);
        Student student3 = new Student("Mihai", 22);

        ArrayList<Object> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);
        list.add(smartRefrigerator1);
        list.add(smartRefrigerator2);
        list.add(smartRefrigerator3);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        for (Object obj:
             list) {
            if (obj instanceof Car){
                ((Car) obj).connectToBluetooth();
            }
            else if (obj instanceof Phone){
                ((Phone) obj).connectToBluetooth();
            }
            else if (obj instanceof SmartRefrigerator){
                ((SmartRefrigerator) obj).connectToBluetooth();
            }
            else {
                System.out.println("No connection!!");
            }

        }
    }
}
