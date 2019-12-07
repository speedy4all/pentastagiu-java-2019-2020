package homework1;

import java.util.Scanner;

public class TestAStringContainingAnotherString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String myString="This is my homework for Java Pentastagiu";

        System.out.println("Enter a substring to verify if it is present in your given String");
        String substring=scan.nextLine();
        stringContainingAnotherString(myString, substring);
    }

    public static  Boolean stringContainingAnotherString(String theString, String anotherString){
        Boolean statusString;
        if(theString.contains(anotherString)){
            statusString=true;
            System.out.println("TRUE");
        }else{
            statusString=false;
            System.out.println("FALSE");
        }
        return  statusString;
    }
}
