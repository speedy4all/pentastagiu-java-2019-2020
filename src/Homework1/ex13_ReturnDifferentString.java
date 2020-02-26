package Homework1;

import java.util.HashMap;
import java.util.Map;

public class ex13_ReturnDifferentString {
    public static void main(String[] args) {
        String alphabet = "abcdefgh";
        System.out.println(parse(alphabet));
    }
    // ex11_CountCharacterInAString letter = alphabet(0);
    //  System.out.println(result);
    public static String parse(String alphabet) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        //Adding elements to map
        map.put("a", 0);
        map.put("b", 1);
        map.put("c", 2);
        map.put("d", 3);
        map.put("e", 4);
        map.put("f", 5);
        map.put("g", 6);
        map.put("h", 7);
        map.put("i", 8);
        map.put("j", 9);
        map.put("k", 10);
        map.put("l", 11);
        map.put("m", 12);
        map.put("n", 13);
        map.put("o", 14);
        map.put("p", 15);
        map.put("q", 16);
        map.put("r", 17);
        map.put("s", 18);
        map.put("t", 19);
        map.put("u", 20);
        map.put("v", 21);
        map.put("w", 22);
        map.put("x", 23);
        map.put("y", 24);
        map.put("z", 25);
        String z = ""+ map.get("z");
        String result = "";
//    Set<String> keys = map.keySet();
//    for (String k : keys) {
//        System.out.println("Key: " + k)
        for (int i = 0; i < alphabet.length(); i++) {
            result += map.get(""+alphabet.charAt(i));
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


