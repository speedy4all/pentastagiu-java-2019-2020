package Homework1;

import java.util.HashMap;
import java.util.Map;

public class ex13_ReturnDifferentString {
    public static void main(String[] args) {
        String alphabet = "abcd";
        System.out.println(parse(alphabet));
    }
    // ex11_CountCharacterInAString letter = alphabet(0);
    //  System.out.println(result);
    public static String parse(String alphabet) {
        Map<String, Integer> myap = new HashMap<String, Integer>();
        //Adding elements to map
        myap.put("a", 0);
        myap.put("b", 1);
        myap.put("c", 2);
        myap.put("d", 3);
        myap.put("e", 4);
        myap.put("f", 5);
        myap.put("g", 6);
        myap.put("h", 7);
        myap.put("i", 8);
        myap.put("j", 9);
        myap.put("k", 10);
        myap.put("l", 11);
        myap.put("m", 12);
        myap.put("n", 13);
        myap.put("o", 14);
        myap.put("p", 15);
        myap.put("q", 16);
        myap.put("r", 17);
        myap.put("s", 18);
        myap.put("t", 19);
        myap.put("u", 20);
        myap.put("v", 21);
        myap.put("w", 22);
        myap.put("x", 23);
        myap.put("y", 24);
        myap.put("z", 25);
        String z = ""+ myap.get("z");
        String result = "";
//    Set<String> keys = map.keySet();
//    for (String k : keys) {
//        System.out.println("Key: " + k)
        for (int i = 0; i < alphabet.length(); i++) {
            result += myap.get(""+alphabet.charAt(i));
        }
        return result;
    }
}
/*
Write a program that will return a different string representing the alphabet index of each letter.
Assuming we have the following alphabet encoding
a = 0
b = 1
c = 2
d = 3
…
For the given string “abcd” the output should be “0123”
 */


