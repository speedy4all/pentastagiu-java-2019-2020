package homework.week4.bluetooth.business;

import homework.week4.bluetooth.domain.*;
import homework.week4.restaurant.domain.Restaurant;

import javax.swing.*;
import java.util.*;

public class BluetoothConnection implements Bluetooth {

    private List ItemsList = new ArrayList();
    private Map<String, List<Restaurant>> ItemsMap = new HashMap<>();

    public List getItemsList() {
        return ItemsList;
    }

    @Override
    public void addCars() {
        Cars c = new Cars();
        c.setId(Integer.parseInt(JOptionPane.showInputDialog("Item ID: ")));
        c.setModel(JOptionPane.showInputDialog("Model: "));
        c.setColor(JOptionPane.showInputDialog("Color: "));
        c.setOwner(JOptionPane.showInputDialog("Owner: "));
        c.setBluetoothConnection((Boolean.parseBoolean(JOptionPane.showInputDialog("Has this items a bluetooth connection capability? (Type true or false)"))));
        ItemsList.add(c);
        System.out.println(c.toString());
        ItemsMap.put(String.valueOf(c.getId()), ItemsList);
    }

    @Override
    public void addPhones() {
        Phones p = new Phones();
        p.setId(Integer.parseInt(JOptionPane.showInputDialog("Item ID: ")));
        p.setModel(JOptionPane.showInputDialog("Model: "));
        p.setManufacturer(JOptionPane.showInputDialog("Owner: "));
        p.setColor(JOptionPane.showInputDialog("Color: "));
        p.setBluetoothConnection((Boolean.parseBoolean(JOptionPane.showInputDialog("Has this items a bluetooth connection capability? (Type true or false)"))));
        ItemsList.add(p);
        System.out.println(p.toString());
        ItemsMap.put(String.valueOf(p.getId()), ItemsList);
    }

    @Override
    public void addRefrigerators() {
        Refrigerator r = new Refrigerator();
        r.setId(Integer.parseInt(JOptionPane.showInputDialog("Item ID: ")));
        r.setManufacturer(JOptionPane.showInputDialog("Manufacturer: "));
        r.setColor(JOptionPane.showInputDialog("Color: "));
        r.setNumberOfDoors(Integer.parseInt(JOptionPane.showInputDialog("Number of doors: ")));
        r.setBluetoothConnection((Boolean.parseBoolean(JOptionPane.showInputDialog("Has this items a bluetooth connection capability? (Type true or false)"))));
        ItemsList.add(r);
        System.out.println(r.toString());
        ItemsMap.put(String.valueOf(r.getId()), ItemsList);
    }

    @Override
    public void viewItems() {
        System.out.println("List of all the items: \n" + getItemsList());
    }

    @Override
    public void connectToBluetooth() {
        Iterator it = ItemsList.iterator();
        boolean search = false;
        int input = Integer.parseInt(JOptionPane.showInputDialog("Type the ID of the item you want to connect to:"));
        while (it.hasNext()) {
            Items items = (Items) it.next();
            if (items.getId() == input) {
                search = true;
                if (items.isBluetoothConnection()) {
                    Student s = new Student();
                    s.setName(JOptionPane.showInputDialog("Enter the name of the person that wants to connect: "));
                    System.out.println(s.getName() + " is trying to connect at " + items.toString());
                    System.out.println("Connect to bluetooth in progress...");
                } else {
                    System.out.println("The device has no bluetooth connection available!");
                    break;
                }
            }
            if (!search) System.out.println("The ID number is not valid or non existent!");
        }
    }
}

