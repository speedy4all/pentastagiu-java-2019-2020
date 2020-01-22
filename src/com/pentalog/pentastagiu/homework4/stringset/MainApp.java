package com.pentalog.pentastagiu.homework4.stringset;



//Suppose you have a set s containing some strings.
//        Write a code fragment that uses an iterator to print out each element in set.
//        Write a code fragment that uses a for to iterate over element
//        Write a code fragment that uses the set stream() and the following methods:
//        map to make a transformation of your choosing, filter based on a rule of your choosing, and collect,
//        to collect all the strings separated by “,” with the prefix “This are the results: “ and sufix “ . Thank you!”


import java.util.*;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("MNFY");
        s.add("BABA");
        s.add("GOOG");
        s.add("MSFT");
        s.add("AMZN");


        Iterator<String> itr = s.iterator();
        while(itr.hasNext()){
             System.out.println(itr.next());
         }


        System.out.println("Looping over HashSet using advanced for loop");
         for (String stock : s) {

             System.out.println(stock); }

        System.out.println("_________________________");




        String joined = s.stream()
                .filter(elem -> {
                    System.out.println("filter : " + elem);
                    return elem.startsWith("M");
                })
                .map(elem -> {
                    System.out.println(" map: " + elem);
                    return elem.toLowerCase();
                })
                .collect(Collectors.joining(", ", "Prefix: ", " :Suffix"));

        System.out.println("Joined: " + joined);




    }

}
