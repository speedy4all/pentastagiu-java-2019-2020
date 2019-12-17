package src.mndragossh.week2.SumAndAverage;

import java.util.stream.IntStream;

public class Range {
    public int[] getRange(int target) {
        if (target < 0) {
            return new int[0];
        }
        int[] temp = new int[target + 1];
        for (int i = 0; i <= target; i++) {
            temp[i] = i;
        }
        return temp;
    }

    public int[] getRangeFromTo(int start, int end) {
        if (start > end || ((start == 0 || start < 0) && (end == 0 || end < 0))) {
            return new int[0];
        }
        int[] temp = new int[end - start + 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = start;
            start++;
        }
        return temp;
    }

    // with IntStream Lib
    public int[] getRangeWithIntStream(int target) {
        return IntStream.range(0, target + 1).toArray();
    }

    public int[] getRangeWithIntStream(int start, int end) {
        return IntStream.range(start, end + 1).toArray();
    }

}
