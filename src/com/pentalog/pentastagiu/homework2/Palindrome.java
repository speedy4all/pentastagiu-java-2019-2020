package com.pentalog.pentastagiu.homework2;

/*
Write a program to test whether a given string is a palindrome or not

For example
Given the following string “aaabccbaaa” should return TRUE
Given the following string “abccbb” should return FALSE
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        String original;
        StringBuilder reverse = new StringBuilder();
        Scanner in = new Scanner(System.in);
        System.out.println("Input a word or number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse.append(original.charAt(i));
        if (original.equals(reverse.toString()))
            System.out.println("Original word or number '" + original + "' is the same with '" + reverse + "' so it is a palindrome!");
        else
            System.out.println("Original word or number '" + original + "' is NOT the same with '" + reverse + "' so it is NOT a palindrome!");
    }
}
