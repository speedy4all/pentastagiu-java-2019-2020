package homework.week2;

/*
Write a program that test whether 2 int arrays are equal. Equality in this case means that both arrays have the same number of elements an element on a specific index in first array is equal to the element on the same index in the second array.

For example

For the following arrays [1,2,3,4] and [1,2,3,4] the output should be TRUE
For the following arrays [] and [] the output should be TRUE
For the following arrays [1,3,2] and [1,3] the output should be FALSE
For the following arrays [1,2,3,4] and [1,2,4,3] the output should be FALSE
 */

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {

        //User input of the arrays
        //First array
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the number of size of the first array");
        size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter a integer array element");
        //For reading the element
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        //Second array
        int size2;
        System.out.println("Enter the number of size of the second array");
        size2 = sc.nextInt();
        int[] b = new int[size2];
        System.out.println("Enter a integer array element");
        //For reading the element
        for (int i = 0; i < size2; i++) {
            b[i] = sc.nextInt();
        }

        //Comparing if the arrays are the equal
        if(Arrays.equals(a,b)){
            System.out.println("For the following arrays: " + Arrays.toString(a) + " and " + Arrays.toString(b) + " the equality is TRUE");
        }else{
            System.out.println("For the following arrays: " + Arrays.toString(a) + " and " + Arrays.toString(b) + " the equality is FALSE");
        }
    }
}
