package com.pentalog.pentastagiu.homework2;

/*
Write a java program that will concatenate 2 arrays.
For example
Given 2 arrays [1,2,3,4] and [5,6,7,8] the output should be a new array containing [1,2,3,4,5,6,7,8]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ConcatenateArrays {
    public static void main(String[] args) {
        //User input of the arrays
        //First array
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the number of size of the first array");
        size = sc.nextInt();
        String[] a = new String[size];
        System.out.println("Enter array element");
        //For reading the element
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextLine();
        }
        //Second array
        int size2;
        System.out.println("Enter the number of size of the second array");
        size2 = sc.nextInt();
        String[] b = new String[size2];
        System.out.println("Enter array element");
        //For reading the element
        for (int i = 0; i < size2; i++) {
            b[i] = sc.nextLine();
        }
        //Concatenating the arrays
        ArrayList<String> temp = new ArrayList<>();
        temp.addAll(Arrays.asList(a));
        temp.addAll(Arrays.asList(b));
        String [] concatenatedArgs = temp.toArray(new String[a.length+b.length]);
        System.out.println(Arrays.toString(concatenatedArgs));
    }
}

