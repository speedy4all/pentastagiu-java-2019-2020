package com.pentalog.pentastagiu.homework5;

import java.util.*;
import java.util.Set;
import java.util.stream.Collectors;

public class Maps {
    public static void main(String[] args) {
        //Declare and initializes the Map
        Map<Integer, List<String>> employees = new HashMap<>();
        //Add values
        employees.put(23, Arrays.asList("Ana").stream().sorted().collect(Collectors.toList()));
        employees.put(24, Arrays.asList("Cosmin", "Aurelia").stream().sorted().collect(Collectors.toList()));
        employees.put(25, Arrays.asList("Nikolae", "Emil").stream().sorted().collect(Collectors.toList()));
        //Add values for a key that is not yet present in the map
        employees.put(26, null);
        System.out.println(employees);
        List<String> employeeWith26 = employees.get(26);
        if(employeeWith26 == null){
            employeeWith26 = new ArrayList<>();
        }
        employeeWith26.add("Ion");
        employeeWith26.add("Alexandru");
        employeeWith26.add("Bianca");
        employeeWith26 = employeeWith26.stream().sorted().collect(Collectors.toList());

        employees.put(26, employeeWith26);
        System.out.println("\nAdd values for key 26 \n" + employees);

        Set<Integer> employeesKeySet = employees.keySet();
        System.out.println("Employees key set: " + employeesKeySet);

        Set<Map.Entry<Integer, List<String>>> employeesEntrySet = employees.entrySet();
        System.out.println("Employees entries: " + employeesEntrySet);
    }
}
