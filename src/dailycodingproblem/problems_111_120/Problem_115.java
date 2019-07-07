package dailycodingproblem.problems_111_120;

/**
 Problem #115 [Hard] - Google
 */
class Problem_115 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param S a binary tree root node
     @param T another binary tree root node
     @return true if {@code T} is a subtree of {@code S}, else false
     */
    boolean isSubtree(Node S, Node T) {
        var s = preOrder(S); // O(n)
        var t = preOrder(T); // O(n)
        return s.contains(t); // O(n)
    }

    private String preOrder(Node N) {
        return preOrder(N, new StringBuilder());
    }

    private String preOrder(Node N, StringBuilder sb) {
        if (N != null) {
            sb.append(N);
            preOrder(N.l, sb);
            preOrder(N.r, sb);
        }
        return sb.toString();
    }

    static class Node {
        int val;
        Node l, r;

        Node(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "(" + l + " " + val + " " + r + ")";
        }
    }
}
