/*Write a java program that will test whether the first and the last
 element of an int array are the same.
 We can assume the array has 2 or more elements.*/
inport java.util.Scanner;
inport java.util.Arrays;
            public class FirstAndLastElem {

                public static void main(String[] args) {
                    Scanner a = new Scanner(System.in);
                    System.out.println("Imput length of the array:");

                    int length = a.nextInt();
                    int anArray[]= new int[length];

                    System.out.println("The elements of the array are:");

                    for(int i=0; i < length; i++ ) {
                        anArray[i] = a.nextInt();
                    }
                    System.out.println(Arrays.toString(anArray));

                    if (anArray[0] == anArray[anArray.length - 1]) {
                        System.out.println("Tru");
                    } else {
            System.out.println("False");
        }
    }
}


