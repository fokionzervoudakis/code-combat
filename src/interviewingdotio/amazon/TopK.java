package interviewingdotio.amazon;

import annotation.Pattern;
import annotation.Pattern.Type;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/**
 https://interviewing.io/recordings/C++-Amazon-1
 */
class TopK {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n log k)
     <li>space_worst=O(k)
     </ul>

     @param A a non-empty array of integers
     @param k the number of most frequent elements in {@code A}
     @return the {@code k} of most frequent elements in {@code A}
     */
    @Pattern(Type.HASH_TABLE)
    List<Integer> getToK(int[] A, int k) {
        if (k < 1) {
            return new ArrayList<>();
        }
        var M = new HashMap<Integer, Integer>();
        for (var n : A) {
            M.put(n, (M.containsKey(n)) ? M.get(n) + 1 : 1);
        }
        var H = new PriorityQueue<Node>(Comparator.comparingDouble(o -> o.count));
        for (var E : M.entrySet()) {
            var count = E.getValue();
            if (H.size() == k) {
                var first = H.peek();
                if (count > first.count) {
                    H.remove(first);
                    H.add(new Node(E.getKey(), count));
                }
            } else {
                H.add(new Node(E.getKey(), count));
            }
        }
        var L2 = new ArrayList<Integer>();
        H.forEach(node -> L2.add(0, node.val));
        return L2;
    }

    private class Node {
        int val;
        int count;

        Node(int val, int count) {
            this.val = val;
            this.count = count;
        }
    }
}
