package Homework.Week2;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class pb9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nrOfItemsInArray;
        int[] array = new int[30];
        nrOfItemsInArray = in.nextInt();
        for (int i = 0; i < nrOfItemsInArray; ++i) {
            array[i] = in.nextInt();
        }

        int evenCount = 0;
        for (int i = 0; i < nrOfItemsInArray; ++i) {
            if(array[i] % 2 == 0)
                evenCount++;
        }
        System.out.println(nrOfItemsInArray - evenCount);
        System.out.println(evenCount);
    }
}
