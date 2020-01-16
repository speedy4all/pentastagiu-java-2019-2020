package com.pentalog.pentastagiu.week5.lambdas;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdasExample {

    public static void main(String[] args) {

        FunctionalInterface multiply = (int x) -> System.out.println(2 * x);

        multiply.alandalaPortocala(10);

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3));

        integers.forEach( element -> System.out.println(element));
        integers.forEach( element -> System.out.println(element*2));
        integers.forEach( element -> System.out.println(element+2));

    }
}
