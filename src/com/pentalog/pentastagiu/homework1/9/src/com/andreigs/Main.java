package com.andreigs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), x, odd=0, even=0;
        for(int i=0; i<n; i++){
            x=in.nextInt();
            if(x%2==0)
                even++;
            else
                odd++;
        }

        System.out.println("Odd elements count: "+odd);
        System.out.println("Even elements count: "+even);
    }
}
