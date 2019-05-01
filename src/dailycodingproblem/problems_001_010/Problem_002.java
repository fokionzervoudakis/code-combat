package dailycodingproblem.problems_001_010;

import annotation.Pattern;

/**
 Problem #2 [Hard] - Uber
 <p>{@link interviewcake.section_03.Problem_03}
 */
public class Problem_002 {
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
    @Pattern(Pattern.Type.GREEDY)
    int[] products(int[] A) {
        var B = new int[A.length];
        B[0] = 1;

        // Scan from left to right...
        for (var i = 1; i < A.length; i++) { // O(n)
            B[i] = A[i - 1] * B[i - 1];
        }

        // and from right to left.
        var prod = 1;
        for (var i = A.length - 1; i >= 0; i--) { // O(n)
            B[i] *= prod;
            prod *= A[i];
        }

        return B;
    }
}
