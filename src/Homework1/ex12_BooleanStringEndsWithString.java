package Homework1;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class ex12_BooleanStringEndsWithString {
    public static void main(String[] args) {
        String sir1 = "Hello java world";
        String sir2 = "world";

        System.out.println("Sirul " + sir1 + " se termina cu " + sir2 + " : " + isSufix(sir1, sir2));
    }
    private static boolean isSufix(String sir1, String sir2) {
        String[] words = sir1.split(" ");

        if (words[words.length - 1].equals(sir2))
            return true;
        else
            return false;
    }
}
    /* Write a program that will test whether a string ends with another string

        For example
        Given the following strings “Hello java world” and “world” the output should be TRUE

        */