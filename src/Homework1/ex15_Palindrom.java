package Homework1;

public class ex15_Palindrom {
    public static void main(String[] args) {
        String s1 = "ababa";
        String s2 = "aba";
        String s3 = "abba";
        String s4 = "aaaabaaaa";
        String s5 = "abbabb";
        System.out.println("The provided string" + s1 + " is palindrome: " + isPalindrome(s1));
        System.out.println("The provided string" + s2 + " is palindrome: " + isPalindrome(s2));
        System.out.println("The provided string" + s3 + " is palindrome: " + isPalindrome(s3));
        System.out.println("The provided string" + s4 + " is palindrome: " + isPalindrome(s4));
        System.out.println("The provided string" + s5 + " is palindrome: " + isPalindrome(s5));
    }

    private static boolean isPalindrome(String s) {
//        StringBuilder reversedString = new StringBuilder(s).reverse();
//        return s.equals(reversedString.toString());
        boolean isPalindrome = true;
        int n = s.length() / 2;
        int lenght = s.length() - 1;
        for (int i = 0; i <= n; i++) {
            if (s.charAt(i) != s.charAt(lenght - i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}

/*
Write a program to test whether a given string is a palindrome or not

For example
Given the following string “aaabccbaaa” should return TRUE
Given the following string “abccbb” should return FALSE
 */