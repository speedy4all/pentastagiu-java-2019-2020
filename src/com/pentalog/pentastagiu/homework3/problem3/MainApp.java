package com.pentalog.pentastagiu.homework3.problem3;

public class MainApp {

    public static void main(String[] args) {
        Object[] array = new Object[]{new Car(), new Phone(), new SmartRefrigerator(), new Student()};
        for (Object object : array){
            if(object instanceof Car){
                ((Car)object).connectToBluetooth();

            } else if(object instanceof Phone){
                ((Phone)object).connectToBluetooth();

            } else if(object instanceof SmartRefrigerator){
                ((SmartRefrigerator)object).connectToBluetooth();

            } else if(object instanceof  Student){
               System.out.println("Call Student object name : " + ((Student)object).getName());
            }
        }
    }
}
