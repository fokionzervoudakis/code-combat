package dailycodingproblem.problems_051_060;

import annotation.InPlace;

import java.util.Arrays;

/**
 Problem #60 [Medium] - Facebook
 */
class Problem_060 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n log n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of integers
     @return true if {@code A} can be partitioned into two arrays with equivalent
     sums, else false
     */
    @InPlace
    boolean canSplit(int[] A) {
        if (A.length < 2) {
            return false;
        }
        var gSum = 0;
        for (int n : A) { // O(n)
            gSum += n;
        }
        if (gSum % 2 == 0) {
            Arrays.sort(A); // O(n log n)
            var lSum = 0;
            for (int n : A) { // O(n)
                if ((lSum += n) == gSum / 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
