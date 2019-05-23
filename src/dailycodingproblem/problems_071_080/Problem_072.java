package dailycodingproblem.problems_071_080;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;

/**
 Problem #72 [Hard] - Google
 */
class Problem_072 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(V^2)
     <li>space_worst=O(V+E)
     </ul>

     @param str a string representation of values assigned to graph vertices
     @param M an adjacency matrix
     @return the max path value or null if the max value is infinite (i.e. if the
     path contains cycles)
     */
    Integer dfs(String str, int[][] M) {
        var start = getGraph(str, M);

        var S = new Stack<Vertex>();
        S.push(start);

        int max = 0;

        while (!S.isEmpty()) { // O(V)
            Vertex u = S.pop(), last = u;
            u.visited = true;
            for (Vertex v : u.adj) { // O(E)
                last = v;
                if (v.visited) {
                    return null;
                } else {
                    v.p = u;
                    S.push(v);
                }
            }
            max = Math.max(max, max(last)); // O(V)
        }

        return max;
    }

    private int max(Vertex vertex) {
        var tmp = new HashMap<Character, Integer>();
        int max = 0;
        while (vertex != null) {
            var n = tmp.containsKey(vertex.c) ? tmp.get(vertex.c) + 1 : 1;
            tmp.put(vertex.c, n);
            if (max < n) {
                max = n;
            }
            vertex = vertex.p;
        }
        return max;
    }

    private Vertex getGraph(String str, int[][] M) {
        var map = new LinkedHashMap<Integer, Vertex>();
        for (int i = 0; i < str.length(); i++) { // O(V)
            map.put(i, new Vertex(str.charAt(i)));
        }
        for (int[] A : M) { // O(E)
            map.get(A[0]).adj.add(map.get(A[1]));
        }
        return map.get(0);
    }

    private class Vertex {
        char c;

        Vertex p;

        List<Vertex> adj = new ArrayList<>();

        boolean visited = false;

        Vertex(char c) {
            this.c = c;
        }
    }
}
