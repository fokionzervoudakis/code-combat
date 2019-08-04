package dailycodingproblem.problems_141_150;

/**
 Problem #146 [Medium] - BufferBox
 */
class Problem_146 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>
     */
    void prune(Node N) {
        helper(N);
    }

    private boolean helper(Node N) {
        if (N == null) {
            return true;
        }
        if (helper(N.l)) {
            N.l = null;
        }
        if (helper(N.r)) {
            N.r = null;
        }
        return N.l == null && N.r == null && N.val == 0;
    }

    static class Node {
        int val;
        Node l, r;

        Node(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "(" + l + " " + val + " " + r + ")";
        }
    }
}
