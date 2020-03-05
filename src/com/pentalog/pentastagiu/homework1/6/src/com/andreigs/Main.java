package com.andreigs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), m=in.nextInt();
        int[] numbers1 = new int[20], numbers2 = new int[20], concatenatedArr = new int[40];
        for(int i=0; i<n; i++)
            numbers1[i]=in.nextInt();
        for(int i=0; i<m; i++)
            numbers2[i]=in.nextInt();

        for(int i=0; i<n+m; i++)
            if(i<n)
                concatenatedArr[i]=numbers1[i];
            else
                concatenatedArr[i]=numbers2[i-n];

        for(int i=0; i<n+m; i++)
            System.out.print(concatenatedArr[i]+" ");
    }
}
