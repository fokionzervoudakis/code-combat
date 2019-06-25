package dailycodingproblem.problems_101_110;

/**
 Problem #106 [Medium] - Pinterest
 <p>{@link leetcode.problems_0051_0060.Problem_0055}
 */
public class Problem_106 {
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
    boolean canReach(int[] A) {
        var i = 0;
        while (i < A.length) { // O(n)
            if (A[i] == 0) {
                break;
            } else {
                i += A[i];
            }
        }
        return i == A.length - 1;
    }
}
