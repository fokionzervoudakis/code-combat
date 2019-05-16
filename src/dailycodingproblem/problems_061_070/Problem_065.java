package dailycodingproblem.problems_061_070;

import java.util.ArrayList;
import java.util.List;

/**
 Problem #65 [Easy] - Amazon
 */
class Problem_065 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(mn)
     <li>space_worst=O(mn)
     </ul>

     @param M an integer matrix
     @return a list of integers in {@code M} ordered in a clockwise spiral
     */
    List<Integer> clockwise(int[][] M) {
        var L = new ArrayList<Integer>();
        if (M.length == 0) {
            return L;
        }
        int m = M.length, n = M[0].length;
        int row = 0, col = 0;
        while (row < m && col < n) {
            for (var i = col; i < n; i++) {
                L.add(M[row][i]);
            }
            row++;
            for (var i = row; i < m; i++) {
                L.add(M[i][n - 1]);
            }
            n--;
            if (row < m) {
                for (var i = n - 1; i >= col; i--) {
                    L.add(M[m - 1][i]);
                }
                m--;
            }
            if (col < n) {
                for (var i = m - 1; i >= row; i--) {
                    L.add(M[i][col]);
                }
                col++;
            }
        }
        return L;
    }
}
