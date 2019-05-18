package interviewcake.section_01;

import annotation.NotInPlace;

/**
 {@link leetcode.problems_0081_0090.Problem_0088}
 */
public class Problem_04 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param A an integer array
     @param B another integer array
     @return an integer array with elements from {@code A} and {@code B} in
     descending order
     */
    @NotInPlace
    int[] merge(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int[] C = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (j < m && k < n) { // O(m+n)
            C[i++] = (A[j] < B[k]) ? A[j++] : B[k++];
        }
        while (j < m) { // O(m)
            C[i++] = A[j++];
        }
        while (k < n) { // O(n)
            C[i++] = B[k++];
        }
        return C;
    }
}
