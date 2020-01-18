package com.pentalog.pentastagiu.homework4.iterate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class StringIterationTest {
    public static void main(String[]args) {


        Set<String> names=new HashSet<>();
        Integer counter=15;

        //adding names
        for(int i=1;i<=counter;i++) {
            names.add("Name " + i);
        }

        //printing names with iterator
        System.out.println("Printing names  with iterator");
        Iterator<String> iterator=names.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //printing names with for each
        System.out.println("\nPrinting names  with for each");
        names.forEach(System.out::println);


        //stream
        System.out.println("\nPrinting names  with stream");
        String joinedNames=names.stream()
                .filter(name->name.endsWith("2"))
                .map(String::toUpperCase)
                .collect(Collectors.joining(", ", "This ar the results: ", ". Thank you!"));
        System.out.println(joinedNames);

    }
}
