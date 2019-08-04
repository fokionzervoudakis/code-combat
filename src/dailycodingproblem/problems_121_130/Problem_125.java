package dailycodingproblem.problems_121_130;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 Problem #125 [Easy] - Google
 */
class Problem_125 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>
     */
    List<Node> preOrder(Node N1, int k) {
        var L = new ArrayList<Node>();
        if (N1 != null) {
            var S = new Stack<Node>();
            S.push(N1);
            var M = new HashMap<Integer, Node>();
            while (!S.isEmpty()) { // O(n)
                var N2 = S.pop();
                int n = Math.abs(N2.val - k);
                if (M.containsKey(n)) {
                    L.add(N2);
                    L.add(M.get(n));
                    break;
                } else {
                    M.put(N2.val, N2);
                }
                if (N2.l != null) {
                    S.push(N2.l);
                }
                if (N2.r != null) {
                    S.push(N2.r);
                }
            }
        }
        return L;
    }

    static class Node {
        int val;
        Node l, r;

        Node(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return val + "";
        }
    }
}
