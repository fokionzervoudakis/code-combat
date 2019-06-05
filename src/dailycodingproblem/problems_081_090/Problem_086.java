package dailycodingproblem.problems_081_090;

import java.util.Stack;

/**
 Problem #85 [Medium] - Google
 */
class Problem_086 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param str a string of parentheses
     @return the number of parentheses that must be removed for remaining
     parentheses to be balanced
     */
    int countParen(String str) {
        var S = new Stack<Character>();
        for (var c : str.toCharArray()) { // O(n)
            if (c == '(') {
                S.push(c);
            } else {
                if (!S.isEmpty() && S.peek() == '(') {
                    S.pop();
                } else {
                    S.push(c);
                }
            }
        }
        return S.size();
    }
}
