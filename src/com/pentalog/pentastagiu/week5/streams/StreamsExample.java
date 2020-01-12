package com.pentalog.pentastagiu.week5.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) {

        Arrays.asList("a", "b", "c")
                .stream()
                .filter(elem -> elem.startsWith("z"))
                .findFirst()
                .ifPresent(System.out::println);

        Stream<String> stream = Stream.of("a", "b", "c");

        IntStream.range(1, 100)
                .forEach(System.out::print);


        // Order matters
        System.out.println();
        System.out.println();
        System.out.println();
        Stream.of("a", "b", "c", "d")
                .map(elem -> {
                    System.out.println(" map: " + elem);
                    return elem.toUpperCase();
                })
                .filter(elem -> {
                    System.out.println("filter : " + elem);
                    return elem.startsWith("C");
                })
                .forEach(elem -> {
                    System.out.println(" forEach: " + elem);
                });

        // correct order

        System.out.println("Correct order");
        System.out.println();
        Stream.of("a", "b", "c", "d")
                .filter(elem -> {
                    System.out.println("filter : " + elem);
                    return elem.startsWith("c");
                })
                .map(elem -> {
                    System.out.println(" map: " + elem);
                    return elem.toUpperCase();
                })
                .forEach(elem -> {
                    System.out.println(" forEach: " + elem);
                });


        //Collect

        Set<String> collected = Stream.of("a", "b", "c", "d", "cernauti", "cazan", "cazan")
                .filter(elem -> {
                    System.out.println("filter : " + elem);
                    return elem.startsWith("c");
                })
                .map(elem -> {
                    System.out.println(" map: " + elem);
                    return elem.toUpperCase();
                })
                .collect(Collectors.toSet());

        System.out.println("Collected elements" + collected);


        // joining

        String joined = Stream.of("a", "b", "c", "d", "cernauti", "cazan", "cazan")
                .filter(elem -> {
                    System.out.println("filter : " + elem);
                    return elem.startsWith("c");
                })
                .map(elem -> {
                    System.out.println(" map: " + elem);
                    return elem.toUpperCase();
                })
                .collect(Collectors.joining(", ", "Prefix:", ":Suffix"));

        System.out.println("Joined: " + joined);

        //Reduce

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);


        Integer result = integers.parallelStream()
                .reduce(0,
                        (sum, number) -> {
                            System.out.printf("Sum %s and %s\n", sum, number);
                            return sum += number;
                        },
                        (i1, i2) -> {
                            System.out.printf("Combine %s with %s\n", i1, i2);
                            return i1 + i2;
                        });

        System.out.println(result);
    }
}
