package dailycodingproblem.problems_021_030;

import annotation.Pattern;
import annotation.Pattern.Type;

import java.util.HashMap;
import java.util.Stack;

/**
 Problem #27 [Easy] - Facebook
 <p>{@link interviewcake.section_07.Problem_04}
 */
@Pattern(Type.HASH_TABLE)
public class Problem_027 {
    boolean hasMatchingBrackets(String s) {
        var M = new HashMap<Character, Character>() {{
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }};
        var S = new Stack<Character>();
        for (var c : s.toCharArray()) {
            if (M.containsKey(c)) {
                S.push(c);
            } else if (S.isEmpty() || !M.get(S.pop()).equals(c)) {
                return false;
            }
        }
        return S.isEmpty();
    }
}
