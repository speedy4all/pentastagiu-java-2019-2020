package Homework1;//  Write a Java program to find the number of even and odd integers in a given array of integers
//  For example.
//  Given the following array [13,20,14,5,2,8] the output should be:
//  Odd elements count : 2
//  Even elements count : 4

public class Ex9_even_odd {
    public static void main(String[] args) {
        int arr[] = {13, 20, 14, 5, 2, 8};
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even elements count: " + evenCount);
        System.out.println("Odd elements count: " + oddCount);
    }
}
