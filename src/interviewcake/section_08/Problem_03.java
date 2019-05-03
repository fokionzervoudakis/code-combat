package interviewcake.section_08;

class Problem_03 {
    Node reverseList(Node hed) {
        if (hed == null) {
            return null;
        }
        Node prev = null;
        while (hed.next != null) {
            var tmp = hed.next;
            hed.next = prev;
            prev = hed;
            hed = tmp;
        }
        hed.next = prev;
        return hed;
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
