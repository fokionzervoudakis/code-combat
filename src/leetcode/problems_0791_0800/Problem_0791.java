package leetcode.problems_0791_0800;

import java.util.HashMap;
import java.util.Map;

class Problem_0791 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param S a string comprising unique lowercase letters
     @param T a string
     @return a permutation of {@code T} that that matches the order of characters
     in {@code S}
     */
    String customSortString(String S, String T) {
        Map<Character, Integer> M = new HashMap<>();
        for (char c : T.toCharArray()) {
            M.put(c, M.containsKey(c) ? M.get(c) + 1 : 1);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (M.containsKey(c)) {
                for (int i = 0; i < M.get(c); i++) {
                    sb.append(c);
                }
                M.remove(c);
            }
        }
        for (char c : M.keySet()) {
            for (int i = 0; i < M.get(c); i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
