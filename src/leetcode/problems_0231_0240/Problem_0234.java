package leetcode.problems_0231_0240;

// TODO
class Problem_0234 {
    boolean isPalindrome(Node N1) {
        // Find the length:
        Node N2 = N1;
        int n = 0;
        while (N2 != null) {
            N2 = N2.next;
            n++;
        }

        // Find the middle:
        N2 = N1;
        int i = 0;
        while (i < n / 2) {
            N2 = N2.next;
            i++;
        }

        // Reverse the second part:
        reverseList(N2);

        // Compare the two sub-lists:
        while (N1 != null && N2 != null) {
            if (N1.val != N2.val) {
                return false;
            } else {
                N1 = N1.next;
                N2 = N2.next;
            }
        }
        return true;
    }

    private void reverseList(Node hed) {
        if (hed == null) {
            return;
        }
        Node prev = null;
        while (hed.next != null) {
            Node tmp = hed.next;
            hed.next = prev;
            prev = hed;
            hed = tmp;
        }
        hed.next = prev;
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
