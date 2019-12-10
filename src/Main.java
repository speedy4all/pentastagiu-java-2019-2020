import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//Write a program that will sum up all numbers from 0 up to a target number.
        System.out.println(sumNumber(5));

//Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
        averageAndSum(1, 5);

//Write a program that will print the first x fibonacci numbers. Also calculate the average value.
        getFibonacci(20);

//Write a java program that will test whether the first and the last element of an int array are the same. We can assume the array has 2 or more elements.
        int[] numbers = {13, 6, 2, 8, 2, 13};
        System.out.println();
        System.out.println(getArrayBoolean(numbers));

//  Write a program that test whether 2 int arrays are equal. Equality in this case means that both arrays have the same number of elements an element on a specific index in first array is equal to the element on the same index in the second array.
        int[] firstArray = {13, 6, 2, 8, 2, 13};
        int[] secondArray = {13, 6, 2, 8, 3, 13};
        System.out.println(getArrayBoolean(firstArray, secondArray));

//Write a java program that will concatenate 2 arrays.
        concatenateTwoArrays(firstArray, secondArray);

//Write a java program that will return the min, max and average values in a given array.
        minMaxAverageArray(firstArray);

//Write a java program to return the index of a target element.
        indexOfTaegetElement(firstArray, 13);

//Write a Java program to find the number of even and odd integers in a given array of integers
        evenOddIntegersCount(firstArray);

//Write a program that test if a given String contains another String.
        String testString = "Hello java world";
        containsString(testString, "java");

//Write a program that will count how many times a character appears in a String
        characteCount(testString, 'a');

//Write a program that will test whether a string ends with another string
        stringContainsInTheEnd(testString, "orld");

//Write a program that will return a different string representing the alphabet index of each letter.
        alphabetIndexOfEachLetter("orld");

//Write a program that will insert a # between any duplicate letters that are placed right next to each.
        insertSymbol(testString);

//Write a program to test whether a given string is a palindrome or not
        isPolindrome("aaabccbaaa");


    }

    public static void isPolindrome(String test) {
        boolean isPolindrome = false;
        StringBuilder stringBuilder = new StringBuilder(test);

        for (int i = 0, j = stringBuilder.length() - 1; i < stringBuilder.length(); i++, j--) {

            if (i == j || i > j) {
                isPolindrome = true;
                break;
            }
            if (i != j && stringBuilder.charAt(i) != stringBuilder.charAt(j)) {
                break;
            }
        }
        System.out.println(isPolindrome);
    }

    public static void insertSymbol(String test) {
        StringBuilder stringBuilder = new StringBuilder(test);
        for (int i = 0; i < stringBuilder.length(); i++) {
            int index = i + 1;
            if (index < stringBuilder.length() && stringBuilder.charAt(i) == stringBuilder.charAt(index)) {
                stringBuilder.setCharAt(index, '#');
            }
        }
        System.out.println(stringBuilder);
    }

    public static void alphabetIndexOfEachLetter(String test) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i = 0; i < test.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (test.charAt(i) == alphabet[j]){
                    System.out.println(test.charAt(i) + " = " + j);
                }
            }
        }
    }

    public static void stringContainsInTheEnd(String s, String test) {
        if (s.contains(test) && s.substring(s.length() - test.length()).equals(test)) System.out.println("true");
        else System.out.println("false");
    }

    public static void characteCount(String s, char test) {
        byte count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == test) {
                count++;
            }
        }
        System.out.println("since '" + test + "' appears " + count + " times in '" + s + "'");
    }

    public static void containsString(String s, String test) {
        if (s.contains(test)) System.out.println("true");
        else System.out.println("false");
    }

    public static void evenOddIntegersCount(int[] firstArray) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Odd elements count : " + odd);
        System.out.println("Even elements count : " + even);
    }

    public static void indexOfTaegetElement(int[] firstArray, int element) {
        int index = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (element == firstArray[i]) {
                index = i;
                System.out.println("index of " + element + " : " + i);
            }
        }
        if (index == 0) {
            System.out.println("index of " + element + " : " + index);
        }
    }

    public static void minMaxAverageArray(int[] firstArray) {
        int sum = 0;
        int min = 0;
        int max = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (i == 0) {
                min = firstArray[i];
                max = firstArray[i];
                sum = firstArray[i];
            } else {
                min = (min < firstArray[i]) ? min : firstArray[i];
                max = (max > firstArray[i]) ? max : firstArray[i];
                sum += firstArray[i];
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
        System.out.println("Average : " + (double) sum / firstArray.length);
    }

    public static void concatenateTwoArrays(int[] firstArray, int[] secondArray) {

        int[] concatenateArray = new int[firstArray.length + secondArray.length];

        int i = 0;
        while (i < firstArray.length) {
            concatenateArray[i] = firstArray[i];
            i++;
        }

        for (int j = 0; j < secondArray.length; j++) {
            concatenateArray[i] = secondArray[j];
            i++;
        }

        for (int a : concatenateArray) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static boolean getArrayBoolean(int[] firstArray, int[] secondArray) {

        boolean equals = false;

        if (firstArray.length == secondArray.length) {
            if (firstArray.length == 0) {
                equals = true;
            } else {
                for (int i = 0; i < firstArray.length; i++) {
                    if (firstArray[i] == secondArray[i] && i != firstArray.length - 1) {
                        continue;
                    } else if (i == firstArray.length - 1) {
                        equals = true;
                    } else {
                        break;
                    }
                }
            }
        }

        return equals;

    }

    public static boolean getArrayBoolean(int[] numbers) {

        if (numbers[0] == numbers[numbers.length - 1]) {
            return true;
        } else {
            return false;
        }

    }

    public static void getFibonacci(int number) {

        int a = 1;
        int b = 1;
        for (int i = 1; i < number; i++) {
            if (i == 1) {
                System.out.print(a + " " + b + " ");
            } else {
                int c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }

    }

    public static int sumNumber(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static void averageAndSum(int firstNumber, int secondNumber) {
        int sum = 0;
        int first = 0;
        int second = 0;

        if (firstNumber < secondNumber) {
            first = firstNumber;
            second = secondNumber;
        } else {
            first = secondNumber;
            second = firstNumber;
        }

        for (int i = first; i <= second; i++) {
            sum += i;
        }

        System.out.println("Sum for range " + first + " to " + second + " : " + sum);
        System.out.println("Average for range " + first + " to " + second + " : " + (double) sum / (second - first + 1));
    }

}
