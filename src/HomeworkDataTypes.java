public class HomeworkDataTypes {
    public static void main(String[] args) {

        // 1. Test first item
        System.out.println("--------------- Problem No. 1 ---------------");
        HomeworkDataTypes obj = new HomeworkDataTypes();
        int result = obj.sumNumbers(5);
        System.out.println("Sum of numbers is: " + result);
        System.out.println("---------------------------------------------");

        // 2. Test 2nd item
        System.out.println("--------------- Problem No. 2 ---------------");
        obj.avgSum(1, 100);
        System.out.println("---------------------------------------------");

        // Test third item
        System.out.println("--------------- Problem No. 3 ---------------");
        obj.printFibonacciNumbers(20);
        System.out.println("---------------------------------------------");

        // Test 4th item
        System.out.println("--------------- Problem No. 4 ---------------");
        int myArray1[] = {13, 6, 2, 8, 2, 3};
        int myArray2[] = {13, 6, 2, 8, 2, 13};
        obj.testSame(myArray1);
        obj.testSame(myArray2);
        System.out.println("---------------------------------------------");

        // Test 5th item
        System.out.println("--------------- Problem No. 5 ---------------");
        int first1[] = {1, 2, 3, 4};
        int second1[] = {1, 2, 3, 4};
        obj.arrayEquity(first1, second1);

        int first2[] = {1, 2, 3, 6};
        int second2[] = {1, 2, 3, 4};
        obj.arrayEquity(first2, second2);

        int first3[] = {1, 2, 3, 6};
        int second3[] = {1, 2, 3};
        obj.arrayEquity(first3, second3);
        System.out.println("---------------------------------------------");

        // Test 6th item
        System.out.println("--------------- Problem No. 6 ---------------");
        int first[] = {1, 2, 3, 4};
        int second[] = {5, 6, 7, 8};
        obj.concatenateArray(first, second);

        System.out.println("---------------------------------------------");

        // Test 7th item
        System.out.println("--------------- Problem No. 7 ---------------");
        int mMA[] = {13, 20, 14, 5, 2, 8};
        obj.minMaxAvg(mMA);
        System.out.println("---------------------------------------------");

        // Test 8th item
        System.out.println("--------------- Problem No. 8 ---------------");
        int arr[] = {13, 20, 14, 5, 2, 8};
        obj.printPosition(arr, 5);
        System.out.println("---------------------------------------------");

        // Test 9th item
        System.out.println("--------------- Problem No. 9 ---------------");
        int arrayOddEven[] = {13, 20, 14, 5, 2, 8};
        obj.printEvenOdd(arrayOddEven);
        System.out.println("---------------------------------------------");

        // Test 10th item
        System.out.println("--------------- Problem No. 10 ---------------");
        String base = "Hello java world";
        String word = "java";
        obj.findString(base, word);
        System.out.println("---------------------------------------------");

        // Test 11th item
        System.out.println("--------------- Problem No. 11 ---------------");
        String myString = "Hello java world";
        obj.countChars(myString, 'a');
        System.out.println("---------------------------------------------");

        // Test 12th item
        System.out.println("--------------- Problem No. 12 ---------------");
        obj.endOfString("Hello java world", "orld");
        System.out.println("---------------------------------------------");

        // Test 13th item
        System.out.println("--------------- Problem No. 13 ---------------");
        obj.setDuplicate("Hello java");
        System.out.println("---------------------------------------------");

        // Test 14th item
        System.out.println("--------------- Problem No. 14 ---------------");
        obj.alphabet("bcz");
        System.out.println("---------------------------------------------");

        // Test 15th item
        System.out.println("--------------- Problem No. 15 ---------------");
        String str = "aaabccbaaa";

        if (obj.isPalindrone(str)) {
            System.out.print("TRUE" + "\n");
        } else {
            System.out.print("FALSE" + "\n");
        }
        System.out.println("---------------------------------------------");

    }

    /* -------------------------------------------------------------- */
    // 1. Write a program that will sum up all numbers from 0 up to a target number.
    // For example, for an input number 5, result should be 15 (0+1+2+3+4+5)
    public int sumNumbers(int a) {
        int sum = 0;
        int i = 0;
        while (i <= a) {
            sum = sum + i;
            i++;
        }
        return sum;
    }

    /* -------------------------------------------------------------- */
    // 2. Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
    // For example, for range numbers 1 to 100 output should be:
    // Sum for range 1 to 100 : 5050
    // Average for range 1 to 100 : 50.0
    public void avgSum(int a, int b) {
        int sum = 0;
        double avg = 0;
        int counter = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
            counter++;
        }
        System.out.println("Sum for range " + a + " to " + b + " : " + sum);
        avg = sum / counter;
        System.out.println("Average for range " + a + " to " + b + " : " + avg);
    }

    /* -------------------------------------------------------------- */
    // 3. Write a program that will print the first x fibonacci numbers. Also calculate the average value. For example
    // For an input of x = 20 the output should be:
    // The first 20 Fibonacci numbers are:
    // 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
    // The average is 885.5

    public void printFibonacciNumbers(int a) {
        int myArray[] = new int[a];
        int i;
        int sum = 0;
        myArray[0] = 1;
        myArray[1] = 1;
        System.out.println("The first 20 Fibonacci numbers are: ");
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        for (i = 2; i <= myArray.length - 1; i++) {
            myArray[i] = myArray[i - 1] + myArray[i - 2];
            sum += myArray[i];
            System.out.println(myArray[i] + " ");
        }
        double avg = (double) (sum + 2) / a;
        System.out.println("The average is: " + avg);
    }

    /* -------------------------------------------------------------- */
    // 4, Write a java program that will test whether the first and the last element of an int array are the same.
    // We can assume the array has 2 or more elements.
    // For example:
    // For the following input [13,6,2,8,2,3] the output should be : FALSE
    // For the following input [13,6,2,8,2,13] the output should be : TRUE

    public void testSame(int myArray[]) {
        boolean isSame = false;
        if (myArray[0] == myArray[myArray.length - 1]) {
            isSame = true;
            System.out.println("TRUE");
        } else {
            isSame = false;
            System.out.println("FALSE");
        }
    }

    /* -------------------------------------------------------------- */
    // 5. Write a program that test whether 2 int arrays are equal.
    // Equality in this case means that both arrays have the same number of elements an element
    // on a specific index in first array is equal to the element on the same index in the second array.
    // For example:
    // For the following arrays [1,2,3,4] and [1,2,3,4] the output should be TRUE
    // For the following arrays [] and [] the output should be TRUE
    // For the following arrays [1,3,2] and [1,3] the output should be FALSE
    // For the following arrays [1,2,3,4] and [1,2,4,3] the output should be FALSE
    public void arrayEquity(int first[], int second[]) {
        int sizeFirst = first.length;
        int sizeSecond = second.length;
        int counterForEquity = 0;
        if (sizeFirst == 0 && sizeSecond == 0) {
            System.out.println("TRUE");
        }
        if (sizeFirst != sizeSecond) {
            System.out.println("FALSE");
        } else {
            for (int i = 0; i <= sizeFirst - 1; i++) {
                if (first[i] == second[i]) {
                    counterForEquity++;
                }
            }
            if (counterForEquity == sizeFirst) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }
        }
    }

    /* -------------------------------------------------------------- */
    // 6.Write a java program that will concatenate 2 arrays.
    // For example
    // Given 2 arrays [1,2,3,4] and [5,6,7,8] the output should be a new array containing [1,2,3,4,5,6,7,8]
    public void concatenateArray(int first[], int second[]) {
        int sizeFirst = first.length;
        int sizeSecond = second.length;
        int sizeNewArray = sizeFirst + sizeSecond;

        int result[] = new int[sizeNewArray];
        int position = 0;
        for (int element : first) {
            result[position] = element;
            position++;
        }
        for (int element : second) {
            result[position] = element;
            position++;
        }
        for (int j = 0; j <= sizeNewArray - 1; j++) {
            System.out.println(result[j]);
        }
    }

    /* -------------------------------------------------------------- */
    // 7. Write a java program that will return the min, max and average values in a given array.
    // For example
    // GIven the following array [13,20,14,5,2,8] the output should be
    // Max : 20
    // Min : 2
    // Average: 10.3

    public void minMaxAvg(int myArray[]) {
        int max = myArray[0];
        // calculate maximum
        for (int i = 0; i <= myArray.length - 1; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("Max: " + max);

        int min = myArray[0];
        // calculate minimum
        for (int i = 0; i <= myArray.length - 1; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        System.out.println("Min: " + min);

        // calculate average
        int sum = 0;
        for (int i = 0; i <= myArray.length - 1; i++) {
            sum += myArray[i];
        }
        double avg = (double) sum / myArray.length;
        System.out.println("Average: " + avg);
    }

    /* -------------------------------------------------------------- */
    // 8. Write a java program to return the index of a target element.
    // For example:
    // Given  the following array [13,20,14,5,2,8] and a target element 5 the output should be :
    // 3 (because 5 is located at index 3 in the array)

    public void printPosition(int myArray[], int element) {
        for (int i = 0; i <= myArray.length - 1; i++) {
            if (myArray[i] == element) {
                System.out.println(i);
            }
        }
    }

    /* -------------------------------------------------------------- */
    //  9. Write a Java program to find the number of even and odd integers in a given array of integers
    // For example.
    // Given the following array [13,20,14,5,2,8] the output should be:
    // Odd elements count : 2
    // Even elements count : 4
    public void printEvenOdd(int myArray[]) {
        int counterEven = 0;
        int counterOdd = 0;
        for (int i = 0; i <= myArray.length - 1; i++) {
            if (myArray[i] % 2 == 0) {
                counterEven++;
            } else {
                counterOdd++;
            }
        }
        System.out.println("Odd elements count : " + counterOdd);
        System.out.println("Even elements count : " + counterEven);
    }

    /* -------------------------------------------------------------- */
    // 10. Write a program that test if a given String contains another String.
    // For example
    // Given the following base String “Hello java world” and the target test String “java” the output should be TRUE
    public void findString(String myString, String word) {
        if (myString.contains(word)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    /* -------------------------------------------------------------- */
    // 11. Write a program that will count how many times a character appears in a String
    // For example
    // Given the string “Hello java world” and the target character ‘a’ the output should be 2
    // (since ‘a’ appears twice in “Hello java world”)
    public void countChars(String myString, char letter) {
        char myChars[] = myString.toCharArray();
        int counter = 0;
        for (int i = 0; i <= myChars.length - 1; i++) {
            if (myChars[i] == letter) {
                counter++;
            }
        }

        System.out.println(counter);
    }
    /* -------------------------------------------------------------- */
    // 12. Write a program that will test whether a string ends with another string
    // For example
    // Given the following strings “Hello java world” and “orld” the output should be TRUE

    public void endOfString(String myString, String subString) {
        char charString[] = myString.toCharArray();
        char charSubString[] = subString.toCharArray();
        int sizeSubstring = charSubString.length;
        int sizeString = charString.length;
        int counterSubStrig = 0;
        int startSize = sizeString - sizeSubstring;
        char newChars[] = new char[sizeSubstring];
        int j = 0;

        for (int i = startSize; i < sizeString; i++) {
            newChars[j] = charString[i];

            if (newChars[j] == charSubString[j]) {
                counterSubStrig++;
            }
            j++;
        }
        if (counterSubStrig == sizeSubstring) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    /* -------------------------------------------------------------- */
    // 13. Write a program that will return a different string representing the alphabet index of each letter.
    // Assuming we have the following alphabet encoding
    // a = 0
    // b = 1
    // c = 2
    // d = 3
    // For the given string “abcd” the output should be “0123”

    public void alphabet(String myString) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char charString[] = myString.toCharArray();
        for (int i = 0; i < charString.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (charString[i] == alphabet[j])
                    System.out.println(Integer.toString(j));
            }
        }
    }

    /* -------------------------------------------------------------- */

    // 14. Write a program that will insert a # between any duplicate letters that are placed right next to each.
    // For example
    // Given the following string “Hello world” the output should be “Hel#lo world”

    public void setDuplicate(String myString) {
        char charString[] = myString.toCharArray();
        for (int i = 0; i < charString.length - 1; i++) {
            if (charString[i] == charString[i + 1]) {
                charString[i + 1] = '#';

            }
        }
        String newString = new String(charString);
        System.out.println(newString);
    }

    /* -------------------------------------------------------------- */
    // 15. Write a program to test whether a given string is a palindrome or not
    // For example
    // Given the following string “aaabccbaaa” should return TRUE
    // Given the following string “abccbb” should return FALSE
    /* -------------------------------------------------------------- */

    public boolean isPalindrone(String myString) {
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0;
        int j = myString.length() - 1;

        // While there are characters toc compare
        while (i < j) {
            // If there is a mismatch
            if (myString.charAt(i) != myString.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

