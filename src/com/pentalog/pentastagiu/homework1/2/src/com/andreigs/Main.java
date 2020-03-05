package com.andreigs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt(), b=in.nextInt(), s=0, nr=0;
        for(int i=a; i<=b; i++)
        {
            s+=i;
            nr++;
        }
        System.out.println("Sum for range "+a+" to "+b+" : "+s);
        System.out.print("Average for range "+a+" to "+b+" : "+(float)s/nr);
    }
}
