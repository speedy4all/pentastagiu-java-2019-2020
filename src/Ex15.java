public class Ex15 {
//Write a program that will return a different string representing the alphabet index of each letter.
//
//Assuming we have the following alphabet encoding
//
//a = 0
//b = 1
//c = 2
//d = 3
//…
//
//For the given string “abcd” the output should be “0123”

    public static void main(String[] args) {

        String input = "abcd".toLowerCase();
        final String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < input.length(); i++)
            System.out.print(alphabet.indexOf(input.charAt(i)));
    }


}
}
