package Homework1;//  Write a program to test whether a given string is a palindrome or not
//  For example
//  Given the following string “aaabccbaaa” should return TRUE
//  Given the following string “abccbb” should return FALSE

public class Ex15_palindrome {
    public static void main(String[] args) {
        String s = "aaabccbaac";
        boolean isPalindrome = true;

        int n = s.length() / 2;
        int lenght = s.length() - 1;

        for (int i = 0; i <= n; i++) {
            if (s.charAt(i) != s.charAt(lenght - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
