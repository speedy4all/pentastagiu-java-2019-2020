package Homework1;//Write a java program that will return the min, max and average values in a given array.

public class Ex7_min_max_avg_array {
    public static void main(String[] args) {
        int[] arr = {13, 20, 14, 5, 2, 8};

        int min = arr[0];
        int max = arr[0];
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum = sum + arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + avg);
    }

}
