package leetcode.problems_0021_0030;

class Problem_0023 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(mn)
     <li>space_worst=O(n)
     </ul>

     @param A an array of sorted linked lists
     @return the hed of a sorted linked list comprising all lists in {@code A}
     */
    Node mergeKLists(Node[] A) {
        int n = A.length;
        if (n == 0) {
            return null;
        }
        Node N = A[0];
        for (int i = 1; i < n; i++) { // O(n)
            N = merge(N, A[i]);
        }
        return N;
    }

    private Node merge(Node N1, Node N2) {
        Node dummy = new Node(-1), curr = dummy;
        while (N1 != null && N2 != null) { // O(m+n)
            int val;
            if (N1.val < N2.val) {
                val = N1.val;
                N1 = N1.next;
            } else {
                val = N2.val;
                N2 = N2.next;
            }
            curr.next = new Node(val);
            curr = curr.next;
        }
        while (N1 != null) { // O(m)
            curr.next = new Node(N1.val);
            N1 = N1.next;
            curr = curr.next;
        }
        while (N2 != null) { // O(n)
            curr.next = new Node(N2.val);
            N2 = N2.next;
            curr = curr.next;
        }
        return dummy.next;
    }

    static class Node {
        int val;

        Node next;

        Node(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "[" + val + "] -> " + next;
        }
    }
}
