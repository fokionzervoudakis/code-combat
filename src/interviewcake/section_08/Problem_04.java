package interviewcake.section_08;

class Problem_04 {
    Node kthToLastNode1(int k, Node hed) {
        if (k < 1) {
            throw new RuntimeException();
        }
        Node tail = hed;
        int i = 0;
        while (hed != null) {
            hed = hed.next;
            if (k == i) {
                tail = tail.next;
            } else {
                i++;
            }
        }
        if (k > i) {
            throw new RuntimeException();
        } else {
            return tail;
        }
    }

    Node kthToLastNode2(int k, Node hed) {
        if (k < 1) {
            throw new RuntimeException();
        }
        Node n = hed;
        int len = 0;
        while (n != null) {
            n = n.next;
            len++;
        }
        if (k > len) {
            throw new RuntimeException();
        }
        n = hed;
        for (int i = 0; i < len - k; i++) {
            n = n.next;
        }
        return n;
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
