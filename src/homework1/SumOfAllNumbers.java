package homework1;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Integer yourNumber;
        Integer sum=0;
        System.out.println("Hello user! Please enter a number to calculate  the sum from zero to the number you specified.");

        yourNumber=scan.nextInt();

        for(int i=0;i<=yourNumber;i++){
            sum+=i;
        }
        System.out.println("The sum from 0 to " + yourNumber + " is " + sum);
    }
}
