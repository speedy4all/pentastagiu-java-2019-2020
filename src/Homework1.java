import java.util.Arrays;

public class Homework1 {

    /**
     * Sum of all integers from 1 to n
     *
     * @param n range upper limit
     * @return
     */
    static int assignment1(int n) {
        return (int) ((n / 2f) * (n + 1));
    }


    /**
     * Sum of integers from i to j
     *
     * @param i from int
     * @param j to int
     */
    static void assignment2(int i, int j) {
        int n = (j - i) + 1; // the number of integers to sum, required for the formula
        int sum = (int) ((n / 2f) * (i + j));
        System.out.println(String.format("Sum of the range between %d and %d is %d", i, j, sum));
        double avg = sum / (double) n;
        System.out.println(String.format("The Avg of the range between %d and %d is %f", i, j, avg));

    }

    /**
     * Calculate n'th fibonaci number
     *
     * @param n the number of the fibonaci number to calculate
     */
    static void assignment3(int n) {
        int sum = 0;
        int fibonaci1 = 1; // holding the n-2 fibonaci number
        int fibonaci2 = 1; // holding the n-1 fibonaci number
        System.out.print("1, 1"); // the first two fibonaci numbers are 1 and 1 so we just print them

        for (int i = 2; i < n; i++) { //skipping the first 2 numbers in the fibonaci range
            int current = fibonaci1 + fibonaci2;
            fibonaci1 = fibonaci2; // assigning the n-2
            fibonaci2 = current; // assigning the n-1
            sum += current; // adding to the sum
            System.out.print(String.format(", %d", current));
        }
        System.out.println(String.format("%nAvg fibonaci number is %f", sum / (double) n));
    }

    /**
     * Check if first and last integers in array are equal
     * we assume that length >= 2
     *
     * @param array the array to check
     * @return true if the head and tail of the array are the same
     */
    static boolean assignment4(int[] array) {
        return array[0] == array[array.length - 1];
    }

    /**
     * Concatenate two int arrays
     *
     * @param a first array
     * @param b second array
     * @return
     */
    static int[] assignment6(final int[] a, final int[] b) {
        final int[] result = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

    /**
     * print the min the max and the avg number in the array
     *
     * @param array the source array
     */
    static void assignment7(int[] array) {
        if (array.length == 0) return;
        int min = array[0];
        int max = array[0];
        int sum = 0;
        for (final int it : array) {
            if (it < min) min = it;
            else if (it > max) max = it; // if it is smaller then min it can't be bigger then max
            sum += it;
        }
        System.out.println(String.format("Max: %d", max));
        System.out.println(String.format("Min: %d", min));
        System.out.println(String.format("Average: %f", sum / (float) array.length));
    }

    /**
     * Write a java program to return the index of a target element.
     *
     * @param array the source array
     * @param n the number to check
     */
    static int assignment8(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) return i;
        }
        return -1;
    }

    /**
     *
     * @param array the source array
     */
    static void assignment9(int[] array) {
        int odd = 0;
        int even = 0;
        for (int it : array) {
            if (it % 2 == 0) even++;
            else odd++;
        }
        System.out.println(String.format("Odd elements count: %d", odd));
        System.out.println(String.format("Even elements count: %d", even));
    }

    /**
     * @param str String to transform
     * @return
     */
    static String assignment13(final String str) {
        if (!str.matches("^[a-z]+$")) return "";
        final StringBuilder result = new StringBuilder();
        str.chars().map(it -> it - 97).forEach(result::append);
        return result.toString();
    }

    /**
     * @param str String to Transform
     * @return
     */
    static String assignment14(final String str) {
        final StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char it = str.charAt(i);
            if (it == str.charAt(i - 1)) {
                result.append('#');
            }
            result.append(it);
        }
        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(assignment1(5));
        assignment2(2, 5);
        assignment3(20);
        System.out.println(assignment4(new int[]{2, 6, 2, 8, 2}));

        int[] a = {2, 1, 3, 0};
        int[] b = {2, 1, 4};
        /*
        assignment5 is perfectly describing the Arrays.equals(...)
        1. if both arguments have the same reference, the method will return true,
        2. if one of the arguments is null, the method will return false, the null == null condition was checked in the first step.
        3. if the length of the arrays is different return false.
        4. loop over the arrays, if any of the elements are different return false.
        5. return true. this means the loop finished and no mismatches were found.
         */
        boolean arraysEqual = Arrays.equals(a, b);
        System.out.println(arraysEqual);

        System.out.println(Arrays.toString(assignment6(a, b)));

        int[] source = new int[]{13, 20, 14, 5, 2, 8};
        System.out.println("\nGiven " + Arrays.toString(source));
        assignment7(source);
        System.out.println(String.format("Index of 20 is %d", assignment8(source, 20)));
        assignment9(source);

        //assignment10 test String
        String str = "Hello java world";
        System.out.println("\nGiven '" + str + "'");
        String testWord = "java";
        System.out.println(String.format("Does it contain '%s'? %s", testWord, str.contains(testWord)));

        //assignment11
        long charCount = str.chars().filter(c -> 'a' == c).count();
        System.out.println(String.format("There are %d 'a' characters", charCount));

        //assignment12
        System.out.println(String.format("Does it end with 'orld'? %s", str.endsWith("orld")));

        //assignment13
        System.out.println(String.format("'%s' -> '%s'", "abcdefgh", assignment13("abcdefgh")));

        //assignment14
        System.out.println(assignment14(str));

    }
}
