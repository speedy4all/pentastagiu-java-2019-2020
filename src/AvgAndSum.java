//Write a program that will calculate the average and sum
// of all numbers between the range of 2 numbers.
import java.util.Scanner;

    public class AvgAndSum {
        public static void main(String[] args) {

            System.out.println("Please type low limit number: ");
            Scanner firstNumber = new Scanner(System.in);
            int lowLimit = firstNumber.nextInt();

            System.out.println("Please type high limit number: ");
            Scanner secondNumber = new Scanner(System.in);
            int highLimit = secondNumber.nextInt();

            float sum = 0;
            double avg = 0;

            for(int i = lowLimit; i<= highLimit; i++){
                sum = sum + i;
                for(int counter=lowLimit; counter<= highLimit; counter++)
                    avg = sum/counter;
            }

            System.out.println("The sum for range " + lowLimit + "to "+ highLimit + " is: " + sum);
            System.out.println("The average for range "+ lowLimit + "to "+ highLimit + " is: " + avg);
        }
    }

