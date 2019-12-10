package Homework.Week2;

import java.util.Scanner;

public class pb14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String baseString = in.nextLine();
        String newString = "" + baseString.charAt(0);
        for (int i = 1; i<baseString.length(); ++i) {
            if(baseString.charAt(i) == baseString.charAt(i-1))
                newString+="#";
            newString+=baseString.charAt(i);
        }
        baseString = newString;
        System.out.println(baseString);
    }
}
