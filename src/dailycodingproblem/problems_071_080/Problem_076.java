package dailycodingproblem.problems_071_080;

/**
 Problem #76 [Medium] - Google
 */
class Problem_076 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(mn)
     <li>space_worst=O(1)
     </ul>

     @param M a 2D matrix of lowercase letters
     @return the minimum number of columns that need to be removed from {@code M}
     to ensure that each column is ordered lexicographically from top to bottom
     */
    int colCount(char[][] M) {
        if (M.length < 2 || M[0].length < 2) {
            return 0;
        }
        int num = 0;
        outer:
        for (int j = 0; j < M[0].length; j++) { // O(m)
            for (int i = 1; i < M.length; i++) { // O(n)
                if (M[i][j] < M[i - 1][j]) {
                    num++;
                    continue outer;
                }
            }
        }
        return num;
    }
}
