public class Homework_DataTypes {

    // Write a program that will sum up all numbers from 0 up to a target number.
    public static void exercise1(int num) {
        int sum = 0;
        if (num > 0) {
            System.out.println("The number should be higher than 0.");
        } else {
            for (int i = 0; i <= num; i++) {
                sum += i;
            }
            System.out.println("Sum=" + sum);
        }

    }

    //Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
    public static void exercise2(int num1, int num2) {
        int sum = 0;
        float avg;
        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                sum += i;
            }
            avg = (float) sum / (num2 - num1 + 1);
            System.out.println("Sum=" + sum);
            System.out.println("Average=" + avg);
        } else {
            for (int i = num1; i >= num2; i--) {
                sum += i;
            }
            avg = (float) sum / (num1 - num2 + 1);
            System.out.println("Sum=" + sum);
            System.out.println("Average=" + avg);
        }
    }

    //Write a program that will print the first x fibonacci numbers. Also calculate the average value.
    public static void exercise3(int num) {
        int n1 = 1, n2 = 1, n3, sum = 0;
        float avg;
        System.out.println("The first " + num + " Fibonacci numbers");
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < num; i++) {
            n3 = n1 + n2;
            sum += n3;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        avg = (float) sum / num;
        System.out.println("\nAverage=" + avg);
    }

    //Write a java program that will test whether the first and the last element of an int array are the same.
    public static void exercise4(int[] arr) {
        if (arr[0] == arr[arr.length - 1])
            System.out.println("true");
        else
            System.out.println("false");
    }

    //Write a program that test whether 2 int arrays are equal.
    public static void exercise5(int[] arr1, int[] arr2) {
        boolean isEqual = true;
        if (arr1.length != arr2.length)
            isEqual = false;
        else
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isEqual = false;
                    break;
                }
            }
        System.out.println(isEqual);
    }

    //Write a java program that will concatenate 2 arrays.
    public static void exercise6(int[] arr1, int[] arr2) {
        int len = arr1.length + arr2.length;
        int[] arr3 = new int[len];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

    //Write a java program that will return the min, max and average values in a given array.
    public static void exercise7(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        float avg;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        avg = (float) sum / (arr.length);
        System.out.println("Min=" + min + " Max=" + max + " Average=" + avg);
    }

    //Write a java program to return the index of a target element.
    public static void exercise8(int[] arr, int num) {
        boolean targetElementFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                targetElementFound = true;
                System.out.println("Index=" + i);
            }
        }
        if (!targetElementFound) {
            System.out.println("The number is not present in array.");
        }
    }

    //Write a Java program to find the number of even and odd integers in a given array of integers.
    public static void exercise9(int[] arr) {
        int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
            if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.print("Odd elements count=" + odd);
        System.out.println(" and even elements count= " + even);
    }

    //Write a program that test if a given String contains another String.
    public static void exercise10(String str, String str1) {
        System.out.println(str.contains(str1));
    }

    //Write a program that will count how many times a character appears in a String.
    public static void exercise11(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Count=" + count);
    }

    //Write a program that will test whether a string ends with another string.
    public static void exercise12(String str, String str1) {
        System.out.println(str.endsWith(str1));
    }

    //Write a program that will return a different string representing the alphabet index of each letter.
    public static void exercise13(String str) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(alphabet.indexOf(str.charAt(i)) + " ");
        }
    }

    //Write a program that will insert a # between any duplicate letters that are placed right next to each.
    public static void exercise14(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            str1 += str.charAt(i);
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                str1 += '#';
            }
        }
        System.out.println(str1);
    }

    //Write a program to test whether a given string is a palindrome or not
    public static void exercise15(String str) {
        boolean isPalindrome = true;
        int length = str.length() - 1;
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }

    public static void main(String[] args) {
        //Exercise1
        System.out.println("The result for Exercise1:");
        Homework_DataTypes.exercise1(5);

        //Exercise2
        System.out.println("The result for Exercise2:");
        Homework_DataTypes.exercise2(10, 1);

        //Exercise3
        System.out.println("The result for Exercise3:");
        Homework_DataTypes.exercise3(20);

        //Exercise4
        System.out.println("The result for Exercise4:");
        int[] arr = {1, 2, 3, 5};
        Homework_DataTypes.exercise4(arr);

        //Exercise5
        System.out.println("The result for Exercise5:");
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        Homework_DataTypes.exercise5(arr1, arr2);

        //Exercise6
        System.out.println("The result for Exercise6:");
        int[] arr3 = {1, 2, 3, 7, 9, 0};
        int[] arr4 = {1, 2, 3, 5};
        Homework_DataTypes.exercise6(arr3, arr4);

        //Exercise7
        System.out.println("\nThe result for Exercise7:");
        int[] arr5 = {1, 2, 3, 4, 5, 6};
        Homework_DataTypes.exercise7(arr5);

        //Exercise8
        System.out.println("The result for Exercise8:");
        int[] arr6 = {13, 20, 14, 5, 2, 8};
        Homework_DataTypes.exercise8(arr6, 4);

        //Exercise9
        System.out.println("The result for Exercise9:");
        int[] arr7 = {13, 20, 14, 5, 2, 8};
        Homework_DataTypes.exercise9(arr7);

        //Exercise10
        System.out.println("The result for Exercise10:");
        Homework_DataTypes.exercise10("Hello java world", "java");

        //Exercise11
        System.out.println("The result for Exercise11:");
        Homework_DataTypes.exercise11("Hello java world", 'o');

        //Exercise12
        System.out.println("The result for Exercise12:");
        Homework_DataTypes.exercise12("Hello java world", "orld");

        //Exercise13
        System.out.println("The result for Exercise13:");
        Homework_DataTypes.exercise13("aabcbdd");

        //Exercise14
        System.out.println("\nThe result for Exercise14:");
        Homework_DataTypes.exercise14("aabcbdd");

        //Exercise15
        System.out.println("\nThe result for Exercise15:");
        Homework_DataTypes.exercise15("bbccbb");
    }
}
