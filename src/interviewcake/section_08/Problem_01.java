package interviewcake.section_08;

class Problem_01 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(1)
     <li>space_worst=O(1)
     </ul>

     @param n the node to be deleted
     */
    void deleteNode(Node n) {
        n.val = n.next.val;
        n.next = n.next.next;
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
