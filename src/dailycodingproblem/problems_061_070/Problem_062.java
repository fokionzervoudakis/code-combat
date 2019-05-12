package dailycodingproblem.problems_061_070;

/**
 Problem #62 [Medium] - Facebook
 */
class Problem_062 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(mn)
     <li>space_worst=O(n)
     </ul>

     @param r the number of rows in a matrix
     @param c the number of columns in a matrix
     @return the number of paths (moving left to right and top to bottom) from
     the top-left corner to the bottom-right corner of a matrix with {@code r}
     rows and {@code c} columns
     */
    int countWays(int r, int c) {
        return helper(r, r, 0, 0);
    }

    private int helper(int r, int c, int i, int j) {
        if (i == r - 1 || j == c - 1) {
            return 1;
        } else {
            int a = (i < r - 1) ? helper(r, c, i + 1, j) : 0;
            int b = (j < c - 1) ? helper(r, c, i, j + 1) : 0;
            return a + b;
        }
    }
}
