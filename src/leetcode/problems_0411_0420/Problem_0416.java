package leetcode.problems_0411_0420;

import java.util.HashMap;
import java.util.Map;

class Problem_0416 {
    Map<String, Boolean> M = new HashMap<>();

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param A an array of positive integers
     @return true if the elements in {@code A} can be partitioned into two
     subsets with equal sums, else false
     */
    boolean canPartition(int[] A) {
        int sum = 0;
        for (int n : A) {
            sum += n;
        }
        if (sum % 2 != 0) {
            return false;
        }
        return helper(A, 0, sum / 2);
    }

    private boolean helper(int[] A, int i, int n) {
        String key = i + ":" + n;
        if (M.containsKey(key)) {
            return M.get(key);
        } else {
            boolean b;
            if (i == A.length) {
                b = false;
            } else {
                int m = n - A[i];
                if (m == 0) {
                    b = true;
                } else if (m < 0) {
                    b = false;
                } else {
                    b = helper(A, i + 1, m) || helper(A, i + 1, n);
                }
            }
            M.put(key, b);
            return b;
        }
    }
}
