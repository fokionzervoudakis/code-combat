package dailycodingproblem.problems_111_120;

import java.util.Stack;

/**
 Problem #112 [Hard] - Twitter
 */
class Problem_112 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param root the root of a binary tree
     @param N1 a binary tree node
     @param N2 another binary tree node
     @return the lowest common ancestor if {@code N1} and {@code N2}
     */
    // TODO test
    Node lca(Node root, Node N1, Node N2) {
        Stack<Node> S1 = getPath(root, N1), S2 = getPath(root, N2);
        Node lca = null, tmp;
        while (!S1.isEmpty() && !S2.isEmpty()) {
            if ((tmp = S1.pop()).val == S2.pop().val) {
                lca = tmp;
            } else {
                break;
            }
        }
        return lca;
    }

    private Stack<Node> getPath(Node N1, Node N2) {
        Stack<Node> S = new Stack<>();
        if (N1 != null) {
            if (N1.val == N2.val) {
                S.push(N1);
            } else if (!(S = getPath(N1.l, N2)).isEmpty()) {
                S.push(N1);
            } else if (!(S = getPath(N1.r, N2)).isEmpty()) {
                S.push(N1);
            }
        }
        return S;
    }

    static class Node {
        int val;
        Node l, r;

        Node(int val) {
            this.val = val;
        }
    }
}
