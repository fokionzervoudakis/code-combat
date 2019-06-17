package leetcode.problems_0071_0080;

import annotation.pattern.Backtracking;

import java.util.HashSet;
import java.util.Set;

/**
 <p>{@link dailycodingproblem.problems_091_100.Problem_098}
 */
public class Problem_0079 {
    private Set<String> visited;

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(4^n)
     <li>space_worst=O(n)
     </ul>

     @param M a two dimensional char array
     @param str a string
     @return true if {@code str} can be constructed from letters of horizontally
     or vertically neighboring cells in {@code M}, else false
     */
    @Backtracking
    boolean exist(char[][] M, String str) {
        for (int i = 0; i < M.length; i++) { // O(m)
            for (int j = 0; j < M[i].length; j++) { // O(n)
                visited = new HashSet<>();
                if (exist(M, str, i, j)) { // O(4^n)
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exist(char[][] M, String str, int i, int j) {
        String key = i + ":" + j;
        if (visited.contains(key)) {
            return false;
        }
        if (str.isEmpty()) {
            return true;
        } else if (i < 0 || i > M.length - 1 || j < 0 || j > M[i].length - 1) {
            return false;
        } else if (M[i][j] != str.charAt(0)) {
            return false;
        } else {
            visited.add(key);
            str = str.substring(1);
            if (exist(M, str, i - 1, j)
                    || exist(M, str, i + 1, j)
                    || exist(M, str, i, j - 1)
                    || exist(M, str, i, j + 1)) {
                return true;
            }
            visited.remove(key);
            return false;
        }
    }
}
