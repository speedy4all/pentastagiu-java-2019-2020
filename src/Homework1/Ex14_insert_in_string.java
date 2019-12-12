package Homework1;// Write a program that will insert a # between any duplicate letters that are placed right next to each.
// For example
//  Given the following string “Hello world” the output should be “Hel#lo world”

public class Ex14_insert_in_string {
    public static void main(String[] args) {
      String s = "Hello world";
      String insert = "";

      for(int i=0; i<s.length(); i++){
          insert = insert + s.charAt(i);
          if(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
              insert = insert + '#';
          }
      }
        System.out.println(insert);
    }
}
