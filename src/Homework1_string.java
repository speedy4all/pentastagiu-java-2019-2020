import java.util.Scanner;

public class Homework1_string {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

     //problem 10
        System.out.println("10.Please insert first string");
        String s1= scan.nextLine();
        System.out.println("Please insert second string");
        String s2= scan.nextLine();
        boolean ok = false;
        if(s1.contains(s2)) ok=true;
        System.out.println(ok);

     //problem 11
        System.out.println("11.Please insert  string");
        String s3= scan.nextLine();
        System.out.println("Please insert  char");
        char c3 = scan.next().charAt(0);
        int count=0;
        for(int i=0; i<s3.length();i++)
            if(s3.charAt(i)==c3) count++;
        System.out.println("The char "+ c3 + "is appearing for " + count + " times" );

     //problem 12
        System.out.println("12.Please insert main string");
        String s4= scan.nextLine();
        System.out.println("Please insert end string");
        String s5= scan.nextLine();
        boolean ok1=false;
        if(s4.endsWith(s5)) ok1=true;
        if(ok1==true) System.out.println("The string "+ s4 +" ends with "+ s5);
        else System.out.println("The string "+ s4 +" not ends with "+ s5);

     //problem 13
        System.out.println("13.Please insert a value for a ");
        int a = scan.nextInt();
        System.out.println("Please insert a value for b ");
        int b = scan.nextInt();
        System.out.println("Please insert a value for b ");
        int c = scan.nextInt();
        System.out.println("Please insert a value for b ");
        int d = scan.nextInt();
        String s6= a+""+b+""+c+""+d;
        System.out.println("The output for abcd is "+ s6);

     //problem 14
        System.out.println("14.Please insert main string");
        String s7= scan.nextLine();
        StringBuilder s7_1=new StringBuilder(s7);
        for(int i=0;i<s7.length()-1;++i)
        {
            if(s7.charAt(i)==s7.charAt(++i))
                s7_1=s7_1.insert(i,"#");
            s7=s7_1.toString();
        }
        System.out.println("The result: " + s7_1);

     //problem 15
        System.out.println("15.Please insert main string");
        String s8 = scan.nextLine();
        int i=0;
        int j=s8.length()-1;
        boolean palindrom=true;
        while(i<j)
        {
            if(s8.charAt(i)!=s8.charAt(j))
                palindrom=false;
            i++;
            j--;
        }
        if(palindrom==true)
            System.out.println("The string " + s8 + " is a palindrome");
        else
            System.out.println("The string " + s8 + " is not a palindrome");

    }
}
