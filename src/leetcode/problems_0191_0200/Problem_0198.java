package leetcode.problems_0191_0200;

import annotation.dp.Memoization;

import java.util.HashMap;
import java.util.Map;

/**
 {@link dailycodingproblem.problems_001_010.Problem_009}
 */
public class Problem_0198 {
    Map<Integer, Integer> M = new HashMap<>();

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param A an array of non-negative integers
     @return the max sum from non-adjacent integers in {@code A}
     */
    @Memoization
    int rob(int[] A) {
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
                int a = helper(A, i + 1);
                int b = helper(A, i + 2) + A[i];
                n = Math.max(a, b);
            }
            M.put(i, n);
            return n;
        }
    }
}
