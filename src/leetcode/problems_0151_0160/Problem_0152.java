package leetcode.problems_0151_0160;

/**
 {@link dailycodingproblem.problems_041_050.Problem_049}
 */
public class Problem_0152 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of integers
     @return the max product of any contiguous sub-array of {@code A}
     */
    int maxProduct(int[] A) {
        int lMin = A[0], lMax = lMin, gMax = lMax;
        for (int i = 1; i < A.length; i++) { // O(n)
            int a = A[i] * lMin;
            int b = A[i] * lMax;
            lMin = min(A[i], a, b);
            lMax = max(A[i], a, b);
            gMax = max(lMin, lMax, gMax);
        }
        return gMax;
    }

    private int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    private int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
