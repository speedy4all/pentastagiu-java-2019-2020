package com.andreigs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1=in.nextLine(), s2=in.nextLine();
        if(s1.contains(s2))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
