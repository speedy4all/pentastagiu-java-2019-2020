import java.util.Arrays;
public class Homework_1 {
    public static void main(String[] args) {
        // ex 1; summing the numbers up to 5
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum = sum + i;
        }
        System.out.println("The sum up to target:" + sum);

        // ex 2; calculating the sum and the average of all numbers between a range (for example, 1-100)
        int sum_ = 0;
        float average_;
        int[] array_ = new int[100];
        for (int a = 0; a < array_.length; a++) {
            array_[a] = a + 1;
            sum_ = sum_ + array_[a];
        }
        System.out.println("The sum is: " + sum_);
        average_ = sum_ / array_.length;
        System.out.println("The average is:" + average_);

        //ex 3; printing the first x fibonacci numbers and calculating their average(for example, 20)

        int n = 20, t1 = 1, t2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + " ");

            int summ_ = t1 + t2;

            t1 = t2;
            t2 = summ_;
        }

        //ex4; checking if the first and last elements of an array are the same

        int[] ints = {13, 6, 2, 8, 2, 3};
        if (ints[0] == ints[ints.length - 1]) {
            System.out.println("\nTRUE");
        } else {
            System.out.println("\nFALSE");
        }
        //ex 5; checking whether two int arrays are equal
        int[] check1 = {1, 2, 3, 4};
        int[] check2 = {1, 2, 3, 4};
        if (Arrays.equals(check1, check2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //ex 6; concatenating 2 arrays
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];
        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);

        System.out.println("The new array is:" + Arrays.toString(result));

        //ex 7; returning min, max and average value in a given array

        int[] myArr = {13, 20, 14, 5, 2, 8};
        int summ = 0;
        float average = 0;


        Arrays.sort(myArr);

        System.out.println("MIN:" + myArr[0]);
        System.out.println("MAX:" + myArr[myArr.length - 1]);
        for (int i = 0; i < myArr.length; i++) {
            summ = summ + myArr[i];
        }

        average = summ / myArr.length;
        System.out.println("The average is:" + average);

        //ex 8; returning the index of a target element
        int[] myArr__ = {13, 20, 14, 5, 2, 8};
        int target = 5;
        for (int i = 0; i < myArr__.length; i++)
            if (myArr__[i] == target)
                System.out.println("The index of the target element is:" + i);
        //ex 9; finding the odds and evens in an array
        int even = 0;
        int odd = 0;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] % 2 == 0) {
                even++;
            } else {

                odd++;
            }

        }
        System.out.println("Evens:" + even);
        System.out.println("Odds:" + odd);
        //ex 10; testing if a given string contains another string
        String myString = "Hello java world";
        String testString = "java";
        if (myString.contains("java")) {
            System.out.println("TRUE");
        } else {
            System.out.println("False");
        }
        //ex 11; testing how many times a character appears in a string
        int howManyTimes = 0;
        char toCheck = 'a';
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == toCheck) {
                howManyTimes++;
            }

        }
        System.out.println("The char appears in the string: " + howManyTimes);
        //ex 12; testing if a string ends with a string
        String anotherString = "orld";
        if (myString.endsWith("orld")) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        //ex 13; coding the alphabet
        String input = "abcd";
        String alphabet = "abcdefghijklmnopqrstuvxyz";
        for (int i = 0; i < input.length(); i++) {
            System.out.print(alphabet.indexOf(input.charAt(i)));
        }

        //ex 14; inserting # between any duplicate chars
        String myJavaString = "\nHello world";
        System.out.println((myJavaString.replace("ll", "l#l")));


        //ex 15; check if a string is palindorme
        String original = "abbar";
        String reverse = "";
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse))
            System.out.println("Palindrome");
        else {
            System.out.println("NOT a Palindrome");
        }

    }

}
