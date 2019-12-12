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
