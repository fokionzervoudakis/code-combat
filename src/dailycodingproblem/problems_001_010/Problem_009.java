package dailycodingproblem.problems_001_010;

import annotation.dp.Memoization;

import java.util.HashMap;
import java.util.Map;

/**
 Problem #9 [Hard] - Airbnb
 <p>{@link leetcode.problems_0191_0200.Problem_0198}
 */
public class Problem_009 {
    class Rec {
        int sum(int[] A) {
            return helper(A, 0);
        }

        private int helper(int[] A, int i) {
            if (i == A.length) {
                return 0;
            } else if (i == A.length - 1) {
                return A[i];
            } else {
                var a = helper(A, i + 1);
                var b = helper(A, i + 2) + A[i];
                return Math.max(a, b);
            }
        }
    }

    class Mem {
        Map<Integer, Integer> M = new HashMap<>();

        @Memoization
        int sum(int[] A) {
            return helper(A, 0);
        }

        private int helper(int[] A, int i) {
            if (M.containsKey(i)) {
                return M.get(i);
            } else {
                int n;
                if (i == A.length) {
                    n = 0;
                } else if (i == A.length - 1) {
                    n = A[i];
                } else {
                    var a = helper(A, i + 1);
                    var b = helper(A, i + 2) + A[i];
                    n = Math.max(a, b);
                }
                M.put(i, n);
                return n;
            }
        }
    }

    class Tab {
        // TODO
    }
}
