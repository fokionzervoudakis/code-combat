package interviewcake.section_10;

import java.util.HashMap;
import java.util.Map;

class Problem_02 {
    /**
     Asymptotic analysis:
     <li>space_worst=O(n)
     <li>insert_worst=O(1)
     <li>getMin_worst=O(1)
     <li>getMax_worst=O(1)
     <li>getMean_worst=O(1)
     <li>getMode_worst=O(1)
     */
    class TempTracker {
        private int min = Integer.MAX_VALUE;
        private int max = Integer.MIN_VALUE;

        private int sum = 0;
        private int len = 0;

        private Map<Integer, Integer> M = new HashMap<>();

        private int mode = 0;

        void insert(int n) {
            min = Math.min(min, n);
            max = Math.max(max, n);
            sum += n;
            len++;
            M.put(n, M.containsKey(n) ? (M.get(n) + 1) : 1);
            if (!M.containsKey(mode) || M.get(n) > M.get(mode)) {
                mode = n;
            }
        }

        int getMin() {
            return min;
        }

        int getMax() {
            return max;
        }

        double getMean() {
            return (double) sum / len;
        }

        int getMode() {
            return mode;
        }
    }
}
