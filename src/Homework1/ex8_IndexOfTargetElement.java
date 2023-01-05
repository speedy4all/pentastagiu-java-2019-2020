package Homework1;

public class ex8_IndexOfTargetElement {
    public static void main(String[] args) {
        int arr[] = {17, 23, 14, 6, 24, 8, 35};
        int value = 24;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                int index = i;
                System.out.println("Element 24 was found at index: " + index);
            }
        }
    }
}


/*Request:
Write a java program to return the index of a target element.
For example:
Given  the following array [13,20,14,5,2,8] and a target element 5 the output should be : 3 (because 5 is located at index 3 in the array)
 */