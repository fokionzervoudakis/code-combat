package leetcode.problems_0001_0010;

class Problem_0006 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(mn)
     <li>space_worst=O(mn)
     </ul>

     @param str the target string
     @param m the number of rows that {@code str} is written in zig zag pattern
     @return a line-by-line order of the zig zag pattern of {@code str}
     */
    String convert(String str, int m) {
        int n = str.length();
        if (m == 1) {
            return str;
        }
        char[][] M = new char[m][n];
        int i = 0, j = 0, k = 0;
        boolean down = true;
        while (k < n) { // O(mn)
            M[i][j] = str.charAt(k++);
            if (down) {
                if (i < m - 1) {
                    i++;
                } else {
                    i--;
                    j++;
                    down = false;
                }
            } else {
                if (i > 0) {
                    i--;
                    j++;
                } else {
                    i++;
                    down = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < m; i++) { // O(m)
            for (j = 0; j < n; j++) { // O(n)
                char c = M[i][j];
                if (c != '\0') {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
