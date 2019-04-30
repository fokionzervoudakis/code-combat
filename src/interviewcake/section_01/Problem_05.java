package interviewcake.section_01;

/**
 {@link interviewcake.section_03.Problem_04}
 */
public class Problem_05 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an integer array
     @param B a second integer array
     @param C a third integer array
     @return true if {@code A} and {@code B} are two halves of {@code C}, else
     false
     */
    boolean isSingleRiffle(int[] A, int[] B, int[] C) {
        int m = A.length, n = B.length;
        if (m + n != C.length) {
            return false;
        }
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (A[i] == C[k]) {
                i++;
            } else if (B[j] == C[k]) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        return true;
    }
}
