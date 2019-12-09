import java.util.Arrays;
import java.util.Collections;

public class Homework2 {

    public static int sumNumber(int targetNumber) {
        int sum = 0;

        for (int i = 0; i <= targetNumber; i++) {
            sum += i;
        }

        return sum;
    }


    public static void averageAndSum(int firstNumber, int secondNumber) {
        int sum = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
        }
        float average = sum / ((secondNumber - firstNumber) + 1);

        System.out.println("Sum for range " + firstNumber + " to " + secondNumber + " : " + sum);
        System.out.println("Average for range " + firstNumber + " to " + secondNumber + " : " + average);

    }

    public static void fibonacci(int targetNumber) {

        int previousNumber = 0;
        int nextNumber = 1;
        int sum = 2;

        if (targetNumber <= 1) {
            System.out.println("Number must be grater then 1");

        } else if (targetNumber >= 2) {
            System.out.print("The first " + targetNumber + " Fibonacci numbers are : ");

            for (int i = 1; i <= targetNumber; i++) {
                System.out.print(previousNumber + " ");

                sum = previousNumber + nextNumber;
                previousNumber = nextNumber;
                nextNumber = sum;
            }
        }

        float average = sum / targetNumber;

        System.out.println("\nThe average is : " + average);
    }

    public static String arrayTestElement(int[] array) {
        String result = (array[0] == array[array.length - 1]) ? "For the following input " + Arrays.toString(array) + " the output is : TRUE" : "For the following input " + Arrays.toString(array) + " the output is : FALSE";

        return result;
    }


    public static boolean arraysEquality(int[] firstArray, int[] secondArray) {
        boolean result = Arrays.equals(firstArray, secondArray);

        return result;
    }

    public static int[] concatenateTwoArrays(int[] firstArray, int[] secondArray) {
        int[] finalArray = new int[firstArray.length + secondArray.length];

        System.arraycopy(firstArray, 0, finalArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, finalArray, firstArray.length, secondArray.length);

        return finalArray;
    }

    public static void minMaxAverageInArray(Integer[] array) {
        int min = Collections.min(Arrays.asList(array));
        int max = Collections.max(Arrays.asList(array));
        int sum = 0;

        for (int value : array) {
            sum += value;
        }
        double average = sum / array.length;

        System.out.print(" Given the following array " + Arrays.toString(array) + " the output is \n Min : " + min + "\n Max : " + max + "\n Average : " + average);
    }

    public static int indexElementInArray(int[] array, int element) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }


    public static String oddOrEven(Integer[] array) {
        int even = 0, odd = 0;

        for (int i = 0; i < array.length; i++) {

            int result = (array[i] % 2 == 0) ? even++ : odd++;
        }

        return "Odd elements count : " + odd + "\nEven elements count : " + even;
    }

    public static String subString(String s1, String s2) {
        boolean isFound = s1.contains(s2);

        return "Given the following base String “" + s1 + "“ and the target test String “" + s2 + "“ the output is : " + isFound;
    }

    public static void countCharacter(String s1, char character) {
        long count = s1.chars().filter(ch -> ch == character).count();

        System.out.println("Given the string “ " + s1 + " ” and the target character ‘" + character + "’ the output is " + count +
                "\n(since ‘" + character + "’ appears " + count + " times in “" + s1 + "”)\n");
    }

    public static void endsString(String s1, String s2) {
        boolean ends = s1.endsWith(s2);

        System.out.println("Given the following strings “" + s1 + "” and “" + s2 + "” the output is :" + ends);
    }

    public static void indexLetter(String s1) {
        String s2 = s1.toLowerCase();

        for (int i = 0; i < s1.length(); i++) {
            int position = s2.charAt(i) - 'a';
            System.out.print(position);
        }
    }

    public static void duplicateLetters(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length() - 1; i++) {

            char letter = s.charAt(i);
            stringBuilder.append(letter);

            if (letter == s.charAt(i + 1)) {
                stringBuilder.append('#');
            }
        }
        stringBuilder.append(s.charAt(s.length() - 1));

        System.out.println("Given the following string “" + s.toString() + "“ the output is “" + stringBuilder.toString() + "“");

    }

    public static String palindrome(String s) {
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--)
            reverse = reverse + s.charAt(i);

        return (s.equals(reverse)) ? "Given the following string “" + s.toString() + "” return TRUE" : "Given the following string “" + s.toString() + "” return FALSE";

    }

    public static void main(String[] args) {

        // Problem 1
        // System.out.println(sumNumber(4));

        //Problem 2
        // averageAndSum(1, 100);

        //Problem 3
        // fibonacci(20);

        //Problem 4
        // System.out.println(arrayTestElement(new int[]{13, 6, 2, 8, 2, 3}));
        // System.out.println(arrayTestElement(new int[]{13, 6, 2, 8, 2, 3, 13}));

        //Problem 5
        // System.out.println(arraysEquality(new int[]{1,2,3}, new int[]{1,2,3,4}));

        //Problem 6
        // System.out.println(Arrays.toString(concatenateTwoArrays(new int[]{1,2,3}, new int[]{1,2,3,4})));

        //Problem 7
        // minMaxAverageInArray(new Integer[]{13, 6, 2, 8, 2, 3});

        //Problem 8
        System.out.println(indexElementInArray(new int[]{3, 2, 4, 1}, 4));

        //Problem 9
        System.out.println(oddOrEven(new Integer[]{13, 6, 2, 8, 2, 3}));

        //Problem 10
        // System.out.println(subString("Java is the best", "in"));

        //Problem 11
        // countCharacter("Hello Java", 'a');

        //Problem 12
        // endsString("Java is wonderful", "rful");

        //Problem 13
        // indexLetter("abCd");

        //Problem 14
        // duplicateLetters("abba");

        //Problem 15
        // System.out.println(palindrome("aaabccbacaa"));
    }
}
