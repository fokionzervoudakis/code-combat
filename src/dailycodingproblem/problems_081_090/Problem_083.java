package dailycodingproblem.problems_081_090;

/**
 Problem #83 [Medium] - Google
 <p>{@link leetcode.problems_0221_0230.Problem_0226}
 */
public class Problem_083 {
    Node invert(Node N) {
        if (N == null) {
            return null;
        }
        Node l = invert(N.l);
        Node r = invert(N.r);
        N.r = l;
        N.l = r;
        return N;
    }

    static class Node {
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
