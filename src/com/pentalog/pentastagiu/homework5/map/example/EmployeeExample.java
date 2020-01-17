package com.pentalog.pentastagiu.homework5.map.example;

import java.util.*;

public class EmployeeExample {

    public static void main(String [] args) {

        /*
        Suppose you have a Map of employees, where the key is their age and the value is their name sorted in alphabetical order.
        Write a Java program that:
        - Declares and initializes the map
        - Adds values to it
        - Add values for a key that is not yet present in the map
        - Iterate over the map’s keySet and prints the name of the employes for that key
        - Iterate over the map’s entrySet and displays the first person alphabetically */

        Map<Integer, List<String>> employees = new HashMap<Integer, List<String>>();
        // Add values to the map
        List<String> age20 = new ArrayList<String>(Arrays.asList("Alina", "Cristina", "Anca", "Gabriel"));
        List<String> age30 = new ArrayList<String>(Arrays.asList("Adrian", "Edward", "MIhai", "Stefan"));
        List<String> age40 = new ArrayList<String>(Arrays.asList("Stefania", "Bianca", "Vasile", "Ioana"));
        employees.put(20, age20);
        employees.put(30, age30);
        employees.put(40, age40);

        EmployeeExample empEx = new EmployeeExample();
        System.out.println("Add values with key not present: ");
        empEx.addKey(20, "Grigore", employees);
        System.out.println(employees);

        System.out.println("Employee for the key provided: ");
        empEx.printEmployee(30, employees);

        System.out.println("Alphabetical name for every age: ");
        empEx.printAlphabetically(employees);

}
     // - add values for a key that is not present in the map
     public static void addKey(Integer myKey, String name, Map<Integer, List<String>> employees){
        if (!employees.containsKey(myKey)) {
            employees.put(myKey, new ArrayList<>(Arrays.asList(name)));
        } else {
            List<String> myList = employees.get(myKey);
            myList.add(name);
        }
     }
     // - Iterate over the map’s keySet and prints the name of the employes for that key
     public void printEmployee(Integer myKey, Map<Integer, List<String>> employees) {
        for(String name : employees.get(myKey)) {
            System.out.println(myKey + " " + name);
        }
     }

     // - Iterate over the map’s entrySet and displays the first person alphabetically
    public void printAlphabetically(Map<Integer, List<String>> employees) {
        for(Map.Entry<Integer, List<String>> entry : employees.entrySet()){
            Collections.sort(entry.getValue());
            System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue().get(0));
        }
    }
}


