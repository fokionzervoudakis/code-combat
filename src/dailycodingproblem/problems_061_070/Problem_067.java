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

        private int len;

        Lfu(int len) {
            this.len = len;
        }

        void set(K k, V v) {
            if (M.containsKey(k)) {
                return;
            }
            var lfu = hed.next;
            if (lfu.val != 1) {
                lfu = new FreqNode<>(1);
                add(lfu);
            }
            lfu.S.add(k);
            M.put(k, new Node<>(v, lfu));
        }

        V get(K k) {
            return null; // TODO
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
        int val;

        Set<K> S = new LinkedHashSet<>(); // Order for determinism.

        FreqNode<K> prev, next;

        FreqNode(int val) {
            this.val = val;
        }
    }

    class Node<K, V> {
        V v;

        FreqNode<K> p;

        Node(V v, FreqNode<K> p) {
            this.v = v;
        }
    }
}
