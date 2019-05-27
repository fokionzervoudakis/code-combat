package leetcode.problems_0091_0100;

class Problem_0098 {
    // TODO test
    boolean isValidBST(Node N) {
        return helper(N, null, null);
    }

    private boolean helper(Node N, Integer min, Integer max) {
        if (N == null) {
            return true;
        } else if (min != null && N.val <= min) {
            return false;
        } else if (max != null && N.val >= max) {
            return false;
        } else {
            return helper(N.l, min, N.val) && helper(N.r, N.val, max);
        }
    }

    static class Node {
        int val;

        Node l, r;

        Node(int val) {
            this.val = val;
        }
    }
}
