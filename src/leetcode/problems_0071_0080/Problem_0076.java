package leetcode.problems_0071_0080;

import annotation.pattern.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 {@link dailycodingproblem.problems_101_110.Problem_103}
 */
public class Problem_0076 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(|S|+|T|)
     <li>space_worst=O(|S|+|T|)
     </ul>

     @param S a string
     @param T another string
     @return the min window in {@code S} containing all characters in {@code T},
     else the empty string if no such window exists
     */
    @SlidingWindow
    String minWindow(String S, String T) {
        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : T.toCharArray()) {
            tMap.put(c, tMap.containsKey(c) ? tMap.get(c) + 1 : 1);
        }

        Map<Character, Integer> winMap = new HashMap<>();

        int l = 0, r = 0;
        int charCount = 0;
        int winLen = -1;

        String out = "";

        while (r < S.length()) {
            char c = S.charAt(r);
            winMap.put(c, winMap.containsKey(c) ? winMap.get(c) + 1 : 1);
            if (tMap.containsKey(c) && winMap.get(c).intValue() == tMap.get(c).intValue()) {
                charCount++;
            }
            while (l <= r && charCount == tMap.size()) {
                int tmp = r - l + 1;
                if (winLen < 0 || tmp < winLen) {
                    winLen = tmp;
                    out = S.substring(l, r + 1);
                }
                c = S.charAt(l);
                winMap.put(c, winMap.get(c) - 1);
                if (tMap.containsKey(c) && winMap.get(c) < tMap.get(c)) {
                    charCount--;
                }
                l++;
            }
            r++;
        }

        return out;
    }
}
