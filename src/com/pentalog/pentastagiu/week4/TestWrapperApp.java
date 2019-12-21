package com.pentalog.pentastagiu.week4;

public class TestWrapperApp {

    public static void main(String[] args) {
        Integer myIntWrapper = 1;
        int i = new Integer(5);
        int j = Integer.parseInt("123");
        System.out.println(j);

        Integer mySecondWrapper = Integer.valueOf("34");
        System.out.println(mySecondWrapper);

        String s1 = "Hello";
        String s2 = "Hello";

        /*if (s1 == s2) {
            System.out.println("The same string object in memory");
        }*/

        String s3 = new String("Hello");
        String s4 = new String("Hello");

        if (s3 == s4) {
            System.out.println("The same string object in memory");
        }

        if (s3.equals(s4)) {
            System.out.println("Strings are equal");
        }

    }

}
