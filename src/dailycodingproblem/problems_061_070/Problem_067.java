package dailycodingproblem.problems_061_070;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 Problem #67 [Hard] - Google
 <p>{@link dailycodingproblem.problems_051_060.Problem_052}
 */
// TODO test
public class Problem_067 {
    /**
     Asymptotic analysis:
     <ul>
     <li>space_avg=O(n)
     <li>insert_agv=O(1)
     <li>lookup_avg=O(1)
     <li>delete_avg=O(1)
     <li>space_worst=O(n)
     <li>insert_worst=O(n)
     <li>lookup_worst=O(n)
     <li>delete_worst=O(n)
     </ul>

     @param <K> the key type
     @param <V> the value type
     */
    class Lfu<K, V> {
        private Map<K, Node<K, V>> M = new HashMap<>();

        private FreqNode<K> hed = new FreqNode<>(-1);

        void set(K k, V v) {
            if (M.containsKey(k)) {
                return;
            }
            var lfu = hed.next;
            if (lfu.value != 1) {
                lfu = new FreqNode<>(1);
                add(lfu);
            }
            lfu.items.add(k);
            M.put(k, new Node<>(v, lfu));
        }

        V get(K k) {
            if (!M.containsKey(k)) {
                return null;
            }
            var node = M.get(k);
            FreqNode<K> parent = node.parent, next = parent.next;
            if (next.value != parent.value + 1) {
                // TODO next_freq <- GET-NEW-NODE(freq.value + 1, freq, next_freq)
            }
            next.items.add(k);
            node.parent = next;
            parent.items.remove(k);
            if (parent.items.isEmpty()) {
                remove(parent);
            }
            return node.v;
        }

        private void add(FreqNode<K> n) {
            var next = hed.next;
            next.prev = n;
            hed.next = n;
            n.prev = hed;
            n.next = next;
        }

        private void remove(FreqNode<K> n) {
            FreqNode prev = n.prev, next = n.next;
            next.prev = prev;
            prev.next = next;
        }
    }

    class FreqNode<K> {
        int value;

        Set<K> items = new LinkedHashSet<>(); // Order for determinism.

        FreqNode<K> prev, next;

        FreqNode(int value) {
            this.value = value;
        }
    }

    class Node<K, V> {
        V v;

        FreqNode<K> parent;

        Node(V v, FreqNode<K> parent) {
            this.v = v;
            this.parent = parent;
        }
    }
}
