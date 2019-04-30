package dailycodingproblem.problems_011_020;

import java.util.ArrayList;
import java.util.List;

/**
 Problem #12 [Hard] - Amazon
 */
class Problem_012 {
    List<List<Integer>> getStepCombos(int steps, int[] stepSizes) {
        var L1 = new ArrayList<List<Integer>>();
        if (steps < min(stepSizes)) {
            return L1;
        } else {
            for (var stepSize : stepSizes) {
                if (steps == stepSize) {
                    L1.add(new ArrayList<>() {{
                        add(stepSize);
                    }});
                } else if (steps > stepSize) {
                    for (var L2 : getStepCombos(steps - stepSize, stepSizes)) {
                        L2.add(stepSize);
                        L1.add(L2);
                    }
                }
            }
        }
        return L1;
    }

    private int min(int[] A) {
        var min = Integer.MAX_VALUE;
        for (var n : A) {
            min = Math.min(min, n);
        }
        return min;
    }
}
