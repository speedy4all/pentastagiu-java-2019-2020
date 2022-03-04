package com.pentalog.pentastagiu.homework3.Bluetooth;

public class Application {
    public static void main(String[] args) {
        BluetoothConnectable firstCar=new Car("Audi",2014,50000);
        BluetoothConnectable firstPhone=new Phone("Samsung",256,13);
        BluetoothConnectable firstSmartRefrigirator=new SmartRefrigirators("Bosch",40,5);
        Student firstStudent=new Student("Horatiu",8,"Romania");

        Object[] ArrayOfObjects=new Object[]{firstCar,firstPhone,firstSmartRefrigirator,firstStudent};

        for(Object OurObject:ArrayOfObjects){
            if(OurObject instanceof BluetoothConnectable){
                ((BluetoothConnectable)OurObject).connectToBluetooth();
            }
            else
            {
                System.out.println("You can't connect this to bluetooth");
            }
        }
    }
}
