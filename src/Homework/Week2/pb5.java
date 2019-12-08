package Homework.Week2;

import java.util.Scanner;

public class pb5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nrOfItemsInArray1, nrOfItemsInArray2;
        int[] array1 = new int[30];
        int[] array2 = new int[30];

        nrOfItemsInArray1 = in.nextInt();
        for (int i = 0; i < nrOfItemsInArray1; ++i) {
            array1[i] = in.nextInt();
        }

        nrOfItemsInArray2 = in.nextInt();
        for (int i = 0; i < nrOfItemsInArray2; ++i) {
            array2[i] = in.nextInt();
        }

        if(nrOfItemsInArray1 != nrOfItemsInArray2) {
            System.out.println("FALSE");
            return;
        }
        for(int i = 0; i<nrOfItemsInArray1; ++i) {
            if(array1[i] != array2[i])
            {
                System.out.println("FALSE");
                return;
            }
        }
        System.out.println("TRUE");
    }
}
