package com.pentalog.pentastagiu.homework4.bluetooth.main;

import com.pentalog.pentastagiu.homework4.bluetooth.business.BluetoothConnection;

import javax.swing.*;

public class main {
    public static void main(String[] args) {

        BluetoothConnection bluetoothConnection = new BluetoothConnection();

        int option;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("     OPTIONS     \nPlease select from the options below" + "\n1. Add Cars" + "\n2. Add Phones" + "\n3. Add Refrigerators" + "\n4. View Items" + "\n5. Connect through bluetooth" + "\n6. Exit" ));
            switch (option) {
                case 1:
                    bluetoothConnection.addCars();
                    break;
                case 2:
                    bluetoothConnection.addPhones();
                    break;
                case 3:
                    bluetoothConnection.addRefrigerators();
                    break;
                case 4:
                    bluetoothConnection.viewItems();
                    break;
                case 5:
                    bluetoothConnection.connectToBluetooth();
                    break;
                case 6:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Invalid action!");
                    break;
            }
        } while (option != 6);
    }
}
