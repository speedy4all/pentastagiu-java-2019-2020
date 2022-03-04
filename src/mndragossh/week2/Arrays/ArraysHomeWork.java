package src.mndragossh.week2.Arrays;

public class ArraysHomeWork {

    /***
     * check if first and last element are equal
     * @param array
     * @return boolea value
     */
    public static boolean checkEqualFandL(int[] array) {
        if (array.length < 2) {
            return false;
        }

        return array[0] == array[array.length - 1];
    }

    /***
     * check if arrays are equal
     * @param fArray
     * @param sArray
     * @return boolean value
     */
    public static boolean checkArraysEqual(int[] fArray, int[] sArray) {
        if (fArray.length != sArray.length) {
            return false;
        }

        if (fArray.length == 0) {
            return true;
        }

        for (var i = 0; i < fArray.length; i++) {
            if (fArray[i] != sArray[i]) {
                return false;
            }
        }

        return true;
    }

    /***
     * concatinate two arrays
     * @param fArray
     * @param sArray
     * @return
     */
    public static int[] concatArrays(int[] fArray, int[] sArray) {
        int[] temp = new int[fArray.length + sArray.length];
        int idx = 0;
        for (int i : fArray
        ) {
            temp[idx] = i;
            idx++;
        }

        for (int i : sArray
        ) {
            temp[idx] = i;
            idx++;
        }

        return temp;
    }

    public static String minMaxAverage(int[] array) {
        int max, min;
        float average;
        if (array.length < 2) {
            return String.format("Min %o, max %o and average %a", 0, 0, 0);
        }
        max = array[array.length - 1];
        min = array[0];
        for (var i : array
        ) {
            max = Math.max(i, max);
            min = Math.min(i, min);
        }
        average = (float) ((min + max) / 2);
        return String.format("Min %d, max %d and average %.2f", min, max, average);
    }

    public static String targetIdx(int[] array, int target) {
        if (array.length == 0) {
            return "Not elements.";
        }

        for (var i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return String.format("Found at %d", i);
            }
        }

        return "Oops sorry";
    }

    public static String oddAndEven(int[] array) {
        int even = 0, odd = 0;
        if (!(array.length > 0)) {
            return "Not found";
        }

        for (var i : array
        ) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return String.format("Even %d, Odd %d", even, odd);
    }
}
