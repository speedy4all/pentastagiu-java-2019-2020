package Teme_w2_PentaStagiu;


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class temeW2 {
    /* Number 1 -- Write a program that will sum up all numbers from 0 up to a target number.
    For example, for an input number 5, result should be 15 (0+1+2+3+4+5) */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = {};

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);


    }

    /* Number 2 - Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
    For example, for range numbers 1 to 100 output should be:
    Sum for range 1 to 100 : 5050*/
    public static class ex2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int sum = 0;
            for (int i = n; i <= m; i++) {
                sum += i;
            }
            System.out.println("Sum between the range of 2 numbers is " + sum);
            //Average for range 1 to 100 : 50.0
            double average = (n + m) / 2;
            System.out.println("Average is " + average);
        }
    }

    /* Number 3 - Write a program that will print the first x fibonacci numbers. Also calculate the average value. For example
For an input of x = 20 the output should be:
The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5 */
    public static class ex3Fibonacci {
        public static void main(String[] args) {
            int number1 = 0;
            int number2 = 1;
            double average = 0;
            int sum = 0;

            Scanner scaner = new Scanner(System.in);
            System.out.println("Number :");
            int number = scaner.nextInt();
            System.out.println("The first  " + number + " Fibonacci numbers are :");

            System.out.println(number2);
            for (int i = 2; i <= number; i++) {
                int num = 0;
                num = number1 + number2;
                System.out.println(" " + num);
                number1 = number2;
                number2 = num;
                sum = sum + num;
            }
            //System.out.println(" ");
            average = sum / number;
            System.out.println("Average is " + average);


        }
    }

    /* Number 4 - Write a java program that will test whether the first and the last element of an int array are the same.
     We can assume the array has 2 or more elements.
For example:
For the following input [13,6,2,8,2,3] the output should be : FALSE
For the following input [13,6,2,8,2,13] the output should be : TRUE*/

}

