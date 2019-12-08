package Homework.Week2;

import java.util.Scanner;

public class pb11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String givenString = in.nextLine();
        char charaterToLookFor = in.nextLine().charAt(0);
        int count = 0;
        for (char c : givenString.toCharArray()) {
            if(c == charaterToLookFor)
                count++;
        }
        System.out.println(count);
    }
}
