package com.andreigs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s=in.nextLine().toCharArray();
        char c=in.nextLine().toCharArray()[0];

        int ap=0;
        for(int i=0; i<s.length; i++)
            if(s[i]==c)
                ap++;

        System.out.println(ap);
    }
}
