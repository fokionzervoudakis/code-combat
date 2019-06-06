package leetcode.problems_0231_0240;

import annotation.pattern.Greedy;

/**
 {@link dailycodingproblem.problems_001_010.Problem_002}
 <p>{@link interviewcake.section_03.Problem_03}
 */
public class Problem_0238 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param A an array of integers
     @return an array where each element with index {@code i} is the product of
     all elements in {@code A} except {@code A[i]}
     */
    @Greedy
    int[] productExceptSelf(int[] A) {
        int n = A.length;
        int[] L = new int[n], R = new int[n];
        L[0] = 1;
        for (int i = 1; i < n; i++) { // O(n)
            L[i] = L[i - 1] * A[i - 1];
        }
        R[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) { // O(n)
            R[i] = R[i + 1] * A[i + 1];
        }
        int[] B = new int[n];
        for (int i = 0; i < n; i++) { // O(n)
            B[i] = L[i] * R[i];
        }
        return B;
    }
}
