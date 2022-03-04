package com.pentalog.pentastagiu.week5.homework4;

import java.util.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class EmployeeMapping {

    public static void main(String[] args) {

        //SortedSet<String> myEmployeeSet= new TreeSet<>();
        //myEmployeeSet.add("Ramona")

        Map<Integer, String> myEmployeeMap = new HashMap<>();
        myEmployeeMap.put(28, "Ramona");
        myEmployeeMap.put(27, "Rares");
        myEmployeeMap.put(33, "Alin");
        myEmployeeMap.put(37, "Diana");
        myEmployeeMap.put(32, "Claudiu");
        myEmployeeMap.put(24, "Maria");
        myEmployeeMap.put(29, null);

        /* ADD NEW ENTRY IN MAP */
        String age29 = myEmployeeMap.get(29);
        if (age29 == null) {
            age29 = new String();
        }
        age29 = "Sorin";
        myEmployeeMap.put(29, age29);

        /* SORT AFTER WE ADD THE NEW ENTRY AND FILLED UP THE NULL SPACE (CANT SORT IF NULL)) */
        myEmployeeMap = myEmployeeMap
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(
                        toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                                LinkedHashMap::new));

        /* PRINT OUT THE SORTED MAP */
        Set<Map.Entry<Integer, String>> entries = myEmployeeMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("Employee entries: " + entries);
        }

        /* SHOW THE EMPLOYEE ON 1st POSITION */
        for (Map.Entry<Integer, String> entry : myEmployeeMap.entrySet()) {
            if(entry.getKey() == 29)
            {
                System.out.println("Employee with age "+entry.getKey()+ " is " + entry.getValue());
            }
        }

        /* PRINTING THE FIRST EMPLOYEE IN ALPHABETICAL ORDER */
        Map.Entry<Integer,String> entry = myEmployeeMap.entrySet().iterator().next();
        System.out.println("First employee : "+entry.getValue() + " - "+ entry.getKey() + " years old.");


    }
}
