package interviewcake.section_05;

/**
 {@link interviewcake.section_06.Problem_07}
 */
public class Problem_03 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_avg=O(h)
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param n the root of a BST
     @return the second largest value in {@code n}
     */
    int findSecondLargest(Node n) {
        if (n == null || (n.l == null && n.r == null)) {
            throw new RuntimeException();
        }
        while (true) {
            if (n.r == null) {
                return findMax(n.l);
            } else {
                if (n.r.l == null && n.r.r == null) {
                    return n.val;
                } else {
                    n = n.r;
                }
            }
        }
    }

    private int findMax(Node n) {
        while (n.r != null) {
            n = n.r;
        }
        return n.val;
    }

    static class Node {
        int val;

        Node l, r;

        Node(int val) {
            this.val = val;
        }
    }
}
