import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        if( isPalindrome(string)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }

    public static boolean isPalindrome(String string){
        String newString ="";
        for(int i = string.length()-1; i >=0 ; i--){
            newString += string.charAt(i);
        }
        if(newString.equals(string)){
            return true;
        }else{
            return false;
        }

    }
}
