package com.pentalog.pentastagiu.homework.module1.week2;

import java.util.Scanner;

public class pb2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int from, to;
        from = in.nextInt();
        to = in.nextInt();

        int sum = (from + to) * (to - from + 1) / 2;
        double average = (double)(from + to) / 2;
        System.out.println("Sum for range " + from + " to " + to + " : " + sum);
        System.out.println("Average for range " + from + " to " + to + " : " + average);
        //in exemplu pe foaie scrie 50.0,  raspunsul nu e 50.5?
    }
}
