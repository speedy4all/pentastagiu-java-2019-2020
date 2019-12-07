package homework.week2;

/*
Write a program that will print the first x fibonacci numbers. Also calculate the average value. For example
For an input of x = 20 the output should be:

The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5

 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int n, first = 0, next = 1;
        float avg = 0;

        System.out.println("Enter how many Fibonacci numbers to print: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.print("The first " + n + " Fibonacci numbers are: ");
        System.out.print(first + " " + next);
        for (int i = 1; i<=n-2; ++i)
        {
            int sum = first + next;
            first = next;
            next = sum;
            System.out.print(" " + sum);
            avg = sum/n;
        }
        System.out.println("\nThe average of the first " + n + " Fibonacci numbers is: " + avg);
    }
}