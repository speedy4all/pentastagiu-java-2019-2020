//Write a program that will print the first x fibonacci numbers.
// Also calculate the average value.

import java.util.Scanner;

public class FiboNums {
    public static void main (String[] args) {

        int n;
        int prev = 0;
        int next = 1;
        float avg = 0;

        System.out.println("Please type the number for calculating the Fibonacci string: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.print("The Fibonacci string for number " + n + " is: ");
        System.out.print(prev + " " + next);
        for (int i = 1; i <= n-2; i++)
        {
            int sum = prev + next;
            prev = next;
            next = sum;
            System.out.print(" " + sum);
            avg = sum / n;
        }
        System.out.println("\n The avg of the Fibo string is: " + avg);
    }
}
