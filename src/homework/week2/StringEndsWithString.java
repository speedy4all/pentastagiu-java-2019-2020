package homework.week2;


/*
Write a program that will test whether a string ends with another string

For example
Given the following strings “Hello java world” and “orld” the output should be TRUE

 */

import java.util.Scanner;

public class StringEndsWithString {
    public static void main(String[] args) {
        //Input the string
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String string= sc.nextLine();

        //Search the ending that you are looking for
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the ending you want to search for!");
        String searchedEnding = scanner.nextLine();

        System.out.println("Ends with character(s) '" + searchedEnding + "' " + string.endsWith(searchedEnding) );
    }
}
