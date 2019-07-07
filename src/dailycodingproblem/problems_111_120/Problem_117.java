package dailycodingproblem.problems_111_120;

import java.util.LinkedList;

/**
 Problem #117 [Easy] - Facebook
 */
class Problem_117 {
    // TODO test
    int minLevel(Node N1) {
        var gMin = 0;
        if (N1 != null) {
            var D = new LinkedList<Node>();
            D.add(N1);
            while (!D.isEmpty()) {
                int n = D.size(), lMin = 0;
                while (n > 0) {
                    var N2 = D.removeFirst();
                    lMin += N2.val;
                    if (N2.l != null) {
                        D.addLast(N2.l);
                    }
                    if (N2.r != null) {
                        D.addLast(N2.r);
                    }
                    n--;
                }
                gMin = Math.min(gMin, lMin);
            }
        }
        return gMin;
    }

    static class Node {
        int val;

        Node l, r;

        Node(int val) {
            this.val = val;
        }
    }
}
