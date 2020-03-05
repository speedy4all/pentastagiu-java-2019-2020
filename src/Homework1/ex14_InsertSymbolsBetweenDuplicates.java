package Homework1;
public class ex14_InsertSymbolsBetweenDuplicates {
    public static void main(String[] args) {
        String lett = "Hello worlld this is someething cooll";
        String lett2 = "Hellllllo";
        String insert = "-";
        System.out.println(processString(lett,insert));
        System.out.println(processString(lett2,"$"));
    }
    private static String processString(String s, String delimitator) {
        StringBuilder rs = new StringBuilder();
        if (s.length() > 1)
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    rs.append( s.substring(i, i + 1)).append(delimitator);
                } else {
                    rs.append( s.substring(i, i + 1));
                }
            }
        rs.append(s.substring(s.length() - 1));
        return rs.toString();
    }
}

/*
Write a program that will insert a # between any duplicate letters that are placed right next to each.
For example

Given the following string “Hello world” the output should be “Hel#lo world”
 */