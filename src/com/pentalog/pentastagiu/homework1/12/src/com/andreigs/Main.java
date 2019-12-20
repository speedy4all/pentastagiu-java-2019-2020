package com.andreigs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] s1=in.nextLine().toCharArray(); int ls1=s1.length;
        char[] s2=in.nextLine().toCharArray(); int ls2=s2.length;

        int ok=1;
        for(int i=ls1-1; i>=0; i--){
            if(ls2<=0)
                break;
            if(s1[i]!=s2[ls2-1] && ok==1){
                System.out.println("FALSE");
                ok=0;
            }
            ls2--;
        }

        if(ok==1)
            System.out.println("TRUE");
    }
}
