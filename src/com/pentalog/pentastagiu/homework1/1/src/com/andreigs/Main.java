package com.andreigs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), s=0;
        for(int i=0; i<=n; i++)
            s+=i;
        System.out.println(s);
    }
}
