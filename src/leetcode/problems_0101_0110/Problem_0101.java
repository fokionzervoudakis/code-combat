package leetcode.problems_0101_0110;

import java.util.ArrayList;
import java.util.List;

class Problem_0101 {
    class Inversion {
        /**
         Asymptotic analysis:
         <ul>
         <li>time_worst=O(n)
         <li>space_worst=O(n)
         </ul>

         @param N the root of a binary tree
         @return true of the tree with root {@code N} is symmetric, else false
         */
        boolean isSymmetric(Node N) {
            return inorder(N).equals(inorder(invert(N)));
        }

        private String inorder(Node N) {
            return inorder(N, "");
        }

        private String inorder(Node N, String str) {
            if (N == null) {
                str += null;
            } else {
                str += inorder(N.l, str);
                str += N.val;
                str += inorder(N.r, str);
            }
            return str;
        }

        private Node invert(Node N) {
            if (N == null) {
                return null;
            }
            Node l = invert(N.l);
            Node r = invert(N.r);
            N.r = l;
            N.l = r;
            return N;
        }
    }

    class Iteration {
        /**
         Asymptotic analysis:
         <ul>
         <li>time_worst=O(n)
         <li>space_worst=O(n)
         </ul>

         @param N1 the root of a binary tree
         @return true of the tree with root {@code N} is symmetric, else false
         */
        boolean isSymmetric(Node N1) {
            List<Node> L = new ArrayList<>();
            L.add(N1);
            L.add(N1);
            while (!L.isEmpty()) {
                Node N2 = L.remove(0);
                Node N3 = L.remove(0);
                if (N2 == null && N3 == null) {
                    continue;
                }
                if (N2 == null || N3 == null) {
                    return false;
                }
                if (N2.val != N3.val) {
                    return false;
                }
                L.add(N2.l);
                L.add(N3.r);
                L.add(N2.r);
                L.add(N3.l);
            }
            return true;
        }
    }

    static class Node {
        int val;
        Node l, r;

        Node(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return val + "";
        }
    }
}
