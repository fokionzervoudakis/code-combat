package dailycodingproblem.problems_011_020;

/**
 Problem #20 [Easy] - Google
 */
class Problem_020 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(m+n)
     <li>space_worst=O(1)
     </ul>

     @param A a node in a linked list
     @param B a node in a second linked list
     @return the intersecting node in the linked lists containing {@code A} and
     {@code B}, or null if the lists do not intersect
     */
    Node getIntersection(Node A, Node B) {
        if (A == null || B == null) return null;

        int a = 0, b = 0;

        Node A2 = A, B2 = B;

        while ((A2 = A2.next) != null) a++; // O(m)
        while ((B2 = B2.next) != null) b++; // O(n)

        int i = 0;

        A2 = A;
        B2 = B;

        if (a > b) {
            while (i++ < b) {
                B2 = B2.next;
            }
        } else if (b > a) {
            while (i++ < a) {
                A2 = A2.next;
            }
        }

        while (A2 != null && B2 != null) {
            if (A2 == B2) {
                break;
            } else {
                A2 = A2.next;
                B2 = B2.next;
            }
        }

        return A2;
    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
}
