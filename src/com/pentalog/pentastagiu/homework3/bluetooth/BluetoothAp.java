
//Create a console application from the following requirements:
//In the application we will work with few things: cars, phones, smart refrigerators. Add some specific details for each one
//We want each of these things to be able to connect with bluetooth → write a Connectable interface in which you specify this contract: a method called connectToBluetooth
//Add another simple class, Student for example, which doesn’t have to implement the Connectable interface
//Implement this contract in each class that you have and add a specific implementation
// (in which you just print to console a message in which you specify: “Connect to bluetooth in progress...” and the name of
// the device)


package com.pentalog.pentastagiu.homework3.bluetooth;

import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.T;


public class BluetoothAp {




    public static void main(String[] args) {
        Cars car1 = new Cars();
        Phones phone1 = new Phones();
        SmartRefigerators ref1 = new SmartRefigerators();
        Students stud1 = new Students();

        List<Object> objects = new ArrayList<>();
        objects.add(car1);
        objects.add(phone1);
        objects.add(ref1);
        objects.add(stud1);

        for(Object x : objects) {
            if (x instanceof Items){
                System.out.println(x.getClass()+ " "+((Items) x).connectToBluetooth());
            } else
            {

                System.out.println(x.getClass()+" Unable to connect to bluetooth");
            }
        }

    }
}
