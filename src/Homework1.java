import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Homework1 {

    static void sumFrom0ToN(int n) {
        if (n < 0)
            System.out.println("n must be greater than 0");
        else {
            System.out.println("The sum of all numbers from 0 up to " + n + " is: " + n * (n + 1) / 2);
        }
    }

    static void averageAndSumOfARange(long min, long max) {
        long sum = (min + max) * (max - min + 1) / 2;
        double average = (double) sum / (max - min + 1);
        System.out.println("Sum for range " + min + " to " + max + ": " + sum);
        System.out.println("Average for range " + min + " to " + max + ": " + average);
    }

    static void printXFibonacciNumbers(int x) {
        if (x <= 0)
            System.out.println("is not possible !");
        else if (x == 1) {
            System.out.println("The first fibonacci number is: \n 1");
            System.out.println("The average is 1");
        } else if (x == 2) {
            System.out.println("The first 2 fibonacci numbers are: \n 1 1");
            System.out.println("The average is 1");
        } else {
            int a = 1, b = 1, c;
            double sum = 2, average;
            System.out.print("The first " + x + " fibonacci numbers are: \n 1 1");
            for (int i = 2; i < x; i++) {
                c = a + b;
                System.out.print(" " + c);
                sum += c;
                a = b;
                b = c;
            }
            System.out.println();
            System.out.println("The average is " + sum / x);
        }

    }

    static boolean areFirstAndLastElementEquals(int[] array) {
        return array[0] == array[array.length - 1];
    }

    static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i])
                return false;
        }
        return true;

    }

    static int[] concatenateArrays(int[] prefixArray, int[] suffixArray) {
        int[] array = new int[prefixArray.length + suffixArray.length];
        for (int i = 0; i < prefixArray.length; i++)
            array[i] = prefixArray[i];
        for (int i = 0; i < suffixArray.length; i++)
            array[i + prefixArray.length] = suffixArray[i];
        return array;
    }

    static Map<String, Float> getMaxMinAndAverage(int[] array) {
        Map<String, Float> map = new HashMap<String, Float>();
        if (array.length >= 1) {
            int sum = array[0];
            int max = array[0];
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                sum += array[i];
                if (array[i] < min)
                    min = array[i];
                else if (array[i] > max)
                    max = array[i];
            }
            float average = (float) sum / array.length;
            map.put("Max", (float) max);
            map.put("Min", (float) min);
            map.put("Average", average);
        }
        return map;
    }

    static int getIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target)
                return i;
        }
        return -1;
    }

    static void findNumberOfOddAndEvenNumbers(int[] array) {
        int oddNumbers = 0, evenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 0)
                evenNumbers++;
            else
                oddNumbers++;
        }
        System.out.println("EvenNumbers: " + evenNumbers);
        System.out.println("OddNumbers: " + oddNumbers);
    }

    // Rabin-Karp Substring Search
    static boolean isString2InString1(String s1, String s2) {
        if (s2.length() > s1.length())
            return false;

        int s2HashCode = s2.hashCode();
        int substringHashCode = s1.substring(0, s2.length()).hashCode();
        if (substringHashCode == s2HashCode && s1.substring(0, s2.length()).equals(s2)) {
            return true;
        }

        for (int i = 1; i <= s1.length() - s2.length(); i++) {
            substringHashCode = substringHashCode - s1.charAt(i - 1) * (int) Math.pow(31, s2.length() - 1);
            substringHashCode = substringHashCode * 31 + s1.charAt(i - 1 + s2.length());
            if (substringHashCode == s2HashCode && s1.substring(i, i + s2.length()).equals(s2)) {
                return true;
            }
        }

        return false;
    }

    static int countCharInString(String str, char c) {
        int nrAppearances = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                nrAppearances++;
        }
        return nrAppearances;
    }

    static boolean isStr2SuffixOfStr1(String s1, String s2) {
        if (s2.length() > s1.length())
            return false;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(s2.length() - 1 - i) != s1.charAt(s1.length() - 1 - i))
                return false;
        }
        return true;
    }

    static String alphabetIndexEncoding(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(Character.toLowerCase(s.charAt(i)) - 'a');
        }
        return sb.toString();
    }

    static String duplicateLettersEncoding(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            sb.append(c);
            if (c == s.charAt(i + 1))
                sb.append('#');
        }
        sb.append(s.charAt(s.length() - 1));

        return sb.toString();
    }

    static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        sumFrom0ToN(100);

        averageAndSumOfARange(1, 100);

        printXFibonacciNumbers(20);

        System.out.println(areFirstAndLastElementEquals(new int[]{1, 2, 0}));

        System.out.println(areArraysEqual(new int[]{}, new int[]{}));

        int[] array = concatenateArrays(new int[]{1, 2, 3, 4}, new int[]{4, 3, 4});
        Arrays.stream(array).forEach(x -> System.out.print(x + " "));
        System.out.println();

        Map<String, Float> map = getMaxMinAndAverage(new int[]{13, 20, 14, 5, 2, 8});
        if (map.size() == 3) {
            System.out.println("Min: " + map.get("Min"));
            System.out.println("Max: " + map.get("Max"));
            System.out.println("Average: " + map.get("Average"));
        }

        System.out.println("Index: " + getIndex(new int[]{13, 20, 1, 4, 5, 6, 7}, 20));

        findNumberOfOddAndEvenNumbers(new int[]{-13, 20, 14, 5, 2, 8});

        System.out.println(isString2InString1("abababad", "abad"));

        System.out.println(countCharInString("aaaabb", 'b'));

        System.out.println(isStr2SuffixOfStr1("penta stagiu", "agiu"));

        System.out.println(alphabetIndexEncoding("AbCdA"));

        System.out.println(duplicateLettersEncoding("Hello worllldd"));

        System.out.println(isPalindrome("abcba"));

    }
}
