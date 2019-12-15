package Homework1;


import java.util.Arrays;

public class ex6_Concatenate2Arrays {
    public static int[] concat(int[] array1, int[] array2) {
        int[] arr = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            arr[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            arr[array1.length + i] = array2[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(concat(new int[]{1, 2, 3, 4,5}, new int[]{5, 6, 7,8,9,10})));
    }
}

/*
Write a java program that will concatenate 2 arrays.
For example: Given 2 arrays [1,2,3,4] and [5,6,7,8]
the output should be a new array containing [1,2,3,4,5,6,7,8]
 */