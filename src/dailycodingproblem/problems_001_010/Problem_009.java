package dailycodingproblem.problems_001_010;

import annotation.dp.Memoization;
import annotation.dp.Tabulation;

import java.util.HashMap;
import java.util.Map;

/**
 Problem #9 [Hard] - Airbnb
 <p>{@link leetcode.problems_0191_0200.Problem_0198}
 */
public class Problem_009 {
    class Rec {
        /**
         Asymptotic analysis:
         <ul>
         <li>time_worst=O(2^n)
         <li>space_worst=O(n)
         </ul>

         @param A an array of non-negative integers
         @return the max sum from non-adjacent integers in {@code A}
         */
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
        /**
         Asymptotic analysis:
         <ul>
         <li>time_worst=O(n)
         <li>space_worst=O(n)
         </ul>

         @param A an array of non-negative integers
         @return the max sum from non-adjacent integers in {@code A}
         */
        @Tabulation
        int sum(int[] A) {
            var n = A.length;
            var B = new int[n + 1];
            for (var i = 1; i <= n; i++) {
                int sum;
                if (i == 1) {
                    sum = A[i - 1];
                } else {
                    var a = B[i - 1];
                    var b = B[i - 2] + A[i - 1];
                    sum = Math.max(a, b);
                }
                B[i] = sum;
            }
            return B[n];
        }
    }
}
