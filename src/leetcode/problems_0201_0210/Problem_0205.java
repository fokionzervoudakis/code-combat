package leetcode.problems_0201_0210;

import java.util.HashMap;
import java.util.Map;

class Problem_0205 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param s a string
     @param t another string
     @return true if all characters in {@code s} can be replaced with characters
     in {@code t} while preserving the original order, else false
     */
    boolean isIsomorphic(String s, String t) {
        Map<Character, Character> M1 = new HashMap<>(), M2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) { // O(n)
            char c1 = s.charAt(i), c2 = t.charAt(i);
            if (M1.containsKey(c1)) {
                if (M1.get(c1) != c2) {
                    return false;
                }
            } else {
                if (M2.containsKey(c2)) {
                    return false;
                } else {
                    M1.put(c1, c2);
                    M2.put(c2, c1);
                }
            }
        }
        return true;
    }
}
