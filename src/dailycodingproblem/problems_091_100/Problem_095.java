package dailycodingproblem.problems_091_100;

import annotation.InPlace;

/**
 Problem #95 [Hard] - Palantir
 <p>{@link leetcode.problems_0031_0040.Problem_0031}
 */
public class Problem_095 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of integers
     */
    @InPlace
    void nextPermutation(int[] A) {
        int n = A.length, i = n - 2;
        while (i >= 0) { // O(n)
            if (A[i] < A[i + 1]) {
                break;
            }
            i--;
        }
        if (i < 0) {
            reverse(A, 0, n - 1);
        } else {
            int j = n - 1;
            while (j > i) { // O(n)
                if (A[j] > A[i]) {
                    break;
                }
                j--;
            }
            swap(A, i, j);
            reverse(A, i + 1, n - 1);
        }
    }

    private void reverse(int[] A, int i, int j) {
        while (i < j) { // O(n/2)
            swap(A, i++, j--);
        }
    }

    private void swap(int[] A, int i, int j) {
        int n = A[i];
        A[i] = A[j];
        A[j] = n;
    }
}
