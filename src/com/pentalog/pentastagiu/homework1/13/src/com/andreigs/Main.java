package com.andreigs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s = in.nextLine().toLowerCase().toCharArray(); int sl=s.length;
        for(int i=0; i<sl; i++)
            System.out.print((int)s[i]-97);
    }
}
