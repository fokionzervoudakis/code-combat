package interviewcake.section_05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Problem_04 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(V+E)
     <li>space_worst=O(V)
     </ul>

     @param A an array of graph vertices
     @param B an array of colors
     */
    void colorGraph(Vertex[] A, String[] B) {
        for (Vertex v1 : A) { // O(V)
            if (v1.neighbors.contains(v1)) {
                throw new RuntimeException();
            }
            Set<String> S = new HashSet<>();
            for (Vertex v2 : v1.neighbors) { // O(E)
                S.add(v2.color);
            }
            for (String s : B) { // O(E)
                if (!S.contains(s)) {
                    v1.color = s;
                    break;
                }
            }
        }
    }

    static class Vertex {
        String val;

        String color;

        List<Vertex> neighbors = new ArrayList<>();

        Vertex(String val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return val + ":" + color + "=" + printNeighbors();
        }

        private String printNeighbors() {
            return neighbors.stream().map(n -> n.val + ":" + n.color).collect(Collectors.joining(", ", "[", "]"));
        }
    }
}
