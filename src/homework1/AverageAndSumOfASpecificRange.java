package homework1;

import java.util.Scanner;

public class AverageAndSumOfASpecificRange {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        Double sum=0.0;
        Double average=0.00;
        Integer loopCount=0;
        System.out.println("Hello! Please enter two numbers to find the sum and average of numbers included in that range. \nEnter start number");
        Integer numberStart=scan.nextInt();
        System.out.println("Enter end number");
        Integer numberEnd=scan.nextInt();

        for(int i=numberStart;i<=numberEnd;i++){
            sum+=i;
            loopCount++;
        }
        average=sum/loopCount;

        System.out.println("Numbers included in this range: " + loopCount);
        System.out.println("Sum of numbers between " + numberStart + " and " + numberEnd +" is " + sum);
        System.out.println("Average of numbers between " + numberStart + " and " + numberEnd +" is " + average);

    }
}
