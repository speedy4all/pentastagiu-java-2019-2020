package Homework1;//Write a program that test whether 2 int arrays are equal. Equality in this case means that
// both arrays have the same number of elements an element on a specific index in first array
// is equal to the element on the same index in the second array.

public class Ex5_equal_arrays {
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
    }
}
