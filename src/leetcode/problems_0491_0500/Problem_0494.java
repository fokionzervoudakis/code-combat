package leetcode.problems_0491_0500;

class Problem_0494 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^2)
     <li>space_worst=O(n)
     </ul>

     @param A an array of non-negative integers
     @param n a target sum
     @return the number of ways elements in {@code A} can be added/subtracted to
     equals {@code n}
     */
    int findTargetSumWays(int[] A, int n) {
        return helper(A, 0, n);
    }

    private int helper(int[] A, int i, int n) {
        if (i == A.length) {
            return (n == 0) ? 1 : 0;
        } else {
            return helper(A, i + 1, n - A[i]) + helper(A, i + 1, n + A[i]);
        }
    }
}
