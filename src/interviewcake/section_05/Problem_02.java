package interviewcake.section_05;

/**
 {@link interviewcake.section_06.Problem_06}
 */
public class Problem_02 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param n a tree node
     @return true if {@code n} is a binary search tree, else false
     */
    boolean isBst(Node n) {
        return isBst(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBst(Node n, int min, int max) {
        if (n == null) {
            return true;
        } else if (n.val <= min || n.val >= max) {
            return false;
        } else {
            return isBst(n.l, min, n.val) && isBst(n.r, n.val, max);
        }
    }

    static class Node {
        int val;

        Node l, r;

        Node(int val) {
            this.val = val;
        }
    }
}
