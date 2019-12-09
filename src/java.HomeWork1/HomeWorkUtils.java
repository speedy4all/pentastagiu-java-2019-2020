import Exceptions.ArgumentIllegalException;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class HomeWorkUtils {
    /*
          1. Write a program that will sum up all numbers from 0 up to a target number.
          For example, for an input number 5, result should be 15 (0+1+2+3+4+5)
    */
    static int sumFromZeroToNumber(int targetNumber) {
        if (targetNumber < 0) {
            throw new ArgumentIllegalException("Nu pot face suma pana la un numar negativ");
        }
        return IntStream.rangeClosed(0, targetNumber)
                .sum();
    }

    /*   2.Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.*/
    static IntSummaryStatistics sumAndAverageFromInterval(int startIntervalNumber, int endIntervalNumber) {
        if (startIntervalNumber > endIntervalNumber) {
            throw new ArgumentIllegalException("Numarul de start al intervalului nu poate fi mai mare decat cel de sfarsit");
        }
        return IntStream.rangeClosed(startIntervalNumber, endIntervalNumber)
                .summaryStatistics();
    }

    /*  3.Write a program that will print the first x fibonacci numbers. Also calculate the average value.*/
    static void averageAndPrintOfFirstFibonacci(int maxSize) {
        if (maxSize <= 0) {
            throw new ArgumentIllegalException("Un numar de termeni nu poate fi negativ sau 0");
        }
        List<Integer> fibonacciList = Stream.iterate(new int[]{1, 1}, HomeWorkUtils::generateFibonacciPair)
                .limit(maxSize)
                .map(arrayOfPair -> arrayOfPair[0])
                .collect(Collectors.toList());
        System.out.println("Sirul fibonacci cu dimensiunea maxima : " + maxSize + " este :" + fibonacciList.toString());
        System.out.println("Media este : " + fibonacciList.stream().mapToInt(Integer::intValue).average().orElse(-1));

    }

    private static int[] generateFibonacciPair(int[] fibPair) {
        return new int[]{fibPair[1], fibPair[0] + fibPair[1]};
    }

    /* 4. Write a java program that will test whether the first and the last element of an int array are the same.
        We can assume the array has 2 or more elements.
    */
    static boolean isEndsOfArrayTheSame(int[] array) {
        if (array == null) {
            throw new ArgumentIllegalException("Nu poti sa dai null. Array=ul e tot un obiect.");
        }
        return array[0] == array[array.length - 1];
    }

    /* 5.Write a program that test whether 2 int arrays are equal.
    Equality in this case means that both arrays have the same number of elements an element on a specific index in first array is equal to the element on the same index in the second array.
     */
    static boolean isArraysEqual(int[] first, int[] second) {
        if (first == null || second == null) {
            throw new ArgumentIllegalException("Nu poti sa dai null. Array-ul e tot un obiect.");
        }
        if (first.length != second.length) {
            return false;
        }
        return Arrays.equals(first, second);

    }

    /* 6.Write a java program that will concatenate 2 arrays. */
    static int[] concateArrays(int[] first, int[] second) {
        if (first == null || second == null) {
            throw new ArgumentIllegalException("Nu poti sa dai null. Array-ul e tot un obiect.");
        }
        return joinArrays(first, second);

    }

    private static int[] joinArrays(int[] first, int[] second) {
        int[] joinedArray = new int[first.length + second.length];
        System.arraycopy(first, 0, joinedArray, 0, first.length);
        System.arraycopy(second, 0, joinedArray, first.length, second.length);
        return joinedArray;
    }

    /* 7.Write a java program that will return the min, max and average values in a given array.
     */
    static IntSummaryStatistics summaryOfArray(int[] array) {
        if (array == null) {
            throw new ArgumentIllegalException("Nu poti sa dai null. Array-ul e tot un obiect.");
        }
        return Arrays.stream(array)
                .summaryStatistics();
    }

    /*8
Write a java program to return the index of a target element.

     */
    static int indexOfElement(int[] array, int element) {
        if (array == null) {
            throw new ArgumentIllegalException("Nu poti sa dai null. Array-ul e tot un obiect.");
        }
        Arrays.sort(array);
        return indexOfElementWithBinarySearch(array, element);
    }

    private static int indexOfElementWithBinarySearch(int[] array, int element) {
        int middleElement, leftElement = 0, rightElement = array.length - 1;
        while (leftElement <= rightElement) {
            middleElement = (leftElement + rightElement) / 2;
            if (array[middleElement] == element) {
                return middleElement;
            } else {
                if (array[middleElement] < element) {
                    leftElement = middleElement + 1;

                } else {
                    rightElement = middleElement - 1;
                }
            }
        }
        return -1;
    }

    /* 9
Write a Java program to find the number of even and odd integers in a given array of integers
     */
    static void displayOddAndEventCount(int[] array) {
        if (array == null) {
            throw new ArgumentIllegalException("Nu poti sa dai null. Array-ul e tot un obiect.");
        }
        long evenCount = Arrays.stream(array)
                .filter(element -> element % 2 == 0)
                .count();
        long oddCount = Arrays.stream(array)
                .filter(element -> element % 2 != 0)
                .count();
        System.out.println("Numarul de numere pare este : " + evenCount + " si impare : " + oddCount);
    }

    /* 10 Write a program that test if a given String contains another String.*/
    static boolean stringContainsAnotherString(String first, String second) {
        if (first == null || second == null) {
            throw new ArgumentIllegalException("Stringul nu poate fi null.");
        }
        return first.contains(second);
    }

    /* 11 Write a program that will count how many times a character appears in a String
     */
    static long countOfChar(String sequence, char character) {
        if (sequence == null) {
            throw new ArgumentIllegalException("Stringul nu poate fi null.");
        }
        return Arrays.stream(sequence.split(""))
                .filter(charOfString -> charOfString.toCharArray()[0] == (character))
                .count();
    }

    /* 12 Write a program that will test whether a string ends with another string
     */
    static boolean isStringEndsWith(String first, String second) {
        if (first == null || second == null) {
            throw new ArgumentIllegalException("Stringul nu poate fi null.");
        }
        return first.regionMatches(first.length() - second.length(), second, 0, second.length());
    }

    /* 13 Write a program that will return a different string representing the alphabet index of each letter.

     */
    static String getStringIndex(String first) {
        if (first == null) {
            throw new ArgumentIllegalException("Stringul nu poate fi null.");
        }
        int numberOfCharInAlphabet = 31;
        StringBuilder stringBuilder = new StringBuilder();
        for (int stringIndex = 0; stringIndex < first.length(); stringIndex++) {
            stringBuilder.append((first.charAt(stringIndex) & numberOfCharInAlphabet) - 1);
        }
        return stringBuilder.toString();

    }

    /*14 Write a program that will insert a # between any duplicate letters that are placed right next to each.

     */
    static String replaceDuplicate(String sequence) {
        if (sequence == null) {
            throw new ArgumentIllegalException("Stringul nu poate fi null.");
        }
        return sequence.replaceAll("(\\w)\\1", "$1#$1");
    }


}
