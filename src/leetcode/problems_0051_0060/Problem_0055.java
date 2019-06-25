package leetcode.problems_0051_0060;

/**
 {@link dailycodingproblem.problems_101_110.Problem_106}
 */
public class Problem_0055 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of non-negative integers that represent max jump lengths
     at that position
     @return true of the last index can be reached from the first index, else
     false
     */
    boolean canJump(int[] A) {
        int n = A.length - 1;
        for (int i = n; i >= 0; i--) { // O(n)
            if (A[i] >= n - i) {
                n = i;
            }
        }
        return n == 0;
    }
}
