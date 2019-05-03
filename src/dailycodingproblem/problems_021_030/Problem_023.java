package dailycodingproblem.problems_021_030;

import java.util.ArrayList;

/**
 Problem #21 [Easy] - Google
 */
class Problem_023 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(V+E)
     <li>space_worst=O(V)
     </ul>

     @param M a two dimensional boolean array
     @param start a start coordinate
     @param end and end coordinate
     @return the minimum number of moves (up, down, left, and right) required to
     reach {@code end} from {@code start} in {@code M}
     */
    Integer shortestPath(boolean[][] M, Point start, Point end) {
        var Q = new ArrayList<Point>();
        Q.add(start);

        int m = M.length, n = M[0].length;
        var visited = new boolean[m][n];

        while (!Q.isEmpty()) { // O(V+E)
            var p = Q.remove(0);
            if (M[p.x][p.y]) {
                continue;
            }
            if (p.x == end.x && p.y == end.y) {
                return p.d;
            } else if (!visited[p.x][p.y]) {
                visited[p.x][p.y] = true;
                var d = p.d + 1;
                if (p.x - 1 >= 0) {
                    Q.add(new Point(p.x - 1, p.y, d));
                }
                if (p.x + 1 < m) {
                    Q.add(new Point(p.x + 1, p.y, d));
                }
                if (p.y - 1 >= 0) {
                    Q.add(new Point(p.x, p.y - 1, d));
                }
                if (p.y + 1 < n) {
                    Q.add(new Point(p.x, p.y + 1, d));
                }
            }
        }

        return null;
    }

    static class Point {
        int x;
        int y;
        int d;

        Point(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }

        Point(int x, int y) {
            this(x, y, 0);
        }
    }
}
