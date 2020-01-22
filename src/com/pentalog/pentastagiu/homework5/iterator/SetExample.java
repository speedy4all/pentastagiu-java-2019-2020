package com.pentalog.pentastagiu.homework5.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class SetExample {

    public static void main(String[] args) {
        /*
        Suppose you have a set s containing some strings.
        Write a code fragment that uses an iterator to print out each element in set.
        Write a code fragment that uses a for to iterate over element
        Write a code fragment that uses the set stream() and the following methods:
            map to make a transformation of your choosing, filter based on a rule of your choosing,
            and collect, to collect all the strings separated by “,” with the prefix “This are the results: “ and sufix “ . Thank you!”. */
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("orange");
        colors.add("violet");
        colors.add("pink");
        colors.add("purple");

        // Write a code fragment that uses an iterator to print out each element in set.
        System.out.println("With iterator: ");
        Iterator iterator = colors.iterator();
        while(iterator.hasNext()){
            System.out.print(" - " + iterator.next() + " > ");
        }

        System.out.println("");
        System.out.println("With for: ");
        // Write a code fragment that uses a for to iterate over element
        for(String s : colors) {
            System.out.print(" - " + s + " > ");
        }

        System.out.println("");
        /*  Write a code fragment that uses the set stream() and the following methods:
            map to make a transformation of your choosing, filter based on a rule of your choosing,
            and collect, to collect all the strings separated by “,” with the prefix “This are the results: “ and sufix “ . Thank you!”. */
        String colorValues = colors.stream()
                .map(String::toUpperCase)
                .filter(element -> element.startsWith("P"))
                .collect(Collectors.joining(" , ", "This are the results: ", " . Thank you!"));
        System.out.println(colorValues);

    }
}
