package com.pentalog.pentastagiu.homework2;

import java.util.Scanner;
/*
Write a Java program to find the number of even and odd integers in a given array of integers

For example.
Given the following array [13,20,14,5,2,8] the output should be:

Odd elements count : 2
Even elements count : 4

 */
public class EvenAndOddArray {
    public static void main(String[] args) {
        //User input of the array
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the number of size of array");
        size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter a integer array element");
        //For reading the element
        for(int i=0; i<size; i++) {
            a[i] = sc.nextInt();
        }
        //Check the number of even and odd elements
        int evenCounter=0, oddCounter=0;
        for(int i=0;i<size;i++){
            if(a[i]%2==0){
                evenCounter++;
            }else{
                oddCounter++;
            }
        }
        System.out.println("The number of even numbers in the list is " + evenCounter + "\nThe number of odd numbers in the list is " + oddCounter);
    }
}
