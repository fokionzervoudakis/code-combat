package leetcode.problems_0101_0110;

import java.util.ArrayList;
import java.util.List;

class Problem_0102 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param N1 the root of a binary tree
     @return the level order traversal of {@code N1}'s node values (i.e. level by
     level from left to right)
     */
    List<List<Integer>> levelOrder(Node N1) {
        List<List<Integer>> L = new ArrayList<>();
        List<List<Node>> Q = new ArrayList<>();
        Q.add(new ArrayList<>() {{
            add(N1);
        }});
        while (!Q.isEmpty()) {
            List<Node> curr = Q.remove(0);
            List<Node> next = new ArrayList<>();
            List<Integer> valList = new ArrayList<>();
            for (Node N2 : curr) {
                if (N2 == null) {
                    continue;
                }
                next.add(N2.l);
                next.add(N2.r);
                valList.add(N2.val);
            }
            if (!next.isEmpty()) {
                Q.add(next);
                L.add(valList);
            }
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
