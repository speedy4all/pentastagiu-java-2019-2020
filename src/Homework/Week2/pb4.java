package Homework.Week2;

import java.util.Scanner;

public class pb4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nrOfItemsInArray;
        int[] array = new int[30];
        nrOfItemsInArray = in.nextInt();
        for (int i = 0; i < nrOfItemsInArray; ++i) {
            array[i] = in.nextInt();
        }
        if(array[0] == array[nrOfItemsInArray-1])
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
