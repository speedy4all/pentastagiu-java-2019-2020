package com.pentalog.pentastagiu.homework.module1.week2;

import java.util.Scanner;

public class pb7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nrOfItemsInArray;
        int[] array = new int[30];
        nrOfItemsInArray = in.nextInt();
        for (int i = 0; i < nrOfItemsInArray; ++i) {
            array[i] = in.nextInt();
        }

        double suma = 0;
        int min = Integer.MAX_VALUE, max = 0;
        for (int i = 0; i < nrOfItemsInArray; ++i) {
            suma += array[i];
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(suma/nrOfItemsInArray);
    }
}
