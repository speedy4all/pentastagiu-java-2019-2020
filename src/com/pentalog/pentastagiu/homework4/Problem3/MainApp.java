package com.pentalog.pentastagiu.homework4.Problem3;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Map<Integer, SortedSet<String>> employees = new LinkedHashMap<>();
        SortedSet<String> names1 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        names1.add("Cristina");
        names1.add("Maria");
        names1.add("Ana");
        employees.put(25, names1);

        SortedSet<String> names2 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        names2.add("Ion");
        names2.add("Dan");
        names2.add("Vlad");
        employees.put(30, names2);

        SortedSet<String> names3 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        names3.add("Oana");
        names3.add("Alex");
        names3.add("Paul");
        employees.put(40, names3);

        System.out.println("The map with the employees: " + employees);

        SortedSet<String> names4 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        names4.add("Denisa");
        names4.add("Alina");

        int newKeyToAdd = 45;
        if (!employees.containsKey(newKeyToAdd)){
            employees.put(newKeyToAdd, names4);
        }
        System.out.println("The map after added new employee with the key: " + newKeyToAdd + " is: " + employees);
        for (Integer key : employees.keySet()){
            if (key == newKeyToAdd){
                System.out.println("The employees with the new key added are: " + employees.get(newKeyToAdd));
            }
        }

        Map.Entry<Integer, SortedSet<String>> entry = employees.entrySet().iterator().next();
        System.out.println("The first sorted employee: " + entry.getValue());









    }
}
