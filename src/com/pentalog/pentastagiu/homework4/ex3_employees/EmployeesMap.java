package com.pentalog.pentastagiu.homework4.ex3_employees;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeesMap {
    public static void main(String[] args) {

        Map<Integer, String> employees = new HashMap<>();
        employees.put(27, "Alina");
        employees.put(28, "Simona");
        employees.put(29, "Georgiana");
        employees.put(30, "Bogdan");
        employees.put(31, "Andrei");
        employees.put(32, null);
        System.out.println(employees);

        //Add values for a key that is not yet present in the map.
        String value = employees.get(32);
        if (value == null)
            value = new String("Gabriel");
        employees.put(32, value);
        System.out.println(employees);

        // Iterate over the map’s keySet and prints the name of the employes for that key.
        int age = 30;
        for (Integer key : employees.keySet()) {
            if (key == age)
                System.out.println(employees.get(key));
        }

        System.out.println();
        // Iterate over the map’s entrySet and displays the first person alphabetically.
        Set<Map.Entry<Integer, String>> entries = employees.entrySet();
        employees.entrySet().stream()
                .map(entrySet -> entrySet.getValue())
                .sorted(String ::compareTo)
                .forEach(System.out :: println);
    }

}
