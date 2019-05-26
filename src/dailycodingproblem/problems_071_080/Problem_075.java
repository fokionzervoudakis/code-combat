package dailycodingproblem.problems_071_080;

import java.util.Arrays;

/**
 Problem #75 [Hard] - Microsoft
 <p>https://www.dailycodingproblem.com/blog/longest-increasing-subsequence/
 <p>{@link leetcode.problems_0300_0310.Problem_0300}
 */
public class Problem_075 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n log n)
     <li>space_worst=O(n)
     </ul>

     @param A an array of integers
     @return the length of the longest increasing sub-sequence in {@code A}
     */
    int lis(int[] A) {
        int[] B = new int[A.length];
        int len = 0;
        for (int n : A) {
            int i = Arrays.binarySearch(B, 0, len, n);
            if (i < 0) {
                i = -(i + 1);
            }
            B[i] = n;
            if (i == len) {
                len++;
            }
        }
        return len;
    }
}
