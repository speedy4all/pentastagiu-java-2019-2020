package com.pentalog.pentastagiu.homework4;

import java.util.*;

public class EmployeesMap {

    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(1, "John");
        employees.put(2, "Michael");
        employees.put(3, "Daniel");
        employees.put(4, "Rob");
        employees.put(5, "Andrew");

        Set<Integer> employeesKeySet = employees.keySet();

        int desiredKey = 3;
        for (Integer key : employeesKeySet){
            if (key == desiredKey){
                System.out.println(employees.get(key));}
        }

        Set<Map.Entry<Integer, String>> entries = employees.entrySet();
        employees.entrySet().stream()
                .map(entrySet -> entrySet.getValue())
                .sorted(String ::compareTo)
                .forEach(System.out::println);

    }
}
