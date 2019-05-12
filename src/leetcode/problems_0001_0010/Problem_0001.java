package leetcode.problems_0001_0010;

import java.util.HashMap;
import java.util.Map;

/**
 {@link leetcode.problems_0011_0020.Problem_0015}
 <p>{@link leetcode.problems_0011_0020.Problem_0018}
 */
public class Problem_0001 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param A an array of integers
     @param k a target sum
     @return an array of two integers from {@code A} that sum to {@code k}, or
     null if no integers sum to {@code k}
     */
    int[] twoSum(int[] A, int k) {
        Map<Integer, Integer> M = new HashMap<>();
        for (int i = 0; i < A.length; i++) { // O(n)
            int key = k - A[i];
            int j;
            if (M.containsKey(key) && (j = M.get(key)) != i) {
                return new int[] { i, j };
            } else {
                M.put(A[i], i);
            }
        }
        return null;
    }
}
