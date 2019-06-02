package leetcode.problems_0281_0290;

import annotation.InPlace;
import annotation.OnePass;

class Problem_0283 {
    /**
     Moves all zeros to the end of {@code A} while maintaining the relative order
     of non-zero elements.
     <p>Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of integers
     */
    @InPlace
    @OnePass
    void moveZeroes(int[] A) {
        int i = 0;
        for (int j = 0; j < A.length; j++) { // O(n)
            if (A[j] != 0) {
                A[i++] = A[j];
            }
        }
        while (i < A.length) { // O(n)
            A[i++] = 0;
        }
    }
}
