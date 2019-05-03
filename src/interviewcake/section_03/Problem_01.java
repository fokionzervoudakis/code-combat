package interviewcake.section_03;

import annotation.pattern.BruteForce;
import annotation.pattern.Greedy;

/**
 {@link dailycodingproblem.problems_041_050.Problem_047}
 */
public class Problem_01 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^2)
     <li>space_worst=O(1)
     </ul>

     @param A an array of stock prices
     @return the max profit made from one purchase and one sale of one share with
     prices in {@code A}
     */
    @BruteForce
    int getMaxProfit1(int[] A) {
        int n = A.length;
        if (n < 2) {
            throw new RuntimeException();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) { // O(n)
            for (int j = i + 1; j < n; j++) { // O(n)
                max = Math.max(max, A[j] - A[i]);
            }
        }
        return max;
    }

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of stock prices
     @return the max profit made from one purchase and one sale of one share with
     prices in {@code A}
     */
    @Greedy
    int getMaxProfit2(int[] A) {
        int n = A.length;
        if (n < 2) {
            throw new RuntimeException();
        }
        int minPrice = A[0], maxProfit = A[1] - A[0];
        for (int i = 1; i < n; i++) { // O(n)
            maxProfit = Math.max(maxProfit, A[i] - minPrice);
            minPrice = Math.min(minPrice, A[i]);
        }
        return maxProfit;
    }
}
