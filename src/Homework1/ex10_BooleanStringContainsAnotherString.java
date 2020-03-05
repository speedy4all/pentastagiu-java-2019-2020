package Homework1;

public class ex10_BooleanStringContainsAnotherString {
    public static void main(String[] args) {
        String s1 = "Hello java world";
        String s2 = "java";

        if(s1.contains(s2)){
            System.out.println("TRUE");
}else
        System.out.println("FALSE");
        }
}

/*
Write a program that test if a given String contains another String.

For example
Given the following base String “Hello java world” and the target test String “java” the output should be TRUE
 */