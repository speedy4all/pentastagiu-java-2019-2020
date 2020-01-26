package com.pentalog.pentastagiu.homework.module1.week2;

import java.util.Scanner;

public class pb3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, suma = 0;
        x = in.nextInt();
        if(x == 0)
            return;

        System.out.println("The first " + x + " Fibonacci numbers are:");
        if(x == 1)
        {
            System.out.print(1);
            suma = 1;
        }
        else if(x > 1) {
            System.out.print("1 ");
            System.out.print("1 ");
            suma = 2;
            int currFib = 1, lastFib = 1, rez;
            for (int i = 2; i < x; ++i)
            {
                rez = lastFib + currFib;
                System.out.print(rez + " ");
                suma += rez;
                lastFib = currFib;
                currFib = rez;
            }
        }
        System.out.println();
        System.out.println("The average is " + ((double)suma)/x);

        System.out.println();
    }
}
