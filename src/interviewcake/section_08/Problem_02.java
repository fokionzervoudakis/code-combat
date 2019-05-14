package interviewcake.section_08;

class Problem_02 {
    /**
     Implements a variation of Floyd's cycle-finding algorithm.
     <p>Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param hed the first node in a singly-linked list
     @return true if the list contains a cycle, else false
     */
    boolean containsCycle(Node hed) {
        Node tail = hed;
        int i = 0;
        while (hed != null) {
            hed = hed.next;
            if (++i % 2 == 0) {
                tail = tail.next;
            }
            if (hed == tail) {
                return true;
            }
        }
        return false;
    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
}
