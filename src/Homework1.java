public class Homework1 {

    // Write a program that will sum up all numbers from 0 up to a target number.
    public static void exercise1 (int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum=" + sum);
    }

    public static void main(String[] args) {
        Homework1.exercise1(5);
    }
}
