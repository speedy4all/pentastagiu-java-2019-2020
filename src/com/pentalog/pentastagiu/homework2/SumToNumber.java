package com.pentalog.pentastagiu.homework2;

import java.util.Scanner;

/*
Write a program that will sum up all numbers from 0 up to a target number.
For example, for an input number 5, result should be 15 (0+1+2+3+4+5)
 */

public class SumToNumber {
    public static void main(String[] args) {
        System.out.println("Enter the target number: ");
        int targetNumber;
        Scanner scanner = new Scanner(System.in);
        targetNumber=scanner.nextInt();
        int sum=0;
        for(int i=0; i<=targetNumber;i++){
            sum=sum+i;
        }
        System.out.println("The result is: " + sum);
    }
}

