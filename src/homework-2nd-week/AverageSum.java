import java.util.Scanner;

/*Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
  For example, for range numbers 1 to 100 output should be:
         Sum for range 1 to 100 : 5050
         Average for range 1 to 100 : 50.0*/

public class AverageSum {
    public static void main(String[] args) {

        System.out.println("Enter lowest number: ");
        Scanner firstNumber = new Scanner(System.in);
        int fromNumber = firstNumber.nextInt();


        System.out.println("Enter highest number: ");
        Scanner secondNumber = new Scanner(System.in);
        int uptoNumber = secondNumber.nextInt();

        int sum = 0;
        int avg = 0;

        for (int i = fromNumber; i <= uptoNumber; i++) {
            sum = sum + i;
            /* avg = sum / i; */
        }

        for (int count = fromNumber; count <= uptoNumber; count++) {
            avg = sum/count;
        }

        System.out.println ("Sum of numbers from " + fromNumber + " up to " + uptoNumber + " equals " + sum);
        System.out.println ("Average of numbers from " + fromNumber + " up to " + uptoNumber + " equals " + avg);

    }
}
