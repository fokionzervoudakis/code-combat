package dailycodingproblem.problems_091_100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 Problem #92 [Hard] - Airbnb
 */
class Problem_092 {
    List<String> out = new ArrayList<>();
    Set<String> done = new HashSet<>();

    // TODO Javadoc+test
    List<String> dfs(Map<String, List<String>> M) {
        for (var E : M.entrySet()) {
            if (!done.contains(E.getKey())) {
                dfsVisit(M, E.getKey());
            }
        }
        Collections.reverse(out);
        return out;
    }

    private void dfsVisit(Map<String, List<String>> M, String start) {
        var S = new Stack<String>();
        S.push(start);
        while (!S.isEmpty()) {
            var str1 = S.pop();
            out.add(str1);
            done.add(str1);
            for (var str2 : M.get(str1)) {
                if (done.contains(str2)) {
                    throw new RuntimeException();
                } else {
                    S.push(str2);
                }
            }
        }
    }
}
