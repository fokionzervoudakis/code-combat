package leetcode.problems_0071_0080;

import annotation.InPlace;
import annotation.OnePass;

class Problem_0075 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array with {@code n} integers with values 0, 1 and 2
     */
    // TODO test
    @InPlace
    @OnePass
    void sortColors(int[] A) {
        int n0 = 0, n1 = 0, n2 = 0;
        for (int i = 0; i < A.length; i++) { // O(n)
            if (A[i] == 0) {
                A[n2++] = 2;
                A[n1++] = 1;
                A[n0++] = 0;
            } else if (A[i] == 1) {
                A[n2++] = 2;
                A[n1++] = 1;
            } else if (A[i] == 2) {
                A[n2++] = 2;
            }
        }
    }
}
