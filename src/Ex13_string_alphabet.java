//  Write a program that will return a different string representing the alphabet index of each letter.
//  Assuming we have the following alphabet encoding
//  a = 0
//  b = 1
//  c = 2
//  d = 3
//  For the given string “abcd” the output should be “0123”
public class Ex13_string_alphabet {
    public static void main(String[] args) {
        String s = "abcd";
        char letter;
        for(int i=0; i<s.length(); i++)
        {
            letter = s.charAt(i);
            if(letter>='A' && letter<='Z')
                System.out.println((int)letter - 'A'+1);
            if(letter>='a' && letter<= 'z')
                System.out.println((int)letter - 'a'+1);
        }
    }
}
