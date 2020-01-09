package com.pentalog.pentastagiu.homework3.connectingToBluetooth;

public class MainClass {

    public static void main(String[]args) {
        ConnectableInterface carFord=new Cars(10003, "Ford Fiesta", "1.5 TDCi 85HP Spec", 12300.00, 2017, "Red", 3.5, "Diesel");
        ConnectableInterface iPhone1=new Phones(30001, "iPhone", "X", "Silver", 3750.00, 64.00, 12.12);
        ConnectableInterface refrigeratorLg=new SmartRefrigerators(20003, "LG", "GSX961NSAZ", 405.00, 196.00, "A++");
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

