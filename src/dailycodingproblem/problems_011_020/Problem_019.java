package dailycodingproblem.problems_011_020;

/**
 Problem #19 [Medium] - Facebook
 */
class Problem_019 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(k^n)
     <li>space_worst=O(n)
     </ul>

     @param M an N by K matrix where the nth row and kth column represents the
     cost to build the nth house with kth color
     @return the minimum cost of building N houses with K colors while ensuring
     that neighboring houses do not use the same color
     */
    int min(int[][] M) {
        return helper(M, 0, 0);
    }

    private int helper(int[][] M, int i, int j) {
        if (i == M.length) {
            return 0;
        } else {
            int min = Integer.MAX_VALUE;
            for (int k = 0; k < M[i].length; k++) { // O(k)
                if (i == 0 || k != j) {
                    min = Math.min(min, helper(M, i + 1, k) + M[i][k]);
                }
            }
            return min;
        }
    }
}
