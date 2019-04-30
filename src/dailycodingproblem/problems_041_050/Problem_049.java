package dailycodingproblem.problems_041_050;

/**
 Problem #49 [Medium] - Amazon
 */
class Problem_049 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of integers
     @return the max sum of any contiguous sub-array of {@code A}
     */
    int maxSum(int[] A) {
        int lMax = A[0], gMax = lMax;
        for (var i = 1; i < A.length; i++) { // O(n)
            lMax = Math.max(A[i], A[i] + lMax);
            gMax = Math.max(gMax, lMax);
        }
        return (gMax > 0) ? gMax : 0;
    }
}
