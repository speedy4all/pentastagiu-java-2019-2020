package Homework1;

    public class ex1_Sum {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8};
// Calculate sum up all numbers from 0 up to a target number
// Target number is 6
    /*
    int sum = ints[0] + ints[1] + ints[3] + ints[4] + ints[5];
        System.out.println("suma numerelor alese din intervalul mentionat este: " + sum);
     */

        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum = sum + ints[i];
        }
        System.out.println("suma numerelor alese din intervalul mentionat este: " + sum);
    }
}

/* Cerinta:
Write a program that will sum up all numbers from 0 up to a target number.
For example, for an input number 5, result should be 15 (0+1+2+3+4+5) */

