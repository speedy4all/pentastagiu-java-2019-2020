package src.mndragossh.week2.Strings;

import java.util.StringJoiner;

public class StringHomeWork {
    public static boolean isInString(String text, String target) {
        if (text.length() == 0) {
            return false;
        }

        for (var s : text.split(" ")
        ) {
            if (s.toLowerCase().equals(target.toLowerCase())) {
                return true;
            }
        }

        return false;
    }

    public static int charInString(String text, char character) {
        int times = 0;
        for (var s : text.split(" ")
        ) {
            for (var i = 0; i < s.length(); i++) {
                if (s.charAt(i) == character) {
                    times++;
                }
            }
        }
        return times;
    }

    public static boolean endWithString(String text, String end) {
        if (text.length() == 0 && end.length() != 0) {
            return false;
        }

        if (text.length() == end.length()) {
            return text.equals(end);
        }

        String[] textToArray = text.split(" ");
        if (textToArray[textToArray.length - 1].length() < end.length()) {
            return false;
        }

        var lastString = textToArray[textToArray.length - 1];
        return lastString.substring(lastString.length() - end.length(), end.length() + 1).equals(end);
    }

    public static String encodingAlpha(String inpString) {
        StringBuilder response = new StringBuilder();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = inpString.toCharArray();
        for (var ch : chars) {
            response.append(alpha.indexOf(ch));
        }
        return response.toString();
    }

    public static String insertCharacter(String text) {
        StringJoiner response = new StringJoiner(" ");
        String[] strArray = text.split(" ");
        for (var s : strArray) {
            for (var i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    s = s.replace(Character.toString(s.charAt(i)) + Character.toString(s.charAt(i)),
                            Character.toString(s.charAt(i)) + "#" + Character.toString(s.charAt(i)));
                }
            }
            response.add(s);
        }
        return response.toString();
    }

    public static boolean palindromeStr(String text) {
        int length = text.length();
        int start = 0;
        int end = length - 1;
        while (end > start) {
            char startChar = text.charAt(start++);
            char endChar = text.charAt(end--);
            if (startChar != endChar) {
                return false;
            }
        }
        return true;
    }
}
