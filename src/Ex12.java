import java.util.*;

public class Ex12 {
//Write a program that will insert a # between any duplicate letters that are placed right next to each.
//For example
//
//Given the following string “Hello world” the output should be “Hel#lo world”

    public static void main(String[] args) {
        String string = "Hello world";
        inserting(string, 0);
        System.out.println(output);


    }

    static String output = "";

    public static void inserting(String input, int i) {
        output = output + input.charAt(i);

        if (i == input.length() - 1)  {
            return;
        }

        if (input.charAt(i) == input.charAt(i+1)) {
            output = output + '#';
        }

        inserting(input, i+1);

    }}
