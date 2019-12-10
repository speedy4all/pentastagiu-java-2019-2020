import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        char ch = '#';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        for(int i = 1; i < string.length(); i++){
            if(string.charAt(i) == string.charAt(i - 1)){
                string = string.substring(0, i) + ch + string.substring(i, string.length());
            }
        }

        System.out.println(string);
    }
}
