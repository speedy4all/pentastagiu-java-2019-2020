package com.pentalog.pentastagiu.week5.streams;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) {
        Arrays.asList("andrei", "bogdan", "cosmin")
                .stream()
                .filter(elem -> elem.startsWith("c"))
                .findFirst()
                .ifPresent(System.out::println);

        //Order matters
        System.out.println();
        System.out.println("incorrect order");
        Stream.of("a", "b", "c", "d")
                .map(elem -> {
                    System.out.println("map " + elem);
                    return elem.toUpperCase();
                })
                .filter(elem -> {
                    System.out.println("filter " + elem);
                    return elem.startsWith("C");
                })
                .forEach(elem -> {
                    System.out.println("forEach " + elem);
                });

        System.out.println();
        System.out.println("correct order");
        Stream.of("a", "b", "c", "d")
                .filter(elem -> {
                    System.out.println("filter " + elem);
                    return elem.startsWith("c");
                })
                .map(elem -> {
                    System.out.println("map " + elem);
                    return elem.toUpperCase();
                })

                .forEach(elem -> {
                    System.out.println("forEach " + elem);
                });

        //Collect

        System.out.println("----Collect-----");
        List<String> collected = Stream.of("a", "b", "c", "d", "cosmin", "catalin")
                .filter(elem -> {
                    System.out.println("filter " + elem);
                    return elem.startsWith("c");
                })
                .map(elem -> {
                    System.out.println("map " + elem);
                    return elem.toUpperCase();
                })
                .collect(Collectors.toList());

        System.out.println("Collected: " + collected);


        //joining
        System.out.println("----Join-----");
        String join = Stream.of("a", "b", "c", "d", "cosmin", "catalin")
                .filter(elem -> {
                    System.out.println("filter " + elem);
                    return elem.startsWith("c");
                })
                .map(elem -> {
                    System.out.println("map " + elem);
                    return elem.toUpperCase();
                })
                .collect(Collectors.joining(", "));

        System.out.println("Join: " + join);

        //reduce
        System.out.println("----REDUCE----");

        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8);

                Integer reduce = integers.stream()
                .reduce(0, (sum, number) -> {
                    System.out.printf("sum %s and %s\n", sum, number);
                    return sum += number;
                },
                        (i1, i2) -> {
                            System.out.printf("Combined %s and %s \n", i1, i2);
                            return i1+12;
                        });
        System.out.println(reduce);
    }
}
