package src.mndragossh.week2;

import java.util.ArrayList;

public class Fibonacci {
    public static String fibonacci(int target) {
        int start = 0, next = 1;
        ArrayList<Integer> arrayOfNums = new ArrayList<>();
        arrayOfNums.add(next);
        int sumOFNums = 0;
        int i = 2;
        while (i <= target) {
            int sum = start + next;
            start = next;
            next = sum;
            arrayOfNums.add(sum);
            i++;
        }
        sumOFNums = arrayOfNums.stream().mapToInt(a -> a).sum();
        return String.format("Sum is %d, Average is %.2f", sumOFNums, (float) sumOFNums / arrayOfNums.toArray().length);
    }
}
