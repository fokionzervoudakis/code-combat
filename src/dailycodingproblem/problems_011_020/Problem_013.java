package dailycodingproblem.problems_011_020;

import annotation.pattern.HashTable;

import java.util.HashMap;

/**
 Problem #13 [Hard] - Amazon
 */
class Problem_013 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param str a string
     @param k a number
     @return the length of the longest substring in {@code str} that contains at
     most {@code k} distinct characters
     */
    @HashTable
    int maxSub(String str, int k) {
        var M = new HashMap<Character, Integer>();
        int hed = 0, tail = 0, len = 0, max = 0;
        while (hed < str.length()) { // O(n)
            var c = str.charAt(hed++);
            M.put(c, M.containsKey(c) ? M.get(c) + 1 : 1); // O(1)
            len++;
            while (M.size() > k) { // O(n)
                c = str.charAt(tail++);
                var n = M.get(c) - 1; // O(1)
                if (n == 0) {
                    M.remove(c); // O(1)
                } else {
                    M.put(c, n); // O(1)
                }
                len--;
            }
            if (len > max) {
                max = len;
            }
        }
        return max;
    }
}
