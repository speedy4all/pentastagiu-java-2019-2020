package com.pentalog.pentastagiu.week4.homework3.BluetoothApp;

public class BluetoothApp {

    public static void main(String[] args){

       Cars car1 = new Cars("car1");
       Phones phone1= new Phones("phone1");
       Student student1= new Student("Ian",22);
       Phones phone2= new Phones("phone2");
       SmartRefrigerator refrigerator1 =new SmartRefrigerator("refrigerator1");


       Object object[]= new Object[4];

        object[0] = new Cars("Mustang");
        object[1] = new Phones("Samsung Galaxy");
        object[2] = new Student("Ian",22);
        object[3] = new SmartRefrigerator("Arctic");

        for(int i = 0;i<object.length;i++)
        {
            if(object[i] instanceof Device){
                //object.connectToBluetooth();
                Device device = (Device) object[i];
                device.connectToBluetooth();
            }
            else{
                System.out.println("Cannot connect to human brain :))");
            }
        }

    }

}
