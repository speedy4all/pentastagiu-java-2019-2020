package homework1;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Integer n1=1;
        Integer n2=1;
        Integer n3;
        Integer userNumber;
        Integer sum=1;
        Integer i=2;
        Double average;
        System.out.println("Enter a number to print fibonacci number ");
        userNumber=scan.nextInt();
        System.out.print(n1+" "+n2);

        while(i<userNumber){
            n3=n1+n2;
            System.out.print(" " + n3);
            n1=n2;
            n2=n3;
            sum+=n3;
            i++;
        }

        average=(double)sum/userNumber;
        System.out.println("\nAverage of " + userNumber + " fibonacci numbers is " + average);

    }
}
