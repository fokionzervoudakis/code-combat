package interviewingdotio.microsoft;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 https://interviewing.io/recordings/Go-Microsoft-1/
 <p>{@link leetcode.problems_0971_0980.Problem_0973}
 */
public class VertexDistance {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n log k)
     <li>space_worst=O(k)
     </ul>

     @param L a list of points
     @param origin an origin point
     @param k the number of closest points to {@code u} in terms of Euclidean
     distance
     @return the {@code k} closest points to {@code u}
     */
    List<Point> getClosest(List<Point> L, Point origin, int k) {
        if (k < 1) {
            return new ArrayList<>();
        }
        var H = new PriorityQueue<Node>((o1, o2) -> Double.compare(o2.dist, o1.dist));
        for (var p : L) {
            var dist = Math.sqrt(Math.pow(origin.x - p.x, 2) + Math.pow(origin.y - p.y, 2));
            if (H.size() == k) {
                var first = H.peek();
                if (first.dist > dist) {
                    H.remove(first);
                    H.add(new Node(p, dist));
                }
            } else {
                H.add(new Node(p, dist));
            }
        }
        var L2 = new ArrayList<Point>();
        H.forEach(node -> L2.add(0, node.p));
        return L2;
    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return x + "," + y;
        }
    }

    private class Node {
        Point p;
        double dist;

        Node(Point p, double dist) {
            this.p = p;
            this.dist = dist;
        }
    }
}
