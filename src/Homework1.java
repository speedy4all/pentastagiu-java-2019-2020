public class Homework1 {

    public static void main(String[] args) {

                // Problem 1

                int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum = sum + myArray[i];
                }
                System.out.println("Total sum are : " + sum);


                // Problem 2

                //sum for numbers between 123 and 321
                int min = 123, max = 321, sum1 = 0;
                for (int i = min; i <= max; i++) {
                    sum1 += i;
                }
                System.out.println("Sum for numbers between " + min + " and " + max + " is: " + sum1);
                //average for numbers between 123 and 321
                float average = sum1/198;
                System.out.println("Average for numbers between " + min + " and " + max + " is: " + average);


                // Problem 3
                // first 13 Fibonacci numbers
                int f = 0;
                int g = 1;

                for (int i = 1; i <= 13; i++) {
                    System.out.print(f + " ");
                    f = f + g;
                    g = f - g;
                }
                System.out.println();
                // sum of 13 Fibonacci numbers
                int sum2 = f+g;
                System.out.println("Sum of 13 Fibonacci numbers is: " + sum2);

                // average of 13 Fibonacci numbers
                float average1 = sum2/13;
                System.out.println("Average of 13 Fibonacci numbers is: " + average1);



    }


}
