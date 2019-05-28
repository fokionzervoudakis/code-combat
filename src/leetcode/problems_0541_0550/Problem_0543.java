package leetcode.problems_0541_0550;

class Problem_0543 {
    private int d = 0;

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param N the root of a tree
     @return the diameter of the tree with root {@code N}
     */
    int diameter(Node N) {
        if (N == null) {
            return 0;
        }
        height(N);
        return d;
    }

    private int height(Node N) {
        if (N == null) {
            return 0;
        }
        int l = height(N.l), r = height(N.r);
        d = Math.max(d, l + r);
        return 1 + Math.max(l, r);
    }

    static class Node {
        Node l, r;
    }
}
