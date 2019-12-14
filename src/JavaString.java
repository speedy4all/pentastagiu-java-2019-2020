// Write a program that test if a given String contains another String.

import java.util.Scanner;

public class JavaString {
    public static void main(String[] args) {
        String string = "Hello java world";
        if(string.contains("java")) {
            System.out.println("True");
        }  else {
            System.out.println("False");
        }
    }
}
