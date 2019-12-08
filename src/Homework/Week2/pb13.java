package Homework.Week2;

import java.util.Scanner;

public class pb13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String baseString = in.nextLine();
        for (char c : baseString.toCharArray()) {
            System.out.println(c-'a');
        }
    }
}
