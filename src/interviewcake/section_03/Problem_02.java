package interviewcake.section_03;

import annotation.pattern.Greedy;

class Problem_02 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of integers
     @return the max product of three integers in {@code A}
     */
    @Greedy
    int highestProductOf3(int[] A) {
        if (A.length < 3) {
            throw new RuntimeException();
        }
        int min1 = min(A, -1); // O(n)
        int min2 = min(A, min1); // O(n)
        int max1 = max(A, -1); // O(n)
        int max2 = max(A, max1); // O(n)
        int prod = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) { // O(n)
            if (i != min1 && i != min2) {
                prod = Math.max(prod, A[min1] * A[min2] * A[i]);
            }
            if (i != max1 && i != max2) {
                prod = Math.max(prod, A[max1] * A[max2] * A[i]);
            }
        }
        return prod;
    }

    private int min(int[] A, int i) {
        int min = -1;
        for (int j = 0; j < A.length; j++) { // O(n)
            if (i != j) {
                min = (min >= 0 && A[min] < A[j]) ? min : j;
            }
        }
        return min;
    }

    private int max(int[] A, int i) {
        int max = -1;
        for (int j = 0; j < A.length; j++) { // O(n)
            if (i != j) {
                max = (max >= 0 && A[max] > A[j]) ? max : j;
            }
        }
        return max;
    }
}
