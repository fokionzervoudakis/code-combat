package interviewcake.section_02;

import annotation.NotInPlace;

/**
 {@link interviewcake.section_04.Problem_03}
 */
public class Problem_04 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n+k)
     <li>space_worst=O(n+k)
     </ul>

     @param A an array of integers
     @param k the highest possible integer in {@code A}
     @return an array of the integers in {@code A} sorted in descending order
     */
    @NotInPlace
    int[] sort(int[] A, int k) {
        int[] B = new int[k];
        for (int n : A) { // O(n)
            B[n]++;
        }
        int[] C = new int[A.length];
        int m = 0;
        for (int i = B.length - 1; i >= 0; i--) { // O(k)
            for (int j = 0; j < B[i]; j++) { // O(n)
                C[m++] = i;
            }
        }
        return C;
    }
}
