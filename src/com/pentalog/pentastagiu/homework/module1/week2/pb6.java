package com.pentalog.pentastagiu.homework.module1.week2;

import java.util.Scanner;

public class pb6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nrOfItemsInArray1, nrOfItemsInArray2, nrOfItemsInArray3;
        int[] array1 = new int[30];
        int[] array2 = new int[30];
        int[] array3 = new int[30];

        nrOfItemsInArray1 = in.nextInt();
        for (int i = 0; i < nrOfItemsInArray1; ++i) {
            array1[i] = in.nextInt();
        }

        nrOfItemsInArray2 = in.nextInt();
        for (int i = 0; i < nrOfItemsInArray2; ++i) {
            array2[i] = in.nextInt();
        }

        nrOfItemsInArray3 = 0;
        for (int i = 0; i < nrOfItemsInArray1; ++i) {
            array3[nrOfItemsInArray3++] = array1[i];
        }
        for (int i = 0; i<nrOfItemsInArray2; ++i) {
            array3[nrOfItemsInArray3++] = array2[i];
        }
        for (int i = 0; i<nrOfItemsInArray3; ++i) {
            System.out.print(array3[i] + " ");
        }
    }
}
