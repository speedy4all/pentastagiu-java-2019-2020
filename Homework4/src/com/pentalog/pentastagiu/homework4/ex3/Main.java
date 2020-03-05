package com.pentalog.pentastagiu.homework4.ex3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, List<String>> employees = new HashMap<>();
        employees.put(25, Arrays.asList("Ana"));
        employees.put(40, Arrays.asList("Ion"));
        employees.put(31, null);

        List<String> employeeWith31 = employees.get(31);
        if (employeeWith31 == null) {
            employeeWith31 = new ArrayList<>();
        }
        employeeWith31.add("Marcel");
        employees.put(31, employeeWith31);
        System.out.println(employees);

        Set<Integer> employeeKeySet = employees.keySet();
        Iterator<Integer> it = employeeKeySet.iterator();
        while (it.hasNext()) {
            System.out.println("Name: " + employees.get(it.next()));
        }

        Map.Entry<Integer, List<String>> firstValue = employees.entrySet().iterator().next();
        Integer key = firstValue.getKey();
        String value = String.valueOf(firstValue.getValue());
        Set<Map.Entry<Integer, List<String>>> entries = employees.entrySet();
        for (Map.Entry<Integer, List<String>> entry : entries) {
            String current = String.valueOf(entry.getValue());
            if (value.compareTo(current) > 0) {
                value = String.valueOf(entry.getValue());
            }
        }
        System.out.println("Name: " + value);


    }
}
