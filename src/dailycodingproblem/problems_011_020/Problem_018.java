package dailycodingproblem.problems_011_020;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 Problem #18 [Hard] - Google
 */
class Problem_018 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_avg=O(n) with uniformly distributed data
     <li>time_worst=O(nk) with pathologically distributed data
     <li>space_worst=O(k)
     </ul>

     @param A an array of integers
     @param k a number where where {@code 1 <= k <= A.length}
     @return the maximum values of each sub-array of length {@code k}
     */
    List<Integer> slidingMax(int[] A, int k) {
        var L = new ArrayList<Integer>();
        var Q = new LinkedList<Integer>();
        for (var i = 0; i < A.length; i++) { // O(n)
            // Remove the element that is outside the current window.
            if ((!Q.isEmpty()) && Q.peekFirst() <= i - k) {
                Q.removeFirst(); // O(1)
            }
            // Remove elements smaller than the element currently being added.
            while (!Q.isEmpty() && A[i] >= A[Q.peekLast()]) { // O(k)
                Q.removeLast(); // O(1)
            }
            // Add the current element to the back of the queue.
            Q.addLast(i); // O(1)
            if (i >= k - 1) {
                // The max element of the last window is at the front of the queue.
                L.add(A[Q.getFirst()]); // O(1)
            }
        }
        return L;
    }
}
