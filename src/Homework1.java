import java.util.Arrays;

public class Homework1 {

    public static void main(String[] args) {
        System.out.println(sumToTarget(5));
        averageBetweenRange(1, 100);
        printFirstXFibonacciNumbers(20);
        System.out.println(areFirstAndLastTheSame(new int[]{13, 6, 2, 8, 2, 3}));
        System.out.println(areFirstAndLastTheSame(new int[]{13, 6, 2, 8, 2, 13}));
        System.out.println(compareArrays(new int[] {1, 2, 3, 4}, new int[] {1, 2, 3, 4}));
        System.out.println(compareArrays(new int[] {}, new int[] {}));
        System.out.println(compareArrays(new int[] {1, 3, 2}, new int[] {1, 3}));
        System.out.println(compareArrays(new int[] {1, 2, 3, 4}, new int[] {1, 2, 4, 3}));
        System.out.println(Arrays.toString(concatenateArrays(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8})));
        findMinMaxAverageValues(new int[] {13, 20, 14, 5, 2, 8});
        System.out.println(findTarget(new int[] {13,20,14,5,2,8}, 5));
        countEvenAndOddNumbers(new int[] {13, 20, 14, 5, 2, 8});
        System.out.println(contains("Hello java world", "java"));
        System.out.println(countCharacterOccurrences("Hello java world", 'a'));
        System.out.println(endsWith("Hello java world", "orld"));
        System.out.println(convertLettersToIndexes("abcd"));
        System.out.println(insertHashBetweenDuplicateLetters("Hello World"));
        System.out.println(isPalindrome("aaabccbaaa"));
        System.out.println(isPalindrome("abccbb"));
    }

    // Problem 1
    private static int sumToTarget(int target) {
        int sum = 0;

        for (int i = 0; i <= target; i++) {
            sum += i;
        }

        return sum;
    }

    // Problem 2
    private static void averageBetweenRange(int from, int to) {
        int sum = 0;

        for (int i = from; i <= to; i++) {
            sum += i;
        }

        System.out.println("Sum for range " + from + " to " + to + " : " + sum);
        System.out.println("Average for range " + from + " to " + to + " : " + sum / (to - from + 1F));
    }

    // Problem 3
    private static void printFirstXFibonacciNumbers(int x) {
        int a = 1;
        int b = 0;
        int sum = 0;
        int count = 0;

        System.out.println("The first " + x + " Fibonacci numbers are:");
        for (int i = 0; i < x; i++) {
            System.out.print(a + " ");
            int temp = a;
            sum += a;
            count++;
            a = b + a;
            b = temp;
        }

        System.out.println("\nThe average is " + sum / (float) count);
    }

    // Problem 4
    private static boolean areFirstAndLastTheSame(int[] array) {
        return array[0] == array[array.length - 1];
    }

    // Problem 5
    private static boolean compareArrays(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }

        for(int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }

        return true;
    }

    // Problem 5
    private static int[] concatenateArrays(int[] firstArray, int[] secondArray) {
        int[] newArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            newArray[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            newArray[i + firstArray.length] = secondArray[i];
        }

        return newArray;
    }

    // Problem 6
    private static void findMinMaxAverageValues(int[] array) {
        int sum = array[0];
        int min = array[0];
        int max = array[0];

        for(int i = 1; i < array.length; i++) {
            sum += array[i];
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
        System.out.println("Average : " + (float) sum / array.length);
    }

    // Problem 7
    private static int findTarget(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // Problem 8
    private static void countEvenAndOddNumbers(int[] array) {
        int oddNumbers = 0;
        int evenNumbers = 0;

        for(int i : array) {
            if (i % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }

        System.out.println("Odd elements count : " + oddNumbers);
        System.out.println("Even elements count : " + evenNumbers);
    }

    // Problem 9
    private static boolean contains(String givenString, String anotherString) {
        for (int i = 0; i < givenString.length(); i++) {
            if (givenString.charAt(i) == anotherString.charAt(0)) {
                int j = 0;
                while (j < anotherString.length() && j < givenString.length()) {
                    if (anotherString.charAt(j) != givenString.charAt(j + i)) {
                        break;
                    }
                    j++;
                }
                if (j == anotherString.length()) {
                    return true;
                }
            }
        }

        return false;
    }

    // Problem 10
    private static int countCharacterOccurrences(String str, char ch) {
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    // Problem 11
    private static boolean endsWith(String givenString, String ending) {
        for(int i = 0; i < ending.length(); i++) {
            if (givenString.charAt(givenString.length() - ending.length() + i) != ending.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    //Problem 12
    private static String convertLettersToIndexes(String str) {
        StringBuilder convertedString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch <= 90 ) {
                convertedString.append(ch - 65);
            } else {
                convertedString.append(ch - 97);
            }
        }

        return convertedString.toString();
    }

    // Problem 13
    private static String insertHashBetweenDuplicateLetters(String str) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length() - 1; i++) {
            result.append(str.charAt(i) == str.charAt(i + 1) ? str.charAt(i) + "#" : str.charAt(i));
        }

        return result.append(str.charAt(str.length() - 1)).toString();
    }

    // Problem 14
    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}