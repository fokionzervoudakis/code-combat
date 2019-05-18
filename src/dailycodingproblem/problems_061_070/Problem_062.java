package dailycodingproblem.problems_061_070;

import java.util.HashMap;
import java.util.Map;

/**
 Problem #62 [Medium] - Facebook
 <p>{@link leetcode.problems_0061_0070.Problem_0062}
 */
public class Problem_062 {
    class Rec {
        /**
         Asymptotic analysis:
         <ul>
         <li>time_worst=O(2^n)
         <li>space_worst=O(n)
         </ul>

         @param m the number of rows in a matrix
         @param n the number of columns in a matrix
         @return the number of paths (moving left to right and top to bottom)
         from the top-left corner to the bottom-right corner of a matrix with
         {@code r} rows and {@code c} columns
         */
        int countPaths(int m, int n) {
            return helper(m, n, 0, 0);
        }

        private int helper(int m, int n, int i, int j) {
            if (i == m - 1 || j == n - 1) {
                return 1;
            } else {
                int a = (i < m - 1) ? helper(m, n, i + 1, j) : 0;
                int b = (j < n - 1) ? helper(m, n, i, j + 1) : 0;
                return a + b;
            }
        }
    }

    class Mem {
        Map<String, Integer> M = new HashMap<>();

        /**
         Asymptotic analysis:
         <ul>
         <li>time_worst=O(mn)
         <li>space_worst=O(mn)
         </ul>

         @param m the number of rows in a matrix
         @param n the number of columns in a matrix
         @return the number of paths (moving left to right and top to bottom)
         from the top-left corner to the bottom-right corner of a matrix with
         {@code r} rows and {@code c} columns
         */
        int countPaths(int m, int n) {
            return helper(m, n, 0, 0);
        }

        private int helper(int m, int n, int i, int j) {
            String key = i + ":" + j;
            if (M.containsKey(key)) {
                return M.get(key);
            } else {
                int count;
                if (i == m - 1 || j == n - 1) {
                    count = 1;
                } else {
                    int a = (i < m - 1) ? helper(m, n, i + 1, j) : 0;
                    int b = (j < n - 1) ? helper(m, n, i, j + 1) : 0;
                    count = a + b;
                }
                M.put(key, count);
                return count;
            }
        }
    }

    class Tab {
        /**
         Asymptotic analysis:
         <ul>
         <li>time_worst=O(mn)
         <li>space_worst=O(mn)
         </ul>

         @param m the number of rows in a matrix
         @param n the number of columns in a matrix
         @return the number of paths (moving left to right and top to bottom)
         from the top-left corner to the bottom-right corner of a matrix with
         {@code r} rows and {@code c} columns
         */
        int countPaths(int m, int n) {
            int[][] M = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || j == 0) {
                        M[i][j] = 1;
                    } else {
                        M[i][j] = M[i][j - 1] + M[i - 1][j];
                    }
                }
            }
            return M[m - 1][n - 1];
        }
    }
}
