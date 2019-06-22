package dailycodingproblem.problems_091_100;

/**
 Problem #93 [Hard] - Apple
 */
class Problem_093 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^2)
     <li>space_worst=O(n)
     </ul>

     @param N a root of a binary tree
     @return the size of the largest BST in the tree with root {@code N}
     */
    int maxBst(Node N) {
        return isBst(N) ? size(N) : Math.max(maxBst(N.l), maxBst(N.r));
    }

    private boolean isBst(Node N) {
        return isBst(N, null, null);
    }

    private boolean isBst(Node N, Integer min, Integer max) {
        if (N == null) {
            return true;
        } else if (min != null && N.val <= min) {
            return false;
        } else if (max != null && N.val >= max) {
            return false;
        } else {
            return isBst(N.l, min, N.val) && isBst(N.r, N.val, max);
        }
    }

    private int size(Node N) {
        if (N == null) {
            return 0;
        }
        return 1 + size(N.l) + size(N.r);
    }

    static class Node {
        int val;

        Node l, r;

        Node(int val) {
            this.val = val;
        }
    }
}
