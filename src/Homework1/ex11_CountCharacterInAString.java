package Homework1;

public class ex11_CountCharacterInAString {
    public static void main(String[] args) {
        String s = "Hello java world";
        char target = 'a';
        int count = 0;

        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == target){
                count++;
            }
        }
        System.out.println(count);
    }
}
/*
Write a program that will count how many times a character appears in a String
For example
Given the string “Hello java world” and the target character ‘a’ the output should be 2
(since ‘a’ appears twice in “Hello java world”)
 */