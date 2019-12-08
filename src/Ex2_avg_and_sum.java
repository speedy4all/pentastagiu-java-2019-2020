//        Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
//        For example, for range numbers 1 to 100 output should be:
//        Sum for range 1 to 100 : 5050
//        Average for range 1 to 100 : 50.0

import java.util.Scanner;

public class Ex2_avg_and_sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int num1 = scanner.nextInt();
        System.out.println("Last number: ");
        int num2 = scanner.nextInt();


        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
            System.out.println("The sum is: " + sum);
        }
        double avg = (num1 + num2) / 2;
        System.out.println("The average is: " + avg);
    }
}
