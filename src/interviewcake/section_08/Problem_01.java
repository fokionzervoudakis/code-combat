package interviewcake.section_08;

import annotation.DataStructure;
import annotation.DataStructure.Type;

@DataStructure(Type.LINKED_LIST)
class Problem_01 {
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
