package dailycodingproblem.problems_071_080;

class Problem_080 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param N the root of a tree
     @return the deepest node in the tree with root {@code N}
     */
    Node getDeepest(Node N) {
        return (N == null) ? null : helper(new Tuple(N, 0)).node;
    }

    private Tuple helper(Tuple T) {
        var N = T.node;
        if (N.l == null && N.r == null) {
            return T;
        }
        var lt = (N.l == null) ? T : helper(new Tuple(N.l, T.depth + 1));
        var rt = (N.r == null) ? T : helper(new Tuple(N.r, T.depth + 1));
        return (lt.depth > rt.depth) ? lt : rt;
    }

    static class Node {
        char val;

        Node l, r;

        Node(char val) {
            this.val = val;
        }
    }

    private class Tuple {
        Node node;

        int depth;

        Tuple(Node node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
}
