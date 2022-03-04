package src.mndragossh.week2.SumAndAverage;

import java.util.HashMap;

public class SumAndAverage {
    Range range;

    public int sumOfNumbers(int target) {
        int sum = 0;
        for (int num : new Range().getRange(target)
        ) {
            sum += num;
        }
        return sum;
    }

    public HashMap<String, String> sumAndAverageOfRange(int start, int end) {
        HashMap<String, String> result = new HashMap<>();
        var arrayOfNumbers = new Range().getRangeFromTo(start, end);
        int sum = 0;
        float average = 0;
        for (int num : arrayOfNumbers
        ) {
            sum += num;
        }
        average = (float) sum / arrayOfNumbers.length;
        result.put("sum", Integer.toString(sum));
        result.put("average", Float.toString(average));

        return result;
    }
}
