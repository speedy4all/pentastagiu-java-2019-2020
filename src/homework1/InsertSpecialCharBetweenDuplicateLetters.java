package homework1;

public class InsertSpecialCharBetweenDuplicateLetters {
    public static String outputString="";
    public static void main(String[] args) {
        String myString="Heeello";
        pairLetters(myString, 0);
        System.out.println(outputString);
    }


    public static void pairLetters(String myString, Integer position){
        outputString=outputString+ myString.charAt(position);
        if (position == myString.length() - 1)
            return;
        if(myString.charAt(position)==myString.charAt(position+1))
            outputString=outputString+'#';
        pairLetters(myString,position+1);
    }
}
