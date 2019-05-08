package dailycodingproblem.problems_011_020;

import java.util.ArrayList;
import java.util.List;

/**
 Problem #17 [Hard] - Google
 */
class Problem_017 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param str a valid string representation of a file system
     @return the length of the longest absolute path to a file in the abstracted
     file system, or 0 if there is no file in the system
     */
    int maxFilepath(String str) {
        return getLength(getMax(getRoot(str)));
    }

    private Node getRoot(String str) {
        var i = 0;
        Node curr = null;
        for (var sub : str.split("\n")) { // O(n)
            var A = sub.split("\t");
            var j = A.length - 1;
            var tmp = new Node(A[j]);
            if (curr == null) {
                curr = tmp;
            } else {
                if (j > i) {
                    i++;
                } else if (j < i) {
                    curr = curr.p.p;
                    i--;
                } else {
                    curr = curr.p;
                }
                tmp.p = curr;
                curr.add(tmp);
                curr = tmp;
            }
        }
        assert curr != null;
        while (curr.p != null) {
            curr = curr.p;
        }
        return curr;
    }

    private Node getMax(Node root) {
        var Q = new ArrayList<Node>();
        Q.add(root);
        var max = root;
        while (!Q.isEmpty()) { // O(V+E)
            var parent = Q.remove(0);
            for (var child : parent.children) {
                child.len += parent.len;
                if (child.len > max.len) {
                    max = child;
                }
                Q.add(child);
            }
        }
        return max;
    }

    private int getLength(Node n) {
        var len = 0;
        if (n.val.endsWith(".ext")) {
            while (n != null) { // O(n)
                len += n.val.length();
                n = n.p;
                if (n != null) {
                    len++;
                }
            }
        }
        return len;
    }

    private class Node {
        String val;
        int len;

        List<Node> children = new ArrayList<>();

        Node p;

        Node(String val) {
            this.val = val;
            this.len = val.length();
        }

        void add(Node n) {
            children.add(n);
        }

        @Override
        public String toString() {
            return val + " -> " + children;
        }
    }
}
