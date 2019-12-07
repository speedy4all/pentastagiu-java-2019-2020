package homework.week2;

import java.util.Arrays;
import java.util.Scanner;

/*
Write a java program that will test whether the first and the last element of an int array are the same. We can assume the array has 2 or more elements.

For example:
For the following input [13,6,2,8,2,3] the output should be : FALSE
For the following input [13,6,2,8,2,13] the output should be : TRUE

 */
public class ArrayNumbersSame {
    public static void main(String[] args) {
        //User input of the array
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the number of size of array");
        size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter a integer array element");
        //For reading the element
        for(int i=0; i<size; i++) {
            a[i] = sc.nextInt();
        }

        //For print the array element
        System.out.print(Arrays.toString(a));

        //Checking if the first element is the same with the last element
        double firstNumber = a[0];
        double lastNumber = a[a.length-1];
        if(firstNumber == lastNumber) {
            System.out.println("\nTRUE");
        }else{
            System.out.println("\nFALSE");
        }
    }
}

