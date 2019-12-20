package com.andreigs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), m=in.nextInt();
        int[] numbers1 = new int[20], numbers2 = new int[20];
        for(int i=0; i<n; i++)
            numbers1[i]=in.nextInt();
        for(int i=0; i<m; i++)
            numbers2[i]=in.nextInt();

        int ok=1;
        for(int i=0; i<n; i++)
            if(numbers1[i]!=numbers2[i] && ok==1){
                System.out.println("FALSE");
                ok=0;
            }
        if(ok==1)
            System.out.println("TRUE");
    }
}
