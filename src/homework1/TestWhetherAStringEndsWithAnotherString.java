package homework1;

import java.util.Scanner;

public class TestWhetherAStringEndsWithAnotherString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String myString="This is my homework for Java Pentastagiu";
        System.out.println("Enter another string to verify if the given string ends with your input");
        String anotherString=scan.nextLine();
        testingIfAStringEndsWithAnotherString(myString, anotherString);

    }

    public static Boolean testingIfAStringEndsWithAnotherString(String myString, String anotherSting){
        Boolean status;
        if(myString.endsWith(anotherSting)){
            System.out.println("TRUE");
            status=true;
        }else{
            System.out.println("FALSE");
            status=false;
        }
        return  status;
    }
}
