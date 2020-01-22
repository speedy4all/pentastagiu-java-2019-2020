package com.pentalog.pentastagiu.homework4.mapofemplyees;



//Suppose you have a Map of employees, where the key is their age and the value is their name sorted in alphabetical order.
// Write a Java program that:
//        Declares and initializes the map
//        Adds values to it
//        Add values for a key that is not yet present in the map
//        Iterate over the map’s keySet and prints the name of the employes for that key
//        Iterate over the map’s entrySet and displays the first person alphabetically


import java.util.*;

import java.util.Comparator;

public class MainApp  {

    public static void main(String[] args) {
        Map<Integer, String> employee = new HashMap<Integer, String>();


        employee.put(30, ("Jhon"));
        employee.put(20, ("Traian"));
        employee.put(10, ("Pull"));
        employee.put(5, null);


        String studentsWith5 = employee.get(5);
        if (studentsWith5 == null) {
            studentsWith5 = new String();
        }
        studentsWith5=("Abra");
        employee.put(5, studentsWith5);





        Set<Integer> employeeKeySet = employee.keySet();
        System.out.println("Employee key set: " + employeeKeySet);





        Set<Map.Entry<Integer, String>> entries = employee.entrySet();
        System.out.println("Employee entry set: " + entries);



        Comparator<Map.Entry<Integer, String>> valueComparator = new Comparator<Map.Entry<Integer,String>>() {





            @Override
            public int compare(Map.Entry<Integer, String> e1, Map.Entry<Integer, String> e2) {
                String v1 = e1.getValue();
                String v2 = e2.getValue();
                return v1.compareTo(v2);
            }
        };


        System.out.println("#########################################");

        List<Map.Entry<Integer, String>> listOfEntries = new ArrayList<Map.Entry<Integer, String>>(entries);

        // sorting HashMap by values using comparator
        Collections.sort(listOfEntries, valueComparator);

        LinkedHashMap<Integer, String> sortedByValue = new LinkedHashMap<Integer, String>(listOfEntries.size());

        // copying entries from List to Map
        for(Map.Entry<Integer, String> entry : listOfEntries){
            sortedByValue.put(entry.getKey(), entry.getValue());
        }

        System.out.println("HashMap after sorting entries by values ");
        Set<Map.Entry<Integer, String>> entrySetSortedByValue = sortedByValue.entrySet();

        for(Map.Entry<Integer, String> mapping : entrySetSortedByValue){
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }

    }
}
