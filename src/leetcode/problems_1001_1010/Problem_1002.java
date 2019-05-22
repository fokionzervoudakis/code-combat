package leetcode.problems_1001_1010;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Problem_1002 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^2)
     <li>space_worst=O(n)
     </ul>

     @param A an array of lowercase strings
     @return a list of characters in all strings, including duplicate characters
     */
    List<String> commonChars(String[] A) {
        int[] count = new int[26]; // O(k)
        Arrays.fill(count, Integer.MAX_VALUE); // O(k)
        for (String str : A) { // O(m)
            int[] tmp = new int[26]; // O(k)
            for (int i = 0; i < str.length(); i++) { // O(n)
                tmp[str.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) { // O(k)
                count[i] = Math.min(tmp[i], count[i]);
            }
        }
        List<String> L = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) { // O(k)
            while (count[c - 'a']-- > 0) { // O(min(n))
                L.add("" + c);
            }
        }
        return L;
    }
}
