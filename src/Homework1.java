import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.io.*;

class tema1 {
    public static void main(String args[]) {
        int sum=0;
        int i;
        Scanner a = new Scanner(System.in);
        System.out.println("Introduceti nr:");
        int length = a.nextInt();
        int[] myArray = new int[length];

        for (i = 0; i <= length; i++) {
            sum +=i;}
        System.out.println(sum);

    }
}

class tema2 {
    public  static void main(String args[]) {
        int i;
        int c;
        int b;
        Scanner a = new Scanner(System.in);
        System.out.println("Introduceti nr:");
        int length = a.nextInt();
        int[] myArray = new int[length];
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti nr:");
        int lengtha = s.nextInt();
        int[] myArraya = new int[lengtha];
        b=0;
        for(i=length; i<=lengtha; i++){
            b+= i;}
        System.out.println("Suma este:"+ b);
    }}

class Tema3 {
    static void printFibonacciNumbers(int n) {
        int f1 = 0, f2 = 1, i;

        if (n < 1)
            return;

        for (i = 1; i <= n; i++) {
            System.out.print(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }

    public static void main(String[] args) {
        int d;
        double ave;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        d = keyboard.nextInt();

        {
            printFibonacciNumbers(d);

        }
    }}


class tema4 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti un nr pt lungimea sirului :");
        int length = s.nextInt();
        int [] myArray = new int[length];
        System.out.println("Introduceti elementele sirului:");

        for(int i=0; i<length; i++ ) {
            myArray[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(myArray));

        Scanner c = new Scanner(System.in);
        System.out.println("Introduceti un nr pt lungimea sirului :");
        int lengtha = c.nextInt();
        int [] myArraya = new int[lengtha];
        System.out.println("Introduceti elementele sirului:");

        for(int i=0; i<lengtha; i++ ) {
            myArraya[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(myArraya));
// AR MAI FI O METODA DECLARAREA UNEI VAR DE TIP BOOLEAN ACEEASI CONDITIE IF SI PRINTAREA VARIABILEI
        if(myArray[0]== myArraya[0])

            System.out.println("primul element acelasi:TRUE");
        else System.out.println("primul element nu e acelasi:FALSE");
        if(myArray[myArray.length-1]== myArraya[myArraya.length-1])
            System.out.println("ultimul element acelasi:TRUE");
        else System.out.println("ultimul element nu e acelasi:FALSE");

    }}
class tema5 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti un nr pt lungimea sirului :");
        int length = s.nextInt();
        int [] myArray = new int[length];
        System.out.println("Introduceti elementele sirului:");

        for(int i=0; i<length; i++ ) {
            myArray[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(myArray));

        Scanner c = new Scanner(System.in);
        System.out.println("Introduceti un nr pt lungimea sirului :");
        int lengtha = c.nextInt();
        int [] myArraya = new int[lengtha];
        System.out.println("Introduceti elementele sirului:");

        for(int i=0; i<lengtha; i++ ) {
            myArraya[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(myArraya));


        System.out.println("is arr1 equals to arr2 : " +
                Arrays.equals(myArray, myArraya)

        );



    }}
class tema6 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti un nr pt lungimea sirului :");
        int length = s.nextInt();
        int[] myArray = new int[length];
        System.out.println("Introduceti elementele sirului:");

        for (int i = 0; i < length; i++) {
            myArray[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(myArray));

        Scanner c = new Scanner(System.in);
        System.out.println("Introduceti un nr pt lungimea sirului :");
        int lengtha = c.nextInt();
        int[] myArraya = new int[lengtha];
        System.out.println("Introduceti elementele sirului:");

        for (int i = 0; i < lengtha; i++) {
            myArraya[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(myArraya));
        IntStream test1= IntStream.of(myArray);
        IntStream test2= IntStream.of(myArraya);
        IntStream.concat(test1, test2)
                .forEach(element -> System.out.print(element));
    }}
class tema7 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti un nr pt lungimea sirului :");
        int length = s.nextInt();
        int[] myArray = new int[length];
        System.out.println("Introduceti elementele sirului:");

        for (int i = 0; i < length; i++) {
            myArray[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(myArray));

        Arrays.sort(myArray);
        int min =myArray[0];
        System.out.println(min);
        int max= myArray[myArray.length-1];
        System.out.println(max);


    }}
class tema8{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti lungimea array:");
        int length = s.nextInt();
        int[] myArray = new int[length];
        System.out.println("Introduceti elementele  array:");

