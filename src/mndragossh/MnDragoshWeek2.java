package src.mndragossh;

import src.mndragossh.week2.Arrays.ArraysHomeWork;
import src.mndragossh.week2.Fibonacci;
import src.mndragossh.week2.Strings.StringHomeWork;
import src.mndragossh.week2.SumAndAverage.SumAndAverage;

import java.util.Arrays;

public class MnDragoshWeek2 {
    public static void main(String[] args) {
        // write your code here
        SumAndAverage smAndAvg = new SumAndAverage();

        // input number key
        System.out.println("Sum of numbers");
//        System.out.println(smAndAvg.sumOfNumbers(5));

        System.out.println("Sum and average");
//        System.out.println(smAndAvg.sumAndAverageOfRange(1, 100));


        System.out.println(ArraysHomeWork.checkEqualFandL(new int[]{1, 0, 2, 3, 4, 1}));

        System.out.println(ArraysHomeWork.checkArraysEqual(new int[]{1, 3, 2, 3, 4, 1}, new int[]{1, 0, 2, 3, 4, 1}));

        System.out.println(Arrays.toString(
                ArraysHomeWork.concatArrays(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8, 9, 10}))
        );

        System.out.println(ArraysHomeWork.minMaxAverage(new int[]{13, 20, 14, 5, 2, 8}));

        System.out.println(ArraysHomeWork.targetIdx(new int[]{13, 20, 14, 5, 2, 8}, 5));

        System.out.println(ArraysHomeWork.oddAndEven(new int[]{13, 20, 14, 5, 2, 8}));

        System.out.println(StringHomeWork.isInString("Hello java world", "java"));

        System.out.println(StringHomeWork.charInString("Hello java world", 'a'));

        System.out.println(StringHomeWork.endWithString("Hello java world", "orld"));

        System.out.println(StringHomeWork.encodingAlpha("abcd"));

        System.out.println(StringHomeWork.insertCharacter("Hello Java"));

        System.out.println(StringHomeWork.palindromeStr("baabccbaabaa"));

        System.out.println(Fibonacci.fibonacci(20));

    }
}
