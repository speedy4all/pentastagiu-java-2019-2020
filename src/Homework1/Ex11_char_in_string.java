package Homework1;//  Write a program that will count how many times a character appears in a String
//  For example
//  Given the string “Hello java world” and the target character ‘a’ the output should be 2
//  (since ‘a’ appears twice in “Hello java world”)

public class Ex11_char_in_string {
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
