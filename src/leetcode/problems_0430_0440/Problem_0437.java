package leetcode.problems_0430_0440;

// TODO test
class Problem_0437 {
    int pathSum(Node N, int n) {
        if (N == null) {
            return 0;
        }
        return helper(N, n) + pathSum(N.l, n) + pathSum(N.r, n);
    }

    public int helper(Node N, int n) {
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
