package interviewcake.section_05;

/**
 {@link interviewcake.section_06.Problem_05}
 */
public class Problem_01 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param n a tree node
     @return true if the difference between the depths of any two leaf nodes is
     less than or equal to one, else false
     */
    boolean isBalanced(Node n) {
        return n == null || Math.abs(height(n.l) - height(n.r)) <= 1;
    }

    private int height(Node n) {
        return (n == null) ? 0 : (1 + Math.max(height(n.l), height(n.r)));
    }

    static class Node {
        Node l, r;
    }
}
