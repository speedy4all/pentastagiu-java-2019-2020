import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeworkDataTypes {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        calculateSum();
        calculateSumAndAverage();
        printFibonacciNumbers();
        compareFirstAndLastNumber();
        compareTwoArrays();
        concatenateTwoArrays();
        getMinMaxAndAverage();
        countOddAndEvenElements();
        testStringContent();
        countChar();
        testStringEndsWithAnotherString();
        encodeAlphabet();
        insertCharBetweenDuplicates();
        isPalindrome();
    }

    private static void calculateSum() {
        System.out.println("Calculate Sum");
        int targetNumber = getNumberFromUser();
        int sum = getSum(targetNumber);

        System.out.println("The sum for 0 up to " + targetNumber + " is: " + sum);
    }

    private static void calculateSumAndAverage() {
        System.out.println("Calculate Sum and Average");
        int targetNumber = getNumberFromUser();

        int sum = getSum(targetNumber);
        System.out.println("The sum for 0 up to " + targetNumber + " is: " + sum);

        double average = sum * 1.00 / targetNumber;
        System.out.println("The average for 1 up to " + targetNumber + " is: " + String.format("%.1f", average));
    }

    private static void printFibonacciNumbers() {
        System.out.println("Fibonacci Numbers");
        int targetNumber = getNumberFromUser();

        int[] fibonacciNumbers = new int[targetNumber + 1];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;
        int sum = 0;

        for (int i = 2; i < fibonacciNumbers.length; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
            sum += fibonacciNumbers[i];
        }

        System.out.println("The first " + targetNumber + " Fibonacci numbers are:");
        printArray(fibonacciNumbers);
        System.out.println("");
        calculateAverage(sum, targetNumber);
    }

    private static void compareFirstAndLastNumber() {
        System.out.println("Compare first and last number of an array");
        int[] numbers = getArrayFromUser();

        int firstNumber = numbers[0];
        int lastNumber = numbers[numbers.length - 1];

        if (firstNumber == lastNumber) {
            System.out.println(Boolean.TRUE);
        } else {
            System.out.println(Boolean.FALSE);
        }
    }

    private static void compareTwoArrays() {
        System.out.println("Compare two arrays");
        int[] first = getArrayFromUser();
        int[] second = getArrayFromUser();

        if (first.length != second.length) {
            System.out.println(Boolean.FALSE);
            return;
        }

        for (int i = 0; i < first.length - 1; i++) {
            if (first[i] != second[i]) {
                System.out.println(Boolean.FALSE);
                return;
            }
        }

        System.out.println(Boolean.TRUE);
    }

    private static void concatenateTwoArrays() {
        System.out.println("Concatenate two arrays");
        int[] first = getArrayFromUser();
        int[] second = getArrayFromUser();
        int length = first.length + second.length;

        int[] result = new int[length];

        for (int i = 0; i < first.length; i++) {
            result[i] = first[i];
        }

        for (int i = 0; i < second.length; i++) {
            result[i + first.length] = second[i];
        }

        printArray(result);
    }

    private static void getMinMaxAndAverage() {
        System.out.println("\nMin and Max");
        int[] numbers = getArrayFromUser();
        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            sum += number;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        calculateAverage(sum, numbers.length);
    }

    private static void countOddAndEvenElements() {
        System.out.println("Count odd and even elements");
        int[] numbers = getArrayFromUser();
        int odd = 0;
        int even = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Odd elements count: " + odd);
        System.out.println("Even elements count: " + even);
    }

    private static void testStringContent() {
        System.out.println("Test if a given String contains another String");
        String givenString = getStringFromUser();
        String anotherString = getStringFromUser();
        String[] words = givenString.split(" ");

        boolean isPresent = false;

        for (String word : words) {
            if (word.equals(anotherString)) {
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent);
    }

    private static void countChar() {
        System.out.println("Count how many times a char appears");
        String givenString = getStringFromUser();
        char targetChar = getCharFromUser();
        int count = 0;

        char[] chars = givenString.toCharArray();

        for (char character : chars) {
            if (character == targetChar) {
                count++;
            }
        }
        System.out.println("Character " + targetChar + " appears " + count + " times.");
    }

    private static void testStringEndsWithAnotherString() {
        System.out.println("Test if a given String ends with another String");
        String[] givenString = getStringFromUser().split(" ");
        String anotherString = getStringFromUser();


        char[] firstString = givenString[givenString.length - 1].toCharArray();
        char[] secondString = anotherString.toCharArray();

        boolean isEqual = true;

        if (secondString.length > firstString.length) {
            System.out.println(Boolean.FALSE);
            return;
        }
        for (int i = 0; i < secondString.length; i++) {
            if (secondString[secondString.length - i - 1] != firstString[firstString.length - i - 1]) {
                isEqual = false;
                break;
            }
        }

        System.out.println(isEqual);
    }

    private static void encodeAlphabet() {
        System.out.println("Encode alphabet");
        Map<Character, String> encodedAlphabet = new HashMap<>();

        int number = 0;

        for (char character = 'a'; character <= 'z'; character++) {
            encodedAlphabet.put(character, String.valueOf(number));
            number++;
        }

        String result = "";

        char[] userInput = getStringFromUser().toCharArray();

        for (char character : encodedAlphabet.keySet()) {
            for (char c : userInput) {
                if (character == c) {
                    result += encodedAlphabet.get(character);
                }
            }
        }
        System.out.println(result);
    }

    private static void insertCharBetweenDuplicates() {
        System.out.println("Insert a # between duplicates");
        String userInput = getStringFromUser();
        ArrayList<Character> characters = new ArrayList<>();
        ArrayList<Character> resultString = new ArrayList<>();

        for (char c : userInput.toCharArray()) {
            characters.add(c);
        }

        for (int i = 0; i < characters.size() - 1; i++) {
            resultString.add(characters.get(i));
            if (characters.get(i).equals(characters.get(i + 1))) {
                resultString.add('#');
            }
        }
        resultString.add(characters.get(characters.size() - 1));

        resultString.forEach(c -> System.out.print(c + " "));
    }

    private static void isPalindrome() {
        System.out.println("\nCheck if a string is palindrome");
        String userInput = getStringFromUser();
        char[] characters = userInput.toCharArray();

        boolean isPalindrome = true;

        for (int i = 0; i < characters.length / 2; i++) {
            if (characters[i] != characters[characters.length - i - 1]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }

    private static int getSum(int targetNumber) {
        int sum = 0;

        for (int i = 0; i <= targetNumber; i++) {
            sum += i;
        }
        return sum;
    }

    private static int getNumberFromUser() {
        System.out.print("Enter a number greater than 0: ");
        int targetNumber = scanner.nextInt();

        while (targetNumber < 0) {
            System.out.print("The number entered is invalid! Please enter a positive number: ");
            targetNumber = scanner.nextInt();
        }

        return targetNumber;
    }

    private static int[] getArrayFromUser() {
        System.out.println("Enter the size of the array: ");
        int length = getNumberFromUser();
        int[] numbers = new int[length];

        System.out.println("Enter the values of the array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("v[" + i + "]= ");
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    private static String getStringFromUser() {
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        while (userInput.isEmpty()) {
            System.out.print("Please enter a string: ");
            userInput = scanner.nextLine();
        }

        return userInput;
    }

    private static char getCharFromUser() {
        System.out.print("Enter a character: ");
        char userInput = scanner.next().charAt(0);

        return userInput;
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static void calculateAverage(int sum, int length) {
        double average = sum * 1.00 / length;
        System.out.println("The average is " + String.format("%.1f", average));
    }
}
