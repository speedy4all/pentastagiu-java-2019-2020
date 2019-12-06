import java.util.*;

public class Ex13 {
//Write a program that will test whether a string ends with another string
//
//For example
//Given the following strings “Hello java world” and “orld” the output should be TRUE

    public static boolean endsWithMethod(String sir1, String sir2) {
        if (sir1.endsWith(sir2)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        String sir1 = "Hello world";
        String sir2 = "orld";

        System.out.println(endsWithMethod(sir1, sir2));
    }
}
