package dailycodingproblem.problems_001_010;

import annotation.DataStructure;
import annotation.DataStructure.Type;

import java.util.Stack;

/**
 Problem #3 [Medium] - Google
 */
@DataStructure(Type.TREE)
class Problem_003 {
    String serialize(Node n) {
        return serialize(n, "");
    }

    private String serialize(Node n, String s) {
        if (n != null) {
            s += '[';
            s += n.val;
            s = serialize(n.l, s);
            s = serialize(n.r, s);
            s += ']';
        }
        return s;
    }

    Node deserialize(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        var tmp = s.substring(1, s.length() - 1);
        if (tmp.matches("^[a-z.]*$")) {
            return new Node(tmp);
        } else {
            var val = tmp.substring(0, tmp.indexOf('['));
            var children = tmp.substring(val.length());

            var i = leftRightDiv(children);

            var left = deserialize(children.substring(0, i + 1));
            var right = deserialize(children.substring(i + 1));

            return new Node(val, left, right);
        }
    }

    private int leftRightDiv(String s) {
        var stack = new Stack<Character>();
        for (var i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            if (c == '[') {
                stack.push(c);
            } else if (c == ']') {
                stack.pop();
                if (stack.isEmpty()) {
                    return i;
                }
            }
        }
        return -1;
    }

    static class Node {
        String val;
        Node l;
        Node r;

        Node(String val, Node l, Node r) {
            this.val = val;
            this.l = l;
            this.r = r;
        }

        Node(String val) {
            this(val, null, null);
        }

        @Override
        public String toString() {
            return val + '[' + l + ']' + '[' + r + ']';
        }
    }
}
