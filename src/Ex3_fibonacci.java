//  Write a program that will print the first x fibonacci numbers. Also calculate the average value. For example
//  For an input of x = 20 the output should be:
//  The first 20 Fibonacci numbers are:
//  1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
//  The average is 885.5

import java.util.Scanner;

public class Ex3_fibonacci {
    public static void main(String[] args) {

        int first = 0;
        int second = 1;
        double avg = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int num = scanner.nextInt();
        System.out.println("The first " + num + " Fibonacci numbers are: ");

        System.out.print(second);
        for (int i = 2; i <= num; i++) {
            int number = 0;
            number = first + second;
            System.out.print(" " + number);
            first = second;
            second = number;
            sum = sum + number;
        }
        System.out.println(" ");
        avg = sum / num;
        System.out.println("The average is " + avg);
    }
}
