package com.andreigs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr= new int[20];
        for(int i=0; i<n; i++)
            arr[i]=in.nextInt();
        int target=in.nextInt();

        for(int i=0; i<n; i++)
            if(arr[i]==target)
                System.out.print(i+" ");
    }
}
