package leetcode.problems_0021_0030;

class Problem_0028 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(mn)
     <li>space_worst=O(1)
     </ul>

     @param s the target string
     @param p the pattern string
     @return the index of the first occurrence of {@code p} in {@code s}, or -1
     if {@code p} is not in {@code s}
     */
    int strStr(String s, String p) {
        int i = 0, j = 0, k = 0;
        while (i < s.length() && j < p.length()) { // O(mn)
            if (s.charAt(i) == p.charAt(j)) {
                i++;
                j++;
            } else {
                k++;
                i = k;
                j = 0;
            }
        }
        return (j == p.length()) ? k : -1;
    }
}
