package com.andreigs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), s=0, min=10000, max=0;
        for(int i=0; i<n; i++){
            int m=in.nextInt();
            s+=m;
            if(min>m)
                min=m;
            if(max<m)
                max=m;
        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.printf("Average: %.1f", (float)s/n);

    }
}
