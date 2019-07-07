package dailycodingproblem.problems_111_120;

import annotation.InPlace;

import java.util.Arrays;

/**
 Problem #118 [Easy] - Google
 */
class Problem_118 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n log n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of integers
     */
    @InPlace
    void squareSort(int[] A) {
        for (int i = 0; i < A.length; i++) { // O(n)
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A); // O(n log n)
    }
}
