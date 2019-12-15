package Homework1;

public class ex5_BooleanArrays {
    public static void main(String[] args) {
        int[] sir1 = {1, 2, 3, 4};
        int[] sir2 = {1, 2, 3, 4};
        int[] sir3 = {1, 3, 2};
        int[] sir4 = {1, 3};
        int[] sir5 = {1, 2, 3, 4};
        int[] sir6 = {1, 2, 4, 3};

        System.out.println("If the first array is equal with second array, the result is:" + compareArraysIfAreEquals(sir1,sir2));
        System.out.println("If the first array is equal with 3rd array, the result is:" + compareArraysIfAreEquals(sir1,sir3));
        System.out.println("If the first array is equal with 4th array, the result is:" + compareArraysIfAreEquals(sir1,sir4));
        System.out.println("If the 5th array is equal with 6th array, the result is:" + compareArraysIfAreEquals(sir5,sir6));
    }
    private static boolean compareArraysIfAreEquals(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        else {
            for (int i = 0; i < b.length; i++)
                if (a[i] != b[i])
                    return false;
            return true;
        }
    }
}

/*Cerinta:
Write a program that test whether 2 int arrays are equal. Equality in this case means that both arrays have the same number of elements an element on a specific index in first array is equal to the element on the same index in the second array.

For example
For the following arrays [1,2,3,4] and [1,2,3,4] the output should be TRUE
For the following arrays [] and [] the output should be TRUE
For the following arrays [1,3,2] and [1,3] the output should be FALSE
For the following arrays [1,2,3,4] and [1,2,4,3] the output should be FALSE
 */

/*Solutie 2:
public static boolean areEqual(int arr1[], int arr2[]) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        if(areEqual(arr1, arr2)) {
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
 */