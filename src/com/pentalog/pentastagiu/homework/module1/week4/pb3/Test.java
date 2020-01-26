package com.pentalog.pentastagiu.homework.module1.week4.pb3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Object> things = new ArrayList<>();
        things.add(new DumbCar());
        things.add(new SmartCar());
        things.add(new SmartFridge());
        things.add(new DumbPhone());
        things.add(new SmartPhone());
        things.add(new SmartPhone());
        things.add(new DumbFridge());

        for (Object o : things) {
            if(o instanceof SmartCar) {
                ((SmartCar)o).connectToBluetooth();
            }
            else if(o instanceof SmartFridge) {
                ((SmartFridge)o).connectToBluetooth();
            }
            else if(o instanceof SmartPhone) {
                ((SmartPhone)o).connectToBluetooth();
            }
        }
    }
}
