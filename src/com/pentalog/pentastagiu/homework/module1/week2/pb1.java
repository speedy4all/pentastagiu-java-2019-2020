package com.pentalog.pentastagiu.homework.module1.week2;

import java.util.Scanner;

public class pb1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int targetNumber, suma = 0;
        targetNumber = in.nextInt();
        for(int i = 0; i<=targetNumber; ++i)
        {
            suma+=i;
        }
        //sau suma = targetNumber*(targetNumber+1)/2;
        System.out.println(suma);
    }
}
