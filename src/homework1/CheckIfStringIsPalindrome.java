package homework1;

import java.util.Scanner;

public class CheckIfStringIsPalindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string to verify if is a palindrome");
        String myString=scan.nextLine();
        verifyIfStringIsPalindrome(myString);
    }

    public static Boolean verifyIfStringIsPalindrome(String inputString){
        Boolean stringStatus;
        if(inputString.equals(new StringBuilder(inputString).reverse().toString())){
            stringStatus=true;
            System.out.println("Is palindrome");
        }else{
            stringStatus=false;
            System.out.println("Is not palindrome");
        }
        return stringStatus;
    }
}
