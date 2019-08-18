package dailycodingproblem.problems_151_160;

import java.util.HashSet;

/**
 Problem #159 [Easy] - Google
 */
class Problem_159 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>
     */
    Character getFirstRecurring(String str) {
        var S = new HashSet<Character>();
        for (var c : str.toCharArray()) { // O(n)
            if (S.contains(c)) {
                return c;
            } else {
                S.add(c);
            }
        }
        return null;
    }
}
