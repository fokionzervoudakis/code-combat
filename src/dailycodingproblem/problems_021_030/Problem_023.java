package dailycodingproblem.problems_021_030;

import java.util.ArrayList;

/**
 Problem #21 [Easy] - Google
 */
class Problem_023 {
    // TODO add Javadoc and test
    Integer shortestPath(boolean[][] M, Point start, Point end) {
        var Q = new ArrayList<Point>();
        Q.add(start);

        int m = M.length, n = M[0].length;
        var visited = new boolean[m][n];

        while (!Q.isEmpty()) {
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

    public static void main(String[] args) {
        var M = new boolean[][] {
                { false, false, false, false },
                { true, true, false, true },
                { false, false, false, false },
                { false, false, false, false }
        };
        System.out.println(new Problem_023().shortestPath(M, new Point(3, 0), new Point(0, 0)));
    }
}
