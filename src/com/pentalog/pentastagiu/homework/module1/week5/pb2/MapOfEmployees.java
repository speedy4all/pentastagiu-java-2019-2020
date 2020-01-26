package com.pentalog.pentastagiu.homework.module1.week5.pb2;

import java.util.*;

public class MapOfEmployees {
    public static void main(String[] args) {
        Map<Integer, TreeSet<String>> employees = new HashMap<>();
        employees.put(18, new TreeSet<>(Arrays.asList("Gigel1", "Gigel2")));
        employees.put(26, new TreeSet<>(Arrays.asList("Tom", "Tam")));
        Set<Integer> keys = employees.keySet();
        for (Integer key : keys) {
            System.out.println(employees.get(key));
        }
        for (Map.Entry<Integer, TreeSet<String>> treeSetEntry : employees.entrySet()) {
            System.out.println(treeSetEntry.getValue().first());
        }
    }
}
