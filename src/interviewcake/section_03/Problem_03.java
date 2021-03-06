package interviewcake.section_03;

import annotation.pattern.Greedy;

/**
 {@link dailycodingproblem.problems_001_010.Problem_002}
 <p>{@link leetcode.problems_0231_0240.Problem_0238}
 */
public class Problem_03 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param A an array of numbers
     @return an array where each element at index {@code i} of that array is the
     product of every number in {@code A} except the number at index {@code i}
     */
    @Greedy
    int[] products(int[] A) {
        int n = A.length;

        if (n < 2) {
            throw new RuntimeException();
        }

        var B = new int[n];
        B[0] = 1;

        // Scan from left to right...
        for (var i = 1; i < n; i++) { // O(n)
            B[i] = A[i - 1] * B[i - 1];
        }

        // and from right to left.
        var prod = 1;
        for (var i = n - 1; i >= 0; i--) { // O(n)
            B[i] *= prod;
            prod *= A[i];
        }

        return B;
    }
}
