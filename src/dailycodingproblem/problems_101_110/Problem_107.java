package dailycodingproblem.problems_101_110;

import java.util.ArrayList;
import java.util.List;

/**
 Problem #107 [Easy] - Microsoft
 */
class Problem_107 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param N the root of a binary tree
     @return a list of values in the binary tree with root {@code N} ordered by
     pre-order traversal
     */
    List<Integer> preOrder(Node N) {
        return preOrder(N, new ArrayList<>());
    }

    private List<Integer> preOrder(Node N, List<Integer> L) {
        if (N != null) {
            L.add(N.val);
            preOrder(N.l, L);
            preOrder(N.r, L);
        }
        return L;
    }

    static class Node {
        int val;
        Node l, r;

        Node(int val) {
            this.val = val;
        }
    }
}
