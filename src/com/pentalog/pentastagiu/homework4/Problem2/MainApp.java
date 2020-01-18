package com.pentalog.pentastagiu.homework4.Problem2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        Set<String> values = new HashSet<>();

        values.addAll(Arrays.asList("Bear", "Pig", "Spider", "Dog", "Cat", "Horse"));

        //Print each element using iterator.
        System.out.println("Iterator: ");
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(" " + next);
        }

        //Using for to iterate over set
        System.out.println("For:");
        for (String value : values){
            System.out.println(" " + value);
        }

        //Stream
        System.out.println("Stream: ");
        String result = values.stream()
              .filter(value -> value.endsWith("g"))
              .map(value -> value.toLowerCase())
              .collect(Collectors.joining(", ", "This are the results: ", ". Thank you!"));

        System.out.println(result);

    }

}
