package dailycodingproblem.problems_011_020;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 Problem #11 [Medium] - Twitter
 */
class Problem_011 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(nk)
     <li>space_worst=O(nk)
     </ul>

     @param A an array of possible query strings
     @param str a query string
     @return a list of all strings in {@code A} that have {@code str} as a prefix
     */
    List<String> prefix(String[] A, String str) {
        var T = new Trie();
        for (var S : A) { // O(n)
            T.insert(S); // O(k)
        }
        var L = new ArrayList<String>();
        var N = T.lookup(str); // O(k)
        if (N != null) {
            var Q = new ArrayList<Node>();
            Q.add(N); // O(1)
            while (!Q.isEmpty()) { // O(nk)
                N = Q.remove(0); // O(n)
                for (var child : N.children()) { // O(n)
                    Q.add(child); // O(1)
                    var val = child.val;
                    if (val != null) {
                        L.add(val); // O(1)
                    }
                }
            }
        }
        return L;
    }

    class Trie {
        Node root = new Node();

        void insert(String str) {
            var n = root;
            for (var c : str.toCharArray()) {
                if (!n.contains(c)) {
                    n.put(c);
                }
                n = n.get(c);
            }
            n.val = str;
        }

        Node lookup(String str) {
            var n = root;
            for (var c : str.toCharArray()) {
                if (n.contains(c)) {
                    n = n.get(c);
                } else {
                    return null;
                }
            }
            return n;
        }
    }

    class Node {
        Map<Character, Node> M = new HashMap<>();

        String val;

        boolean contains(char c) {
            return M.containsKey(c);
        }

        Node get(char c) {
            return M.get(c);
        }

        void put(char c) {
            M.put(c, new Node());
        }

        Collection<Node> children() {
            return M.values();
        }
    }
}
