package Homework1;

public class ex1_sum {
    public static void main(String[] args) {

        // Loop Blocks
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