class ex4FirstAndLastElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the lenght of array : ");
        int lenght = scanner.nextInt();
        int[] ArrayNo1 = new int[lenght];
        System.out.println("Elements of array :");
        for (int i = 0; i < lenght; i++) {
            ArrayNo1[i] = scanner.nextInt();
        }
        if (ArrayNo1[0] == ArrayNo1[lenght - 1]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
    /*Write a program that test whether 2 int arrays are equal.
     Equality in this case means that both arrays have the same number of elements an element
     on a specific index in first array is equal to the element on the same index in the second array.
For example
For the following arrays [1,2,3,4] and [1,2,3,4] the output should be TRUE
For the following arrays [] and [] the output should be TRUE
For the following arrays [1,3,2] and [1,3] the output should be FALSE
For the following arrays [1,2,3,4] and [1,2,4,3] the output should be FALSE*/

    public static class ex5ArraysAreEquals {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the lenght of array number one  : ");
            int lenghtNo1 = scanner.nextInt();
            int[] ArrayNo1 = new int[lenghtNo1];
            System.out.println("Elements of Array number one : ");
            for (int i = 0; i < lenghtNo1; i++) {
                ArrayNo1[i] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(ArrayNo1));
            System.out.println("Enter the lenght of array number two  : ");
            int lenghtNo2 = scanner.nextInt();
            int[] ArrayNo2 = new int[lenghtNo2];
            System.out.println("Elements of Array number two : ");
            for (int j = 0; j < lenghtNo2; j++)
                ArrayNo2[j] = scanner.nextInt();
            System.out.println(Arrays.toString(ArrayNo2));
            /*if (ArrayNo1.length == ArrayNo2.length){
                System.out.println(true);
            }*/
            System.out.println(Arrays.equals(ArrayNo1, ArrayNo2));


        }


    }

    /*Write a java program that will concatenate 2 arrays.
For example
Given 2 arrays [1,2,3,4] and [5,6,7,8] the output should be a new array containing [1,2,3,4,5,6,7,8] */
    public static class ex6Concatenation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the lenght for array number one : ");
            int lenghtNo1 = scanner.nextInt();
            int[] ArrayNo1 = new int[lenghtNo1];
            System.out.println("Enter the elements for ArrayNo1 : ");
            for (int i = 0; i < lenghtNo1; i++) {
                ArrayNo1[i] = scanner.nextInt();
                //System.out.println(Arrays.toString(ArrayNo1));
            }
            System.out.println(Arrays.toString(ArrayNo1));
            System.out.println(" Enter the lenght for array number two : ");
            int lenghtNo2 = scanner.nextInt();
            int[] ArrayNo2 = new int[lenghtNo2];
            System.out.println("Enter the elements for ArrayNo2 : ");
            for (int j = 0; j < lenghtNo2; j++) {
                ArrayNo2[j] = scanner.nextInt();
                //System.out.println(Arrays.toString(ArrayNo2));
            }
            System.out.println(Arrays.toString(ArrayNo2));

            //int []  ArrayConcat = new int [Integer.parseInt(Arrays.toString(ArrayNo1)+Arrays.toString(ArrayNo2))];
            //System.out.println(ArrayConcat);


            int[] ArrayConcat = Arrays.copyOf(ArrayNo1, ArrayNo1.length + ArrayNo2.length);
            for (int a = 0; a < ArrayNo2.length; a++) {
                ArrayConcat[ArrayNo1.length + a] = ArrayNo2[a];
                //System.out.println(Arrays.toString(ArrayConcat));


            }
            System.out.println(Arrays.toString(ArrayConcat));


        }
    }
    /*Write a java program that will return the min, max and average values in a given array.
For example
GIven the following array [13,20,14,5,2,8] the output should be
Max : 20
Min : 2
Average: 10.3 */

    public static class ex6MinMaxAvg {
        public static void main(String[] args) {
            double sum = 0;
            double avg = 0;

            int[] numbers = {13, 20, 14, 5, 2, 8,};

            if (numbers.length == 0) {
                System.out.println("The array is empty ! Cannot compute minim ");
                return;
            }
            int min = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                    //System.out.println("Found new min value of: " + min + " on pos: " + i);

                }
            }
            System.out.println("min is: " + min);
            int max = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            System.out.println("max is: " + max);
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
                avg = sum / numbers.length;

            }
            System.out.println("Sum is  " + sum);
            System.out.println("Average is  " + avg);
        }

    }

    /*Write a java program to return the index of a target element.
For example:
Given  the following array [13,20,14,5,2,8] and a target element 5 the output should be :
 3 (because 5 is located at index 3 in the array)
*/
    public static class ex7Index {
        public static void main(String[] args) {
            int[] numbers = {13, 20, 14, 5, 2, 8};
            System.out.println(Arrays.toString(numbers));
            int target = 5;
            for (int i = 0; i < numbers.length; i++) {
                if (target == numbers[i]) {
                    System.out.println("Found " + target + " on pos " + i);
                    break;

                }

            }

        }


    }

    /*Write a Java program to find the number of even and odd integers in a given array of integers
For example.
Given the following array [13,20,14,5,2,8] the output should be:
Odd elements count : 2
Even elements count : 4 */
    public static class ex8EvenAndOdd {
        public static void main(String[] args) {
            int[] numbers = {13, 20, 14, 5, 2, 8};
            int even = 0;
            int odd = 0;
            for (int i = 0; i < numbers.length; i++) {
                if ((numbers[i] & 1) == 1) {
                    odd++;
                } else {
                    even++;
                }
                //System.out.println("Odd elements count : " + odd);
                //System.out.println("Even elements count : " + even);
            }
            System.out.println("Odd elements count : " + odd);
            System.out.println("Even elements count : " + even);


        }
    }
    /*Write a program that test if a given String contains another String.
For example
Given the following base String “Hello java world” and the target test String “java” the output should be TRUE */

    public static class ex9TestWord {
        public static void main(String[] args) {
            String phrase1 = " Hello java world";
            String word = "java";
            for (int i = 0; i < phrase1.length(); i++) {
                if (phrase1.contains(word)) {
                    System.out.println(true);
                    break;


                }


            }
        }
    }

    /*Write a program that will count how many times a character appears in a String
For example
Given the string “Hello java world” and the target character ‘a’ the output should be 2
(since ‘a’ appears twice in “Hello java world”) */
    public static class ex10HowManyTimes {
        public static void main(String[] args) {
            String phrase1 = " Hello java world";
            char character = 'a';
            int count = 0;
            for (char a : phrase1.toCharArray()) {



            }


        }

    }
}




