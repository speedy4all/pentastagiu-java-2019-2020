package com.pentalog.pentastagiu.homework5.problem2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        Set<String> values = new HashSet<>();
        values.addAll(Arrays.asList("Dog", "Horse", "Snake", "Cat", "Pig"));

        System.out.println("Iterator: ");
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(" " + next);
        }

        System.out.println("For: ");
        for (String value:values){
            System.out.println(" " + value);
        }

        System.out.println("Stream: ");
        String result = values.stream()
                              .filter( val -> {return val.endsWith("g");
                              })
                               .map(val -> {return val.toLowerCase();
                               })
                               .collect(Collectors.joining(", ","This are the results: ", ".Thank you!"));
        System.out.println(result);




    }
}
