package dailycodingproblem.problems_091_100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 Problem #92 [Hard] - Airbnb
 */
class Problem_092 {
    Set<String> gray = new HashSet<>();
    Set<String> black = new LinkedHashSet<>();

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(V+E)
     <li>space_worst=O(V)
     </ul>

     @param M a hash map of course IDs and course ID lists, which represent
     the course prerequisites for their respective keys
     @return a sorted ordering of courses with respect to course prerequisites
     */
    List<String> dfs(Map<String, List<String>> M) {
        for (var E : M.entrySet()) {
            if (!black.contains(E.getKey())) {
                dfsVisit(M, E.getKey());
            }
        }
        return new ArrayList<>(black);
    }

    private void dfsVisit(Map<String, List<String>> M, String u) {
        gray.add(u);
        for (var v : M.get(u)) {
            if (gray.contains(v)) {
                throw new RuntimeException();
            } else if (!black.contains(v)) {
                dfsVisit(M, v);
            }
        }
        gray.remove(u);
        black.add(u);
    }
}
