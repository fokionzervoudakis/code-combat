package dailycodingproblem.problems_061_070;

import java.util.LinkedList;

/**
 Problem #63 [Easy] - Microsoft
 */
class Problem_063 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(mnk)
     <li>space_worst=O(k)
     </ul>

     @param M a character matrix
     @param str the target string
     @return true if {@code str} can be found in {@code M} by searching
     top-to-bottom or left-to-right, else false
     */
    boolean hasWord(char[][] M, String str) {
        int m = M.length, n = M[0].length;
        var k = str.length();
        if (k > m && k > n) {
            return false;
        }
        if (m >= k && helper(M, str)) {
            return true;
        }
        if (n >= k && helper(transpose(M), str)) {
            return true;
        }
        return false;
    }

    private char[][] transpose(char[][] M1) {
        int m = M1.length, n = M1[0].length;
        var M2 = new char[n][m];
        for (var i = 0; i < n; i++) { // O(n)
            for (var j = 0; j < m; j++) { // O(m)
                M2[i][j] = M1[j][i];
            }
        }
        return M2;
    }

    private boolean helper(char[][] M, String str) {
        var k = str.length();
        for (var A : M) { // O(m)
            LinkedList<Character> L = new LinkedList<>();
            for (var c : A) { // O(n)
                L.addLast(c);
                if (L.size() > k) {
                    L.removeFirst();
                }
                if (L.size() == k) {
                    if (str.equals(toS(L))) { // O(k)
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private String toS(LinkedList<Character> L) {
        var sb = new StringBuilder();
        for (char c : L) { // O(n)
            sb.append(c);
        }
        return sb.toString();
    }
}
