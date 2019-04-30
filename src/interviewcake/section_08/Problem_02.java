package interviewcake.section_08;

import annotation.DataStructure;
import annotation.DataStructure.Type;

@DataStructure(Type.LINKED_LIST)
class Problem_02 {
    boolean containsCycle(Node hed) {
        Node slow = hed;
        Node fast = hed;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
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
