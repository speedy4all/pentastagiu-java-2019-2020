package com.andreigs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nr=in.nextInt();
        int f1=1, f2=1;
        int s=0;
        System.out.print(f1+" "+f2);
        for(int i=3; i<=nr; i++){
            int f3=f1+f2;
            s+=f3;
            System.out.print(" "+f3);
            f1=f2;
            f2=f3;
        }
        System.out.println();
        System.out.print("The average is "+(float)s/nr);
    }
}
