package dailycodingproblem.problems_141_150;

/**
 Problem #145 [Easy] - Google
 */
class Problem_145 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>
     */
    Node swapTwo(Node N) {
        Node curr = N;
        while (curr != null && curr.next != null) { // O(n)
            int val = curr.val;
            curr.val = curr.next.val;
            curr.next.val = val;
            curr = curr.next.next;
        }
        return N;
    }

    static class Node {
        int val;

        Node next;

        Node(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return val + " -> " + next;
        }
    }
}
