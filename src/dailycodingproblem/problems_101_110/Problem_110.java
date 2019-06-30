package dailycodingproblem.problems_101_110;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 Problem #110 [Medium] - Facebook
 */
class Problem_110 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param root the root node of a binary tree
     @return a list of all paths from root to leaves
     */
    List<String> getPaths(Node root) {
        return printPaths(dfs(root), root);
    }

    private List<Node> dfs(Node root) {
        var L = new LinkedList<Node>();
        var S = new Stack<Node>();
        S.push(root);
        while (!S.isEmpty()) { // O(n)
            var N = S.pop();
            if (N.l == null && N.r == null) {
                L.addFirst(N);
            } else {
                if (N.l != null) {
                    N.l.p = N;
                    S.push(N.l);
                }
                if (N.r != null) {
                    N.r.p = N;
                    S.push(N.r);
                }
            }
        }
        return L;
    }

    private List<String> printPaths(List<Node> L, Node root) {
        var out = new ArrayList<String>();
        for (Node N : L) { // O(n)
            var sub = new LinkedList<Integer>();
            while (N != root) { // O(n)
                sub.addFirst(N.val); // O(1)
                N = N.p;
            }
            sub.addFirst(root.val); // O(1)
            out.add(sub.toString());
        }
        return out;
    }

    static class Node {
        int val;
        Node l, r, p;

        Node(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return p + ", " + val;
        }
    }
}
