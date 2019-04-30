package interviewcake.section_01;

import annotation.NotInPlace;

class Problem_04 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param A a character array
     */
    @NotInPlace
    int[] merge(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int[] C = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (j < m && k < n) {
            C[i++] = (A[j] < B[k]) ? A[j++] : B[k++];
        }
        while (j < m) {
            C[i++] = A[j++];
        }
        while (k < n) {
            C[i++] = B[k++];
        }
        return C;
    }
}
