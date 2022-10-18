package com.pentalog.pentastagiu.homework2;

/*
Write a program that will return a different string representing the alphabet index of each letter.

Assuming we have the following alphabet encoding

a = 0
b = 1
c = 2
d = 3
…

For the given string “abcd” the output should be “0123”
 */

import java.util.ArrayList;
import java.util.Arrays;

public class AlphabetIndex {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + " = " + arr.indexOf(arr.get(i)));
        }
    }
}