import java.util.ArrayList;

public class Homework1 {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        int sum = sumUp(20);
        System.out.println("Sum of integers till 20: " + sum);

        sumAndAverage(1, 100);
        fibo(20);
        arr.add(13);
        arr.add(6);
        arr.add(2);
        arr.add(3);
        System.out.println("Verify if an array starts and ends with same number.");
        compare(arr);
        arr.add(13);
        compare(arr);
        System.out.println("Compare two arrays.");
        equalArrays(arr,arr);
        arr2.add(13);
        arr2.add(3);
        arr2.add(2);
        arr2.add(13);
        arr.add(6);
        equalArrays(arr,arr2);
        System.out.println("Concatenate two arrays.");
        concatenate(arr,arr2);
        System.out.println("Calculate min, max and average from an array.");
        minMaxAverage(arr);
        System.out.println("Find the index of an array element.");
        targetIndex(arr, 3);
        System.out.println("Calculate odd and even elements from an array");
        oddAndEven(arr);
        System.out.println("Verify that a string contains another string");
        containsString("Hello world", "worl");
        containsString("Hello world", "aaa");
        System.out.println("Count how many times a char appears in a string");
        countApp("Hello world", 'l');
        System.out.println("Verify if a string ends with another string");
        stringEndsWithString("Hello world", "rld");
        stringEndsWithString("Hello world", "aaa");
        System.out.println("Encode alphabet");
        alphabetEncoding("abcde");
        System.out.println("Insert an # between two identical chars");
        duplicateLetters("Hello");
        System.out.println("Verify if a string is palindrome");
        palindrome("Ana");
        palindrome("Anaa");
    }

    public static int sumUp(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void sumAndAverage(int startNumber, int endNumber) {
        int sum = 0;
        float average = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            sum = sum + i;
        }

        average = sum / (endNumber - startNumber - 1);

        System.out.println("Sum for range: " + startNumber + " to " + endNumber + " : " + sum);
        System.out.println("Average for range " + startNumber + " to " + endNumber + " : " + average);
    }

    public static void fibo(int number) {
        int firstNumber = 1;
        int secondNumber = 1;
        int sum = firstNumber + secondNumber;
        float average = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(firstNumber);
        arrayList.add(secondNumber);
        System.out.println("The first " + number + " Fibonacci numbers are: ");
        System.out.println(firstNumber + " " + secondNumber + " ");
        for (int i = 2; i < number; i++) {
            int thirdNumber = firstNumber + secondNumber;
            sum = sum + thirdNumber;
            System.out.println(thirdNumber);
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }

        average = sum / number;

        System.out.println("The average is " + average);
    }

    public static void compare(ArrayList<Integer> arr1) {
        if (arr1.get(0) == arr1.get(arr1.size() - 1)) {
            System.out.println("TRUE");
        }
        else
            System.out.println("FALSE");
    }

    public static void equalArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        if (arr1.size() != arr2.size()) {
            System.out.println("FALSE");
            return;
        } else {
            for (int i = 0; i < arr1.size(); i++) {
                if (!arr1.get(i).equals(arr2.get(i))) {
                    System.out.println("FALSE");
                    return;
                } else {
                    System.out.println("TRUE");
                    return;
                }
            }
        }
    }

    public static void concatenate(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        for (int i = 0; i < arr2.size(); i++) {
            arr1.add(arr2.get(i));
        }
        for(int i=0; i<arr1.size(); i++){
            System.out.println(arr1.get(i) + " ");
        }
    }

    public static void minMaxAverage(ArrayList<Integer> arr1) {
        int min = arr1.get(0);
        int max = arr1.get(0);
        int sum = 0;
        float average = 0;
        for (int i = 1; i < arr1.size(); i++) {
            sum = sum + arr1.get(i);
            if (arr1.get(i) < min) {
                min = arr1.get(i);
            }
            if (arr1.get(i) > max) {
                max = arr1.get(i);
            }
        }

        average = sum / arr1.size();

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);
    }

    public static void targetIndex(ArrayList<Integer> arr1, int number) {
        if (!arr1.contains(number)) {
            System.out.println("This number doesn't exist in your array.");
        } else {
            System.out.println(arr1.indexOf(number));
        }
    }

    public static void oddAndEven(ArrayList<Integer> arr1) {
        int oddElements = 0;
        int evenElements = 0;
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) % 2 == 0) {
                oddElements += 1;
            } else {
                evenElements += 1;
            }
        }

        System.out.println("Odd elements count: " + oddElements);
        System.out.println("Even elements count: " + evenElements);
    }

    public static void containsString(String stringWhereToSearch, String elementToSearch) {
        if (stringWhereToSearch.contains(elementToSearch)) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
    }

    public static void countApp(String string, char ch) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void stringEndsWithString(String str1, String str2) {
        if (str1.endsWith(str2)) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
    }

    public static void alphabetEncoding(String str1) {
        str1 = str1.toLowerCase();
        char letter;
        for (int i = 0; i < str1.length(); i++) {
            letter = str1.charAt(i);
            if (letter >= 'a' && letter <= 'z')
                System.out.println((int) letter - 'a' + 1);
        }
    }

    public static void duplicateLetters(String str1) {
        String resultString = "";
        for (int i = 0; i < str1.length() - 1; i++) {
            resultString = resultString + str1.charAt(i);
            if(resultString.charAt(i)==str1.charAt(i+1)){
                resultString = resultString + "#";
            }
        }
        resultString = resultString + str1.charAt(str1.length() - 1);
        System.out.println(resultString);
    }

    public static void palindrome(String str) {
        boolean ok = true;
        int length = str.length() - 1;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(length)) {
                ok = false;
            }
            length--;
        }

        if(ok){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }


}
