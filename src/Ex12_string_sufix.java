//  Write a program that will test whether a string ends with another string
//  For example
//  Given the following strings “Hello java world” and “orld” the output should be TRUE

public class Ex12_string_sufix {
    public static void main(String[] args) {
        String s1 = "Hello java world";
        String s2 = "orlds";
        boolean isSufix;

        if(s1.endsWith(s2)){
            isSufix = true;
            System.out.println(isSufix);
        }else{
            isSufix = false;
            System.out.println(isSufix);
        }
    }
}
