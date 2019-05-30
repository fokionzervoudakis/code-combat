package leetcode.problems_0430_0440;

class Problem_0437 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^2)
     <li>space_worst=O(n)
     </ul>

     @param N the root node
     @param n the target sum
     @return the number of paths in the tree with root {@code N} that sum to {@code n}
     */
    int pathSum(Node N, int n) {
        if (N == null) {
            return 0;
        }
        return helper(N, n) + pathSum(N.l, n) + pathSum(N.r, n);
    }

    private int helper(Node N, int n) {
        if (N == null) {
            return 0;
        }
        int diff = n - N.val;
        return ((diff == 0) ? 1 : 0) + helper(N.l, diff) + helper(N.r, diff);
    }

    static class Node {
        int val;

        Node l, r;

        Node(int val) {
            this.val = val;
        }
    }
}
