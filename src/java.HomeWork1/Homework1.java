import Exceptions.ArgumentIllegalException;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Homework1 {

    public static void main(String[] args) {

        System.out.println("PB1");
        try {
            HomeWorkUtils.sumFromZeroToNumber(-2);
        } catch (ArgumentIllegalException e) {
            System.out.println("Verific exceptia :");
            e.printStackTrace();
        }
        System.out.println("Problema 1 suma pana la 5 : " + HomeWorkUtils.sumFromZeroToNumber(5));

        System.out.println("PB2");
        try {
            HomeWorkUtils.sumAndAverageFromInterval(-2, -3);
        } catch (ArgumentIllegalException e) {
            e.printStackTrace();
        }
        IntSummaryStatistics result = HomeWorkUtils.sumAndAverageFromInterval(1, 100);
        System.out.println("Suma si media din intervalul [1;100] este : " + result.getSum() + " " + result.getAverage());


        System.out.println("PB3");
        try {
            HomeWorkUtils.averageAndPrintOfFirstFibonacci(-20);
        } catch (ArgumentIllegalException e) {
            e.printStackTrace();
        }
        HomeWorkUtils.averageAndPrintOfFirstFibonacci(20);


        System.out.println("PB4");
        System.out.println(HomeWorkUtils.isEndsOfArrayTheSame(new int[]{1, 2, 3, 4, 5, 1}));
        System.out.println(HomeWorkUtils.isEndsOfArrayTheSame(new int[]{1, 2, 3, 4, 5, 10}));
        try {
            System.out.println(HomeWorkUtils.isEndsOfArrayTheSame(null));
        } catch (ArgumentIllegalException e) {
            e.printStackTrace();
        }


        System.out.println("PB5");
        System.out.println(HomeWorkUtils.isArraysEqual(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}));
        System.out.println(HomeWorkUtils.isArraysEqual(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4}));
        System.out.println(HomeWorkUtils.isArraysEqual(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 3}));
        System.out.println(HomeWorkUtils.isArraysEqual(new int[]{}, new int[]{}));
        try {
            System.out.println(HomeWorkUtils.isArraysEqual(new int[]{}, null));
        } catch (ArgumentIllegalException e) {
            e.printStackTrace();
        }


        System.out.println("PB6");
        System.out.println(Arrays.toString(HomeWorkUtils.concateArrays(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8, 9, 10})));
        System.out.println(Arrays.toString(HomeWorkUtils.concateArrays(new int[]{}, new int[]{5, 6, 7, 8, 9, 10})));


        System.out.println("PB7");
        System.out.println(HomeWorkUtils.summaryOfArray(new int[]{13, 20, 14, 5, 2, 8}));


        System.out.println("PB8");
        System.out.println(HomeWorkUtils.indexOfElement(new int[]{1, 2, 3, 4, 5}, 7));
        System.out.println(HomeWorkUtils.indexOfElement(new int[]{1, 2, 3, 4, 5}, 5));


        System.out.println("PB9");
        HomeWorkUtils.displayOddAndEventCount(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        HomeWorkUtils.displayOddAndEventCount(new int[]{});


        System.out.println("PB10");
        System.out.println(HomeWorkUtils.stringContainsAnotherString("abcd", "e"));
        System.out.println(HomeWorkUtils.stringContainsAnotherString("abcd", "cd"));


        System.out.println("PB11");
        System.out.println(HomeWorkUtils.countOfChar("Ana are mere ananas", 'y'));
        System.out.println(HomeWorkUtils.countOfChar("Ana are mere ananas", 'a'));


        System.out.println("PB12");
        System.out.println(HomeWorkUtils.isStringEndsWith("abcede", "efde"));
        System.out.println(HomeWorkUtils.isStringEndsWith("abcede", "ede"));


        System.out.println("PB13");
        System.out.println(HomeWorkUtils.getStringIndex("abcdgh"));


        System.out.println("PB14");
        System.out.println(HomeWorkUtils.replaceDuplicate("Hello world from rrrrrrr"));

        System.out.println("PB14");
        System.out.println("aabccbaa".equals(new StringBuilder("aabccbaa").reverse().toString()));
        System.out.println("abccbb".equals(new StringBuilder("abccbb").reverse().toString()));
    }


}
