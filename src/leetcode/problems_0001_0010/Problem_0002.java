package leetcode.problems_0001_0010;

class Problem_0002 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param N1 the head of a linked list (the list represents a non-negative
     integer with digits stored in reverse order)
     @param N2 a head of a second linked list similar to {@code N1}
     @return the sum of {@code N1} and {@code N2}
     */
    Node addTwoNumbers(Node N1, Node N2) {
        Node head = null, tail = null;
        int carry = 0;
        while (N1 != null || N2 != null) { // O(n)
            int x = (N1 != null) ? N1.val : 0;
            int y = (N2 != null) ? N2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            Node tmp = new Node(sum % 10);
            if (head == null) {
                head = tmp;
                tail = head;
            } else {
                tail.next = tmp;
                tail = tail.next;
            }
            if (N1 != null) N1 = N1.next;
            if (N2 != null) N2 = N2.next;
        }
        if (carry > 0) {
            tail.next = new Node(carry);
        }
        return head;
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
