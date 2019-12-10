public class Main {
    public static void main(String[] args){

        String input = "abcd";
        String string= "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i < input.length(); i++){
            string +=alphabet.indexOf(input.charAt(i));
        }
        System.out.println(string);
    }
}
