package dailycodingproblem.problems_021_030;

import annotation.Pattern;
import annotation.Pattern.Type;
import com.google.common.collect.ImmutableMap;

import java.util.Stack;

/**
 Problem #27 [Easy] - Facebook
 */
@Pattern(Type.HASH_TABLE)
class Problem_027 {
    boolean hasMatchingBrackets(String s) {
        var M = ImmutableMap.of('(', ')', '[', ']', '{', '}');
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
