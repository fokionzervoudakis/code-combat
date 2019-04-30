package interviewcake.section_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Problem_05 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(V+E)
     <li>space_worst=O(V)
     </ul>

     @param graph an adjacency list representation of an undirected graph
     @param start a node in {@code graph}
     @param end another node in {@code graph}
     @return the shortest path from {@code start} to {@code end} if it exists,
     else null
     */
    String[] getPath(Map<String, String[]> graph, String start, String end) {
        if (!graph.containsKey(start) || !graph.containsKey(end)) {
            throw new RuntimeException();
        }

        List<String> L = new ArrayList<>();
        L.add(start);

        Map<String, String> M = new HashMap<>();
        M.put(start, null);

        while (!L.isEmpty()) {
            String s1 = L.remove(0);
            if (s1.equals(end)) {
                return getPath(M, end);
            }
            for (String s2 : graph.get(s1)) {
                if (!M.containsKey(s2)) {
                    M.put(s2, s1);
                    L.add(s2);
                }
            }
        }

        return null;
    }

    private String[] getPath(Map<String, String> M, String end) {
        List<String> L = new ArrayList<>();
        String str = end;
        while (str != null) {
            L.add(str);
            str = M.get(str);
        }
        Collections.reverse(L);
        return L.toArray(new String[0]);
    }
}
