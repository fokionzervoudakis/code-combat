package dailycodingproblem.problems_081_090;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 Problem #81 [Easy] - Yelp
 */
class Problem_081 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(3^n)
     <li>space_worst=O(3^n)
     </ul>

     @param num a digit string
     @return all possible letter combinations represented by {@code A}
     */
    List<String> getDigitsToLetters(String num) {
        var M = new HashMap<Character, List<String>>() {{
            put('2', Arrays.asList("a", "b", "c"));
            put('3', Arrays.asList("d", "e", "f"));
        }};
        List<String> L = new ArrayList<>() {{
            addAll(M.get(num.charAt(0)));
        }};
        for (var i = 1; i < num.length(); i++) { // O(n)
            var tmp = new ArrayList<String>();
            for (var s1 : L) { // O(3^(n-1))
                for (var s2 : M.get(num.charAt(i))) { // O(3)
                    tmp.add(s1 + s2);
                }
            }
            L = tmp;
        }
        return L;
    }
}
