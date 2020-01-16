package com.pentalog.pentastagiu.homework4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetString {

    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.addAll(Arrays.asList("Cosmin", "Laptop", "Keyboard", "AnotherString", "cantar"));
        // Write a code fragment that uses an iterator to print out each element in set.
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println("======");
        //Write a code fragment that uses a for to iterate over element
        for (String elem : strings) {
            System.out.println(elem);
        }

        System.out.println("======");
        //Write a cod fragment tha uses the set stream() and the following methods:
        // map to make a transformation of your choosing,
        // filter based on a rule of your choosing, and
        // collect, to collect all the strings separated by “,”
        // with the prefix “This are the results: “ and sufix “ . Thank you!”.

        String res = strings.stream()
                .map(elem -> {
                    System.out.println("map: " + elem);
                    return elem.toUpperCase();
                })
                .filter(str -> {
                    System.out.println("filter: " + str);
                    return str.startsWith("C");
                })
                .collect(Collectors.joining(", ", "This are the results: ",
                        ". Thank you!"));
        System.out.println(res);

    }
}
