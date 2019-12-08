package Homework.Week2;

import java.util.Scanner;

public class pb15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String baseString = in.nextLine();
        for(int i = 0; i<baseString.length()/2; ++i)
        {
            if(baseString.charAt(i) != baseString.charAt(baseString.length()-1-i))
            {
                System.out.println("FALSE");
                return;
            }
        }
        System.out.println("TRUE");
    }
}
