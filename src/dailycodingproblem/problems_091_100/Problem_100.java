package dailycodingproblem.problems_091_100;

import java.util.List;

/**
 Problem #100 [Easy] - Google
 */
class Problem_100 {
    /**
     The shortest distance between two points on a 2D grid (with movement in all
     directions) is the max of their horizontal and vertical distances:
     max(abs(x1-x2), abs(y1-y2))
     <p>In other words, the shortest distance between two points traverses the
     max possible distance diagonally with any remaining distance traversed
     horizontally/vertically.
     <p>Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param L a list of points
     @return the min number of steps on an infinite 2D grid required to cover all
     points in {@code L}
     */
    int minSteps(List<Point> L) {
        var n = 0;
        for (var i = 0; i < L.size() - 1; i++) { //O(n)
            Point p1 = L.get(i), p2 = L.get(i + 1);
            // See the Javadoc for an explanation of why max is used to calculate
            // the min number of steps between two points on a 2D grid.
            n += Math.max(Math.abs(p1.x - p2.x), Math.abs(p1.y - p2.y));
        }
        return n;
    }

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
