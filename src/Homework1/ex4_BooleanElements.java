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
