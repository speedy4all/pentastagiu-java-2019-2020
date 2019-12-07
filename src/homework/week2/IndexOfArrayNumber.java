package homework.week2;

/*
Write a java program to return the index of a target element.

For example:
Given  the following array [13,20,14,5,2,8] and a target element 5 the output should be : 3 (because 5 is located at index 3 in the array)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfArrayNumber {
    public static void main(String[] args) {
        //User input of the array
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the numbers using ' ' to separate them: ");
        String input = scn.nextLine();
        System.out.println(input);
        Scanner tokenizer = new Scanner(input);
        tokenizer.useDelimiter(" ");
        ArrayList<String> arr = new ArrayList<>();
        while(tokenizer.hasNext())
        {
            arr.add(tokenizer.next());
        }

        //Returning the index of a target element
        System.out.println("Enter the target number: ");
        Scanner scanner = new Scanner(System.in);
        String targetNumber= scanner.nextLine();
        System.out.println("The index number of " + targetNumber + " is " + arr.indexOf(targetNumber));
        int index = arr.indexOf(targetNumber);
        if(index==-1){
            System.out.println("The number " + targetNumber + " is not in the list!");
        }
    }
}
