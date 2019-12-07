package homework1;

import java.util.Scanner;

public class NumberOfTimesACharacterAppearsInString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String myString="This is my homework for Java Pentastagiu";
        System.out.println("Enter a char to verify ho many times appears in your given string");
        Character myChar=scan.nextLine().charAt(0);
        countNUmberOfTimesTheCharacterAppearsInString(myString, myChar);
    }


    public static Integer countNUmberOfTimesTheCharacterAppearsInString(String myString, Character theChar){
        Integer counter=0;
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i)==theChar){
                counter++;
            }
        }
        System.out.println("The char " + theChar + " appears for " + counter +" times in your string.");
        return counter;
    }
}
