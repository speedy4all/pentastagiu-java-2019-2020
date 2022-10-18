package com.pentalog.pentastagiu.homework5.set.of.strings;

import java.util.*;
import java.util.stream.Collectors;

public class SetIterator {
    public static void main(String[] args) {
        Set<String> stringsSet = new HashSet<>(Arrays.asList("Ion", "Ana", "Teodora", "eu", "Gica", "Maria"));
        Iterator<String> iterator = stringsSet.iterator();
        System.out.println("Using Iterator: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Using 'FOR' loop: ");
        for (String word : stringsSet) {
            System.out.println(word);
        }
        System.out.println("Using 'Stream'");
        String result = stringsSet.stream()
                .map(String::toUpperCase)
                .filter(string -> string.length() > 2)
                .collect(Collectors.joining(", ", "This are the results: ", " Thank you!"));
        System.out.println(result);
    }
}
