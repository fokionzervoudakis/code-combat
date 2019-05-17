package dailycodingproblem.problems_021_030;

import annotation.OnePass;

/**
 Problem #26 [Medium] - Google
 */
class Problem_026 {
    @OnePass
    void removeKthElement(Node n, int k) {
        var hed = n;
        var i = 0;
        while (i++ < k) {
            hed = hed.next;
        }
        var tail = n;
        while (hed != null) {
            hed = hed.next;
            tail = tail.next;
        }
        tail.val = tail.next.val;
        tail.next = tail.next.next;
    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "[" + val + "] -> " + next;
        }
    }
}
