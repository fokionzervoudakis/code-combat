package interviewcake.section_08;

/**
 {@link dailycodingproblem.problems_071_080.Problem_073}
 <p>{@link leetcode.problems_0201_0210.Problem_0206}
 */
public class Problem_03 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param hed the first node in a singly-linked list
     @return the first node of a reversed list with {@code hed} at the end of
     that list
     */
    Node reverseList(Node hed) {
        if (hed == null) {
            return null;
        }
        Node prev = null;
        while (hed.next != null) {
            Node tmp = hed.next;
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
