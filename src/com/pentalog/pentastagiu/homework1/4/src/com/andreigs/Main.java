package com.andreigs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] numbers=new int[20];
        for(int i=0; i<n; i++)
            numbers[i]=in.nextInt();
        if(numbers[0]==numbers[n-1])
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
