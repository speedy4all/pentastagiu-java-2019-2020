public class Homework1 {

    public static void main(String[] args) {
        // 1. Write a program that will sum up all numbers from 0 up to a target number.
        int[] ints = {0, 1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum = sum + ints[i];
        }
        System.out.println(sum);


        // 2. Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
        int numbers = 100;
        int sum1 = 1;
        int average = 1;
        //sum
        for (int j = 0; j <= numbers; j += 2) {
            sum1 = sum1 + j;
        }
        System.out.println(sum1);
        //average
        for (int k = 1; k <= numbers; k += 2) {
            average = sum1 / k;
        }
        System.out.println(average);


        //3. Write a program that will print the first x fibonacci numbers. Also calculate the average value.
        /*int a = 20;
        int myInt[] = new int[a];
        int all = 0;
        *//*System.out.println(myInt[0]);*//*
        for (int i = 2; i <= 20; i++) {
            myInt[i]= myInt[i-1] + myInt[i-2];
            all += myInt[i];
            System.out.println(myInt[i]);
        }
        double average2 = (double) (all + 2) / a;
        System.out.println(average2);*/


        // 4. Write a java program that will test whether the first and the last element of an int array are the same. We can assume the array has 2 or more elements.
        int myElements[] = {13, 6, 2, 8, 2, 13};
        boolean same = false;
        if (myElements[0] == myElements[myElements.length - 1]) {
            same = true;
            System.out.println("TRUE");
        } else {
            same = false;
            System.out.println("FALSE");
        }

        //5. Write a program that test whether 2 int arrays are equal. Equality in this case means that both arrays have the same number of elements an element on a specific index in first array is equal to the element on the same index in the second array.
        int first[] = {1, 2, 3, 4};
        int second[] = {1, 2, 3};
        boolean same2 = false;
        if (first.length == second.length) {
            same2 = true;
            System.out.println("TRUE");
        } else if (first.length != second.length) {
            same2 = false;
            System.out.println("FALSE");
        }


        //6. Write a java program that will concatenate 2 arrays.
        int myFirstAr[] = {1, 2, 3, 4};
        int mySecondAr[] = {5, 6, 7, 8};
        int concatenateAr[];
        concatenateAr = new int[myFirstAr.length + mySecondAr.length];
        for (int i = 0; i < myFirstAr.length; i++) {
            concatenateAr[i] = myFirstAr[i];
        }
        for (int i = 0; i < mySecondAr.length; i++) {
            concatenateAr[myFirstAr.length + i] = mySecondAr[i];
        }
        for (int i = 0; i < concatenateAr.length; i++) {
            System.out.println(concatenateAr[i]);
        }


        //7. Write a java program that will return the min, max and average values in a given array.
        int givenArr[] = {13, 20, 14, 5, 2, 8};
        int maxValue = givenArr[0];
        int minValue = givenArr[0];
        //max
        for (int i = 0; i <= givenArr.length - 1; i++) {
            if (givenArr[i] > maxValue) {
                maxValue = givenArr[i];
                System.out.println("The MAX value is " + maxValue);
            }
        }
        //min
        for (int i = 0; i <= givenArr.length - 1; i++) {
            if (givenArr[i] < minValue) {
                minValue = givenArr[i];
                System.out.println("The MIN value is " + minValue);
            }
        }
        //average
        int sumGivenAr = 0;
        for (int j = 0; j <= givenArr.length - 1; j++) {
            sumGivenAr = sumGivenAr + givenArr[j];
        }
        int averageGivenAr = sumGivenAr / givenArr.length - 1;
        System.out.println("The average of the given array is " + averageGivenAr);


        //8. Write a java program to return the index of a target element.
        int targetElem[] = {13, 20, 14, 5, 2, 8};
        for (int i = 0; i <= targetElem.length - 1; i++) {
            targetElem[i] = targetElem[i] - 1;
            System.out.println(i);
        }


        //9.Write a Java program to find the number of even and odd integers in a given array of integers
        int integersElem[] = {13, 20, 14, 5, 2, 8};
        int evenNum = 0;
        int oddNum = 0;
        for (int i = 0; i <= integersElem.length - 1; i++) {
            if (integersElem[i] % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }
        System.out.println("The even numbers are: " + evenNum + ". And the odd numbers are: " + oddNum + ".");


        //10. Write a program that test if a given String contains another String.
        String baseString = "Hello java world";
        String targetWord = "java";
        if (baseString.contains(targetWord)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }


        //11. Write a program that will count how many times a character appears in a String
        String theString = "Hello java world";
        char characterAppears = 'a';
        int appears = 0;
        char characters[] = theString.toCharArray();
        for (int i = 0; i <= characters.length - 1; i++) {
            if (characters[i] == characterAppears) {
                appears++;
            }
            System.out.println("The character A appears for " + appears + " times.");
        }


        //12. Write a program that will test whether a string ends with another string
        String stringOne = "Hello java world";
        String stringTwo = "orld";
        boolean endWith = false;
        if (stringOne.endsWith(stringTwo)) {
            endWith = true;
            System.out.println("The string ends with " + "'" + stringTwo + "'");
        } else {
            endWith = false;
            System.out.println("The string don't ends with " + "'" + stringTwo + "'");
        }

        //13. Write a program that will return a different string representing the alphabet index of each letter.
        String givenString = "abcd";
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char newString[] = givenString.toCharArray();
        for (int i = 0; i < newString.length; i++) {
            for (int j = 0; j < alphabet.length; j++)
                if (newString[i] == alphabet[j]) {
                    System.out.println(j);
                }
        }


        //14. Write a program that will insert a # between any duplicate letters that are placed right next to each.
        String initalString = "Hello world";
        /*char duplicateLetters = '#';*/
        /*int replace = 0;*/
        char charactersString[] = initalString.toCharArray();
        for (int i = 0; i < charactersString.length - 1; i++) {
            if (charactersString[i] == charactersString[i + 1]) {
                charactersString[i + 1] = '#';
            }
            String duplicateString = new String(charactersString);
            System.out.println(duplicateString);
        }


        //15. Write a program to test whether a given string is a palindrome or not
        String stringA = "aaabccbaaa";
        String stringB = "abccbb";
        boolean test = false;
        for (int i = 0; i < stringA.length() / 2; i++) {
            for (int j = stringA.length() - 1; j < stringB.length() / 2; j++) {
                if (stringA.charAt(i) == stringA.charAt(j)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            }
        }
/*        boolean test = false;
        for (int i = 0; i < stringA.length() / 2; i++) {
        for (int j = 0; j < stringB.length() / 2; j++)
            if (stringA.charAt(i) == stringA.charAt(stringA.length() - i - 1)) {
                test = true;
                System.out.println("True");
            } else {
                System.out.println("False");
            }
            for (int j = 0; j < stringB.length() / 2; j++) {
                if (stringB.charAt(j) == stringB.charAt(stringB.length() - j - 1)) {
                    test = true;
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            }*/
    }
}
