package dailycodingproblem.problems_141_150;

import annotation.InPlace;

/**
 Problem #147 [Hard]
 */
class Problem_147 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^2)
     <li>space_worst=O(1)
     </ul>
     */
    @InPlace
    void sort(int[] A) {
        boolean end = false;
        while (!end) {
            end = true;
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] > A[i + 1]) {
                    reverse(A, i, i + 1);
                    end = false;
                }
            }
        }
    }

    private void reverse(int[] A, int i, int j) {
        while (i < j) {
            swap(A, i++, j--);
        }
    }

    private void swap(int[] A, int i, int j) {
        int n = A[i];
        A[i] = A[j];
        A[j] = n;
    }
}
