package dailycodingproblem.problems_031_040;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 Problem #33 [Easy] - Microsoft
 */
class Problem_033 {
    List<Double> median(int[] A) {
        var min = new PriorityQueue<Integer>();
        var max = new PriorityQueue<Integer>((a, b) -> b - a);

        var medians = new ArrayList<Double>();

        for (int n : A) {
            min.add(n);
            if (min.size() > max.size() + 1) {
                max.add(min.remove());
            }
            assert !min.isEmpty();
            if (min.size() == max.size()) {
                medians.add((double) (min.peek() + max.peek()) / 2);
            } else {
                medians.add((double) min.peek());
            }
        }

        return medians;
    }
}
