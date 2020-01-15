package com.pentalog.pentastagiu.homework2;

/*
Write a program that test if a given String contains another String.

For example
Given the following base String “Hello java world” and the target test String “java” the output should be TRUE

 */

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {

        //User input of the array
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the text using ' ' to separate words!");
        String input = scn.nextLine();
        System.out.println(input);
        Scanner tokenizer = new Scanner(input);
        tokenizer.useDelimiter(" ");
        ArrayList<String> arr = new ArrayList<>();
        while (tokenizer.hasNext()) {
            arr.add(tokenizer.next());
        }
        //Search for the desired word
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the word you want to search for!");
        String searchedWord = scanner.nextLine();
        if(arr.contains(searchedWord)){
            System.out.println("TRUE");
        }else
            System.out.println("FALSE");
    }
}
