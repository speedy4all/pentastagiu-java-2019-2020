package homework.week2;

/*
Write a java program that will return the min, max and average values in a given array.

For example
Given the following array [13,20,14,5,2,8] the output should be
Max : 20
Min : 2
Average: 10.3
 */

import java.util.Scanner;

public class MinMaxAvg {
    public static void main(String[] args) {
        //User input of the array
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the number of size of array");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter a integer array element");
        //For reading the element
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        //Math operations with the contents of the array
        int max = getMax(arr);
        int min = getMin(arr);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        float sum=0, avg=0;
        for(int i=0; i<arr.length;i++){
            sum =sum + arr[i];
            avg = sum/size;
        }
        System.out.println("Average: " + avg);
    }
    // Method for getting the maximum value
    private static int getMax(int[] arr){
        int maxValue = arr[0];
        for(int i=1;i < arr.length;i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    // Method for getting the minimum value
    private static int getMin(int[] arr){
        int minValue = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
