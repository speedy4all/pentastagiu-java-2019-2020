package com.pentalog.pentastagiu.week5.collections;

import java.util.*;

public class Sets {

    public static void main(String[] args) {
        Set<Integer> myIntegerSet = new HashSet<>();
        Set<Integer> myIntegerSet2 = new HashSet<>();
        myIntegerSet.addAll(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5));
        myIntegerSet2.addAll(Arrays.asList(4, 5, 6, 7, 8));
        System.out.println(myIntegerSet);
        System.out.println(myIntegerSet2);

        // Union
        Set<Integer> union = new HashSet<>(myIntegerSet);
        union.addAll(myIntegerSet2);
        System.out.println("Union: " + union);

        //Intersection
        Set<Integer> intersection = new HashSet<>(myIntegerSet);
        intersection.retainAll(myIntegerSet2);
        System.out.println("Intersection: " + intersection);

        // Deference
        Set<Integer> difference = new HashSet<>(myIntegerSet);
        difference.removeAll(myIntegerSet2);
        System.out.println("Difference: " + difference);

        for (Integer setValue : intersection) {
            System.out.print(" - " + setValue + " - > ");
        }

        System.out.println();
        Iterator<Integer> iterator = union.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.print("* " + next + " * ");
        }

        System.out.println();
        System.out.println();
        System.out.println("TREESET");
        System.out.println();
        // Tree Sets

//        SortedSet<String> fruits = new TreeSet<>();
//        SortedSet<String> fruits = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        SortedSet<String> fruits = new TreeSet<>(new SecondLetterComparator());
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Strawberry");
        fruits.add("Apple");
        fruits.add("baobab");

        System.out.println(fruits);
    }


}
