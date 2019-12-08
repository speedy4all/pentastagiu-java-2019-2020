//        Write a program that will sum up all numbers from 0 up to a target number
//        For example, for an input number 5, result should be 15 (0+1+2+3+4+5)

import java.util.Scanner;

public class Ex1_sum {
    public static void main(String[] args) {

        System.out.println("Target number: ");
        Scanner scanner = new Scanner(System.in);
        int targetNumber = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= targetNumber; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}
