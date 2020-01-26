package com.pentalog.pentastagiu.homework4.ex2_strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class StringSet {
    public static void main(String[] args) {

        Set<String> cars = new HashSet<>();
        cars.addAll(Arrays.asList("Ford", "Renault", "Dacia", "Volvo", "Volkswagen"));

        // Write a code fragment that uses an iterator to print out each element in set.
        Iterator<String> iterator = cars.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.print(next + " ");
        }
        System.out.println();

        // Write a code fragment that uses a for to iterate over element.
        for(String it : cars){
            System.out.println(it);
        }


        //Write a code fragment that uses streams.
        String carsWithV = cars.stream()
                .filter(value -> value.startsWith("V"))
                .map(value -> value.toUpperCase())
                .collect(Collectors.joining("," , "This are the results: ",". Thank you!"));
        System.out.println(carsWithV);
    }
}