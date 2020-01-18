package com.pentalog.pentastagiu.week5.homework4;
import java.util.*;
import java.util.stream.Collectors;

public class StringSet {

    public static void main(String[] args) {

        Set<String> myCountrySet= new HashSet<>();
        myCountrySet.addAll(Arrays.asList("Belgia","Franta","Germania","Italia","Suedia","Polonia","Danemarca","Portugalia","Spania"));

        Iterator<String> iterator=myCountrySet.iterator();
        while (iterator.hasNext()){
            String nextStringInSet=iterator.next();
            System.out.print(nextStringInSet+",");
        }
        System.out.println("\n");

        for (String setValue: myCountrySet){
            System.out.print(setValue+",");
        }

        String  countryWithS= myCountrySet.stream()
                .map(element -> element.toUpperCase())
                .filter(element -> element.startsWith("S"))
                .collect(Collectors.joining(" , ", "\nThis are the results: \n", " . Thank you!\n"));
        System.out.println(countryWithS);

    }
}
