package dailycodingproblem.problems_041_050;

import java.util.Arrays;

/**
 Problem #44 [Medium] - Google
 */
class Problem_044 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n log n)
     <li>space_worst=O(n)
     </ul>

     @param A the target array
     @return the number of inversions in {@code A} (two elements {@code A[i]} and
     {@code A[j]} form an inversion if {@code A[i] > A[j]} but {@code i < j))
     */
    int invCount(int[] A) {
        var n = A.length;
        if (n < 2) {
            return 0;
        }
        var mid = n / 2;
        var B = Arrays.copyOfRange(A, 0, mid);
        var C = Arrays.copyOfRange(A, mid, n);
        return invCount(B) + invCount(C) + merge(A, B, C);
    }

    private int merge(int[] A, int[] B, int[] C) {
        int m = B.length, n = C.length;
        int i = 0, j = 0, k = 0;
        var inv = 0;
        while (j < m && k < n) {
            if (B[j] <= C[k]) {
                A[i++] = B[j++];
            } else {
                A[i++] = C[k++];
                inv += m - j;
            }
        }
        while (j < m) {
            A[i++] = B[j++];
        }
        while (k < n) {
            A[i++] = C[k++];
        }
        return inv;
    }
}
