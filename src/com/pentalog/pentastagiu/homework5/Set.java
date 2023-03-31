package com.pentalog.pentastagiu.homework5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Set {
    public static void main(String[] args) {
        java.util.Set<String> set = new HashSet<>();
        set.add("pentalog");
        set.add("pentastagiu");
        set.add("week 5");
        set.add("homework5");
        set.add("pentalog");

        System.out.println("Use a iterator to print each element");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.print(" " + next + " ");
        }

        System.out.println("\n\nUse a for to print each element");
        for(String word : set){
            System.out.println(word);
        }
        System.out.println("\n\nThe map method:");
        List<String> setMap = set.stream().map(s -> s+"Map").collect(Collectors.toList());
        System.out.println(setMap);

        System.out.println("\n\nThe filter method:");
        List<String> setFilter = set.stream().filter(s->s.startsWith("p")).collect(Collectors.toList());
        System.out.println(setFilter);

        System.out.println("\n\nThe collect method:");
        String setCollect = set.stream().collect(Collectors.joining(", ", "This are the results: ", ". Thank you!"));
        System.out.println(setCollect);



    }

}

