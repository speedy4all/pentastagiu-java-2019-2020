package com.pentalog.pentastagiu.homework4.problem3;

import java.util.*;

public class Problem3App {

    public static void main(String[] args) {
        Map<Integer, SortedSet<String>> employeeMap = new LinkedHashMap<>();

        SortedSet<String> nameSet1 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        nameSet1.addAll(Arrays.asList("John", "Kate", "Augustin"));
        employeeMap.put(22, nameSet1);

        SortedSet<String> nameSet2 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        nameSet2.addAll(Arrays.asList("Maggy", "Kevin", "Denis"));
        employeeMap.put(40, nameSet2);

        SortedSet<String> nameSet3 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        nameSet3.addAll(Arrays.asList("Loui", "Chris", "James"));
        employeeMap.put(29, nameSet3);

        SortedSet<String> nameSet4 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        nameSet4.addAll(Arrays.asList("Hans", "Zelma", "Bianca"));
        Integer newKey = 60;

        for (Integer key : employeeMap.keySet()) {
            System.out.println("For key: " + key + " Names: " + employeeMap.get(key));
        }

        if (!employeeMap.containsKey(newKey)) {
            employeeMap.put(newKey, nameSet4);
        }

        for (Integer key : employeeMap.keySet()) {
            if (key.equals(newKey)) {
                System.out.print("Names for key: " + key + " -> " + employeeMap.get(newKey) + " ");
            }
        }

        System.out.println("First names...");
        for (Map.Entry<Integer, SortedSet<String>> entry : employeeMap.entrySet()) {
            System.out.println(entry.getValue().iterator().next());
        }

    }
}
