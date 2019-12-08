

import java.util.Scanner;


/* Write a program that will sum up all numbers from 0 up to a target number.
        For example, for an input number 5, result should be 15 (0+1+2+3+4+5)
*/


public class SumNumbers {

    public static void main(String[] args) {
        System.out.println("Enter target number: ");
        int upToNumber;
        Scanner scanner = new Scanner(System.in);
        upToNumber = scanner.nextInt();
        int sum = 0;
        for (int i=0; i<=upToNumber; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of the numbers is : " +sum);

    }

}
