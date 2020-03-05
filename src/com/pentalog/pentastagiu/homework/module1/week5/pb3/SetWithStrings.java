package com.pentalog.pentastagiu.homework.module1.week5.pb3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class SetWithStrings {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>(Arrays.asList("Gigel", "Alex", "Grigore", "Stefan", "Agent"));

        Iterator<String> itr = names.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        for (String name : names) {
            System.out.println(name);
        }

        String result = names.stream()
                .filter(element -> element.contains("g") || element.contains("G"))
                .map(String::toUpperCase)
                .collect(Collectors.joining(",", "This are the results: ", ". Thank you!"));
        System.out.println(result);
    }
}
