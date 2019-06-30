package leetcode.problems_0431_0440;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 {@link dailycodingproblem.problems_111_120.Problem_111}
 */
public class Problem_0438 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^2)
     <li>space_worst=O(n)
     </ul>

     @param s a string
     @param p a pattern
     @return a list of start indices for {@code p}'s anagrams in {@code s}
     */
    List<Integer> findAnagrams(String s, String p) {
        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < s.length() - p.length() + 1; i++) { // O(n-m)
            if (isAnagram(s, p, i)) { // O(m)
                L.add(i);
            }
        }
        return L;
    }

    private boolean isAnagram(String s, String p, int i) {
        Map<Character, Integer> M = new HashMap<>();
        for (int j = i; j < i + p.length(); j++) { // O(n)
            char c = s.charAt(j);
            M.put(c, M.containsKey(c) ? M.get(c) + 1 : 1);
        }
        for (char c : p.toCharArray()) { // O(n)
            if (M.containsKey(c)) {
                M.put(c, M.get(c) - 1);
                if (M.get(c) == 0) {
                    M.remove(c);
                }
            } else {
                return false;
            }
        }
        return M.isEmpty();
    }
}
