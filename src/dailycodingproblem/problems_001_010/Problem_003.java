package dailycodingproblem.problems_001_010;

import java.util.Stack;

/**
 Problem #3 [Medium] - Google
 */
class Problem_003 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_avg=O(log n)
     <li>space_worst=O(n)
     </ul>

     @param n the root node of a binary tree
     @return the string representation of {@code n}
     */
    String serialize(Node n) {
        return serialize(n, "");
    }

    private String serialize(Node n, String str) {
        if (n != null) {
            str += n.val + serialize(n.l, str) + serialize(n.r, str);
        }
        return str.isEmpty() ? str : '[' + str + ']';
    }

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param str a serialized binary tree
     @return the binary tree representation of {@code str}
     */
    Node deserialize(String str) {
        var S = new Stack<Node>();
        Node N = null;
        for (var token : tokenize(str)) { // O(n)
            if (token.equals("]")) {
                N = S.pop(); // O(1)
            } else {
                if (!token.equals("[")) {
                    var tmp = new Node(token);
                    if (!S.isEmpty()) {
                        var top = S.peek(); // O(1)
                        if (top.l == null) {
                            top.l = tmp;
                        } else {
                            top.r = tmp;
                        }
                    }
                    S.push(tmp); // O(1)
                }
            }
        }
        return N;
    }

    private String[] tokenize(String str) {
        return str.split("((?<=\\[)|(?=\\[)|(?<=])|(?=]))");
    }

    static class Node {
        String val;

        Node l, r;

        Node(String val, Node l, Node r) {
            this.val = val;
            this.l = l;
            this.r = r;
        }

        Node(String val) {
            this(val, null, null);
        }
    }
}
