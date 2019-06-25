package leetcode.problems_0321_0330;

/**
 {@link interviewcake.section_06.Problem_04}
 */
public class Problem_0322 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(mn)
     <li>space_worst=O(n)
     </ul>

     @param coins coins of different denominations represented as an array of
     integers
     @param n a target sum
     @return the min number of coins in {@code A} needed to derive {@code n}, or
     -1 if {@code n} cannot be derived
     */
    int coinChange(int[] coins, int n) {
        int[] B = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            B[i] = n + 1;
        }
        for (int c : coins) { // O(m)
            for (int i = c; i <= n; i++) { // O(n)
                B[i] = Math.min(B[i], B[i - c] + 1);
            }
        }
        return B[n] > n ? -1 : B[n];
    }
}
