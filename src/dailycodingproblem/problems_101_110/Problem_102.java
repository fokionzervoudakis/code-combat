package dailycodingproblem.problems_101_110;

import java.util.Deque;
import java.util.LinkedList;

/**
 Problem #102 [Medium] - Lyft
 <p>{@link leetcode.problems_0551_0560.Problem_0560}
 */
public class Problem_102 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param A an integer array
     @param k a target sum
     @return the contiguous integers in {@code A} that sum to {@code k}
     */
    Deque<Integer> subArraySum(int[] A, int k) {
        var n = 0;
        var D = new LinkedList<Integer>();
        int i = 0;
        while (i < A.length) { // O(n)
            if (n < k) {
                n += A[i];
                D.addLast(A[i]);
                i++;
            } else if (n > k) {
                n -= D.removeFirst();
            } else {
                break;
            }
        }
        return D;
    }
}
