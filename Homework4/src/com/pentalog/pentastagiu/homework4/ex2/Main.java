package com.pentalog.pentastagiu.homework4.ex2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Set<String> setList = new HashSet<String>();
        setList.add("one");
        setList.add("two");
        setList.add("three");

        Iterator iterator = setList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        for (String set : setList) {
            System.out.print(set + " ");
        }

        System.out.println();
        String str = setList.stream()
                .filter(element -> element.startsWith("t"))
                .map(String::toUpperCase)
                .collect(Collectors.joining(",", "This are the results: ", " . Thank you!"));

        System.out.println(str);
    }
}