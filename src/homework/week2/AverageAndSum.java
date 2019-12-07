package homework.week2;

/*
Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
For example, for range numbers 1 to 100 output should be:

Sum for range 1 to 100 : 5050
Average for range 1 to 100 : 50.0

 */

import java.util.Scanner;

public class AverageAndSum {
    public static void main(String[] args) {
        System.out.println("Enter the lower limit number: ");
        Scanner numberOne = new Scanner(System.in);
        int lowerLimit = numberOne.nextInt();
        System.out.println("Enter the high limit number: ");
        Scanner numberTwo = new Scanner(System.in);
        int highLimit = numberTwo.nextInt();
        int sum = 0;
        float avg = 0;
        for(int i = lowerLimit; i<= highLimit; i++){
            sum = sum + i;
            for(int counter=lowerLimit; counter<= highLimit; counter++)
            avg = sum/counter;
        }
        System.out.println("The sum for range " + lowerLimit + "to "+ highLimit + " is: " + sum);
        System.out.println("The average for range "+ lowerLimit + "to "+ highLimit + " is: " + avg);
    }
}
