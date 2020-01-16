package com.pentalog.pentastagiu.week5.collections;

import java.util.*;

public class Sets {

    public static void main(String[] args) {
        Set<Integer> myIntegerSet = new HashSet<>();
        Set<Integer> myIntegerSet2 = new HashSet<>();
        myIntegerSet.addAll(Arrays.asList(1,2,3,4,5));
        myIntegerSet2.addAll(Arrays.asList(5,6,7,8));
        System.out.println(myIntegerSet);

        //Union
        Set<Integer> union = new HashSet<>(myIntegerSet);
        union.addAll(myIntegerSet2);
        System.out.println("Union: " + union);

        //intersection
        Set<Integer> intersecton = new HashSet<>(myIntegerSet);
        intersecton.retainAll(myIntegerSet2);
        System.out.println("Intersection: " + intersecton);

        //diff

        Set<Integer> diff = new HashSet<>(myIntegerSet);
        diff.removeAll(myIntegerSet2);
        System.out.println("Differention: " + diff);

        for (Integer setValue : diff){
            System.out.print(" - " + setValue + " ->");
        }

        System.out.println();
        Iterator<Integer> iterator =  union.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.print("* " + next + " * ");
        }

        System.out.println();
        //TreeSet
        //SortedSet<String> fruits = new TreeSet<>();
        //SortedSet<String> fruits = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        SortedSet<String> fruits = new TreeSet<>(new SecondLetterComparator());
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Strawberries");
        fruits.add("Banana");
        fruits.add("baoBaB");

        System.out.println(fruits);
    }


}
