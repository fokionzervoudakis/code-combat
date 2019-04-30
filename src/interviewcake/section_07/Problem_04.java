package interviewcake.section_07;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

class Problem_04 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param str a string
     @return true if braces, brackets and parentheses in {@code str} are
     balanced, else false
     */
    boolean isValid(String str) {
        Map<Character, Character> M = new HashMap<>();
        M.put('(', ')');
        M.put('[', ']');
        M.put('{', '}');

        Set<Character> opening = M.keySet();
        Set<Character> closing = new HashSet<>(M.values());

        Stack<Character> S = new Stack<>();

        for (char c : str.toCharArray()) { // O(n)
            if (opening.contains(c)) { // O(1)
                S.push(c); // O(1)
            } else if (closing.contains(c)) { // O(1)
                if (S.isEmpty() || M.get(S.pop()) != c) { // O(1)
                    return false;
                }
            }
        }

        return S.isEmpty();
    }
}