        for (int i = 0; i < length; i++) {
            myArray[i] = s.nextInt();
        }
        int z;
        System.out.println(Arrays.toString(myArray));
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an number: ");
        z = keyboard.nextInt();
// if array is Null
        int t=0;
       /* if (myArray == null) {
            System.out.println("gresit");;
        }*/

        // find length of array
        int len = myArray.length;
        int x = 0;
        for(x=0; x< len; x++)

            // while (x < len) {

            if (myArray[x] == z)
                System.out.println(x);
            /* else {
                x += 1;*/
    }
}

class tema9{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti lungimea array:");
        int length = s.nextInt();
        int[] myArray = new int[length];
        System.out.println("Introduceti elementele  array:");

        for (int i = 0; i < length; i++) {
            myArray[i] = s.nextInt();
        }
        int z;
        System.out.println(Arrays.toString(myArray));
        int ctr = 0;
        for(int i = 0; i < myArray.length; i++)
        {
            if(myArray[i] % 2 == 0)
                ctr++;
        }
        System.out.println("Number of even numbers : "+ctr);
        System.out.println("Number of odd numbers  : "+(myArray.length-ctr));
    }
}

class tema10 {
    public static void main(String args[]) {
        String str1 = "Hello java world";
        if (str1.contains("java")) {
            System.out.println("The Keyword :java: is found in given string");
        } else {
            System.out.println("The Keyword :java: is not found in the string");
        }
    }
}

class tema11{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti lungimea array:");
        int length = s.nextInt();
        int[] myArray = new int[length];
        Scanner in = new Scanner(System.in);

        String m = in.nextLine();
        System.out.println("You entered string "+m);

        Scanner y = new Scanner(System.in);
        System.out.println("I:");
        char ch = y.next().charAt(0);
        int res = 0;

        for (int i=0; i<m.length(); i++)
        {
            // checking character in string
            if (m.charAt(i)== ch)
                res++;
        }

        System.out.println(res);

    }

}
class tema12 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti lungimea array:");
        int length = s.nextInt();
        int[] myArray = new int[length];
        Scanner in = new Scanner(System.in);

        String m = in.nextLine();
        System.out.println("You entered string " + m);
        /*System.out.println("Introduceti elementele  array:");*/
        Scanner d = new Scanner(System.in);

        String n = in.nextLine();
        System.out.println("You entered string " + n);

        if (m.endsWith(n))
            System.out.println("Stringul se termina cu : "+n);
        else System.out.println("stringul nu se termina cu :"+n);

    }
}
class tema13 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti lungimea array:");
        int length = s.nextInt();
        int[] myArray = new int[length];
        Scanner in = new Scanner(System.in);

        String m = in.nextLine();
        System.out.println("You entered string " + m);

        char[] ch = m.toCharArray();
        for (char c : ch) {
            int temp = (int) c;
            int temp_integer = 96; //litere mici
            if (temp <= 122 & temp >= 97)
                System.out.print(temp - temp_integer);
        }
    }}

class tema14 {
    public static void main(String args[]) {
      /*  Scanner s = new Scanner(System.in);
        System.out.println("Introduceti lungimea array:");
        int length = s.nextInt();
        int[] myArray = new int[length];*/
        Scanner in = new Scanner(System.in);

        String m = in.nextLine();
        System.out.println("You entered string " + m);

        char a = '#';
        for (int i=0; i<m.length(); i++ )    {
            if ( m.charAt(i)== m.charAt(i-1)){
       /* String temp = m + a;
        System.out.println(temp);*/
                m = m.substring(0, i) + "#" + m.substring(i, m.length());
            }
        }
        System.out.println(m);

    }
}




















class tema15 {
    public static void main(String args[])
    {
        String str, rev = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        str = sc.nextLine();

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");

    }
}


