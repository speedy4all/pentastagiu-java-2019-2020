package com.pentalog.pentastagiu.homework4.problem2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Problem2App {

    public static void main(String[] args) {

        Set<String> testSet = new TreeSet<>();
        testSet.addAll(Arrays.asList("George", "Emily", "Andrew", "Timmy", "Louie"));

        Iterator<String> iterator = testSet.iterator();
        while ((iterator.hasNext())) {
            String element = iterator.next();
            System.out.println(" .." + element + " ..");
        }

        for (String element : testSet) {
            System.out.println(element);
        }

        String meesage = testSet.stream()
                .filter(element -> element.endsWith("e"))
                .map(String::toLowerCase)
                .collect(Collectors.joining(","));

        System.out.println(meesage);

    }

}
