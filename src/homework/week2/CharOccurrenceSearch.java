package homework.week2;

/*
Write a program that will count how many times a character appears in a String

For example
Given the string “Hello java world” and the target character ‘a’ the output should be 2
(since ‘a’ appears twice in “Hello java world”)

 */

import java.util.Scanner;

public class CharOccurrenceSearch {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a text: ");
            String haystack = sc.nextLine();

            int count = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type the character you want to search for: ");
            char needle = scanner.nextLine().charAt(0);

            for (int i=0; i < haystack.length(); i++)
            {
                if (haystack.charAt(i) == needle)
                {
                    count++;
                }
            }
            System.out.println("The character '" + needle + "' appears in text " + count + " times.");
        }
    }

