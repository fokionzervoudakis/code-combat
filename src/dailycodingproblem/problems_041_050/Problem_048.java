package dailycodingproblem.problems_041_050;

import static java.util.Arrays.copyOfRange;

/**
 Problem #48 [Medium] - Google
 */
class Problem_048 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_avg=O(n)
     <li>time_worst=O(n^2)
     <li>space_worst=O(n)
     </ul>

     @param pre the pre-order traversal of a binary tree
     @param in the inorder traversal of a binary tree
     @return the binary tree corresponding to {@code pre} and {@code in}
     */
    Node getTree(char[] pre, char[] in) {
        if (pre.length == 0) {
            return null;
        }
        var c = pre[0];
        var N = new Node(c);
        if (pre.length > 1) {
            for (int i = 0; i < in.length; i++) {
                if (in[i] == c) {
                    N.l = getTree(copyOfRange(pre, 1, i + 1), copyOfRange(in, 0, i));
                    N.r = getTree(copyOfRange(pre, i + 1, pre.length), copyOfRange(in, i + 1, in.length));
                }
            }
        }
        return N;
    }

    class Node {
        char val;
        Node l, r;

        Node(char val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "(" + l + " " + val + " " + r + ")";
        }
    }
}
