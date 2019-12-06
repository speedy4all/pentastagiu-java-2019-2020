import java.util.*;

public class Ex11 {
//Write a program to test whether a given string is a palindrome or not
//
//For example
//Given the following string “aaabccbaaa” should return TRUE
//Given the following string “abccbb” should return FALSE

    public static void main(String[] args) {

        String string1 = "aaabccbaaa";
        String string2 = "abccbb";

        System.out.println(palindrome(string1));
        System.out.println(palindrome(string2));

    }

    public static boolean palindrome(String sir) {
        int i = 0;
        int j = sir.length() - 1;

        while (i < j) {

            if (sir.charAt(i) != sir.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
