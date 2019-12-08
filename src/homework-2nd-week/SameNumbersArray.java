

import java.util.Scanner;


/* Write a java program that will test whether the first and the last element of an int array are the
same. We can assume the array has 2 or more elements.
For example:
For the following input [13,6,2,8,2,3] the output should be : FALSE
For the following input [13,6,2,8,2,13] the output should be : TRUE
 */

public class SameNumbersArray {
    public static void main(String[] args) {

        int size;
        System.out.println("Please enter array size: ");
        Scanner sizeNumber = new Scanner(System.in);
        size = sizeNumber.nextInt();
        int[] array = new int[size];

        System.out.println("Please enter the array elements: ");

        for (int i=0; i<size; i++) {
            array [i] = sizeNumber.nextInt();
        }

        int firstNumber = array[0];
        int lastNumber = array[array.length-1];

        if (firstNumber == lastNumber) {
            System.out.println("The first and last element from both arrays are equal");
        } else
            System.out.println("The first and last element from both arrays are NOT equal");






    }
}



