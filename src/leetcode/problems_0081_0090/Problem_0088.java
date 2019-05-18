package leetcode.problems_0081_0090;

import annotation.InPlace;

/**
 {@link interviewcake.section_01.Problem_04}
 */
public class Problem_0088 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an integer array
     @param m the number of initialized elements in {@code A}
     @param B another integer array
     @param n the number of initialized elements in {@code B}
     */
    @InPlace
    void merge(int[] A, int m, int[] B, int n) {
        int i = A.length - 1, j = m - 1, k = n - 1;
        while (j >= 0 && k >= 0) { // O(m+n)
            A[i--] = (A[j] > B[k]) ? A[j--] : B[k--];
        }
        while (j >= 0) { // O(m)
            A[i--] = A[j--];
        }
        while (k >= 0) { // O(n)
            A[i--] = B[k--];
        }
    }
}
