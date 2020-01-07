package com.pentalog.pentastagiu.homework3.ex3_bluethooth;

public class TestBluetooth {
    public static void main(String[] args) {
        Object[] object = new Object[]{new Car("Ford"),
                new Phone("Samsung"),
                new SmartRefrigerator("Whirlpool"),
                new Student("Ion", "Popescu")};

        for (Object o : object) {
            if (o instanceof Car)
                ((Car) o).connectToBluetooth();
            else if (o instanceof Phone)
                ((Phone) o).connectToBluetooth();
            else if (o instanceof SmartRefrigerator)
                ((SmartRefrigerator) o).connectToBluetooth();
            else
                System.out.println("Cannot connect to bluetooth.");
        }

    }
}
