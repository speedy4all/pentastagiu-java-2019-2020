package homework1;

public class ReturnAStringRepresentingAlphabetIndex {
    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz"; //note the to lower case in order to treat a and A the same way
        for (int j=0; j<alphabet.length(); j++) {
            System.out.print(alphabet.charAt(j) + "\t");
        }
        System.out.println();
        for (int i = 0; i < alphabet.length(); ++i) {
            int position = alphabet.charAt(i) - 'a' + 1;
            System.out.print(position + "\t");
        }
    }
}
