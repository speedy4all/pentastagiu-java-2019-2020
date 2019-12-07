package homework.week2;

/*
Write a program that will insert a # between any duplicate letters that are placed right next to each other.
For example

Given the following string “Hello world” the output should be “Hel#lo world”
 */

import java.util.Scanner;

public class InsertCharIntoString {
    public static void main(String[] args) {
        //Input the string
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String string = sc.nextLine();

        //Insert "#" into char duplicates
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(i - 1)) {
                string = string.substring(0, i) + "#" + string.substring(i);
            }
        }
        System.out.println(string);
    }
}
