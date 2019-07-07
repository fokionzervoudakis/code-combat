package dailycodingproblem.problems_111_120;

/**
 Problem #116 [Medium] - Jane Street
 */
class Problem_116 {
    private static int count = 0;

    // TODO test
    Node generate() {
        return new Node(count++);
    }

    static class Node {
        int val;

        Node l, r;

        Node(int val) {
            this.val = val;
        }

        Node left() {
            if (l == null) {
                l = new Node(count++);
            }
            return l;
        }

        Node right() {
            if (r == null) {
                r = new Node(count++);
            }
            return r;
        }
    }
}
