package com.pentalog.pentastagiu.homework3.bluetooth;

public class MainClass {

    public static void main(String[]args) {
        ConnectableInterface carFord=new Car(10003, "Ford Fiesta", "1.5 TDCi 85HP Spec", 12300.00, "Red");
        ConnectableInterface iPhone1=new Phone(30001, "iPhone", "X", "Silver", 3750.00);
        ConnectableInterface refrigeratorLg=new SmartRefrigerator(20003, "LG", "GSX961NSAZ", 405.00, 196.00);
        Student student1=new Student(3104, "Bobleanca Axinte Dana", "Informatics", "Alexandru Ioan Cuza University");

        Object[] objectsArray=new Object[] {carFord,iPhone1, refrigeratorLg, student1};


        for(Object objects:objectsArray) {
            if(objects instanceof ConnectableInterface) {
                ((ConnectableInterface)objects).connectToBluetooth();
            }else {
                System.out.println("You can not connect to student");
            }
        }
    }
}

