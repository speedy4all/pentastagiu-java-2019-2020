package Homework1;

public class ex4_BooleanElements {
    public static void main(String[] args) {
        int[] sir1 = {13, 6, 2, 8, 2, 3};
        int[] sir2 = {13, 6, 2, 8, 2, 13};

        System.out.println("If first and last element are not equals, then result is:" + compareFirstAndLastElements_IfAreEquals(sir1));
        System.out.println("If first and last element are equals, then result is:" + compareFirstAndLastElements_IfAreEquals(sir2));
    }
    private static boolean compareFirstAndLastElements_IfAreEquals(int[] a) {
        return a[0] == a[a.length - 1];

    }
}

/*Cerinta:
Write a java program that will test whether the first and the last element of an int array are the same. We can assume the array has 2 or more elements.

For example:
For the following input [13,6,2,8,2,3] the output should be : FALSE
For the following input [13,6,2,8,2,13] the output should be : TRUE
 */