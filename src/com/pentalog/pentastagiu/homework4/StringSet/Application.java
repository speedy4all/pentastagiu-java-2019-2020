package com.pentalog.pentastagiu.homework4.StringSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Set<String> myStringSet=new HashSet<>();
        myStringSet.addAll(Arrays.asList("Mama","Tata","Copil","Sora","Frate"));

        /*print out each element with iterator
        Iterator<String> iterator=myStringSet.iterator();
        while(iterator.hasNext()) {
            String nextString=iterator.next();
            System.out.println(nextString);
        }
        */
        /*for to iterate over element
        for(String iterator:myStringSet)
        {
            System.out.println(iterator);
        }

        */
        /*using stream*/
        String  frateString= myStringSet.stream()
                .map(element -> element.toUpperCase())
                .filter(element -> element.startsWith("F"))
                .collect(Collectors.joining(" , ","This are the results: ", " Thank you!"));
        System.out.println(frateString);


    }
}
