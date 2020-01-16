package com.pentalog.pentastagiu.week5.collections;

import java.util.*;

public class Maps {

    public static void main(String[] args) {

        Map<Integer, List<String>> students = new HashMap<>();
        students.put(5, null);
        students.put(8, Collections.singletonList("Ioana"));
        students.put(10, Arrays.asList("Monica", "Laura"));

        System.out.println(students);

        List<String> studentsWith5 = students.get(5);
        if (studentsWith5 == null){
            studentsWith5 = new ArrayList<>();
        }

        studentsWith5.add("Cosmin");
        students.put(5, studentsWith5);

        System.out.println(students);


        Set<Integer> studentsKeySet = students.keySet();
        System.out.println("KeySet: " + studentsKeySet);
        Set<Map.Entry<Integer, List<String>>> entries = students.entrySet();
        System.out.println("EntrySet: " + entries);

        System.out.println("===========");
        for (Map.Entry<Integer, List<String>> entry : entries){
            System.out.printf("Key %s -> %s\n", entry.getKey(), entry.getValue());
        }
    }
}
