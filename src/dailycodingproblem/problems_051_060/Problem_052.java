package dailycodingproblem.problems_051_060;

import java.util.HashMap;
import java.util.Map;

/**
 Problem #52 [Hard] - Google
 */
class Problem_052 {
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
    class Lru<K, V> {
        private Map<K, Node<K, V>> M = new HashMap<>();

        private Node<K, V> hed = new Node<>(null, null);
        private Node<K, V> tail = new Node<>(null, null);

        private int len;

        Lru(int len) {
            this.len = len;
            this.hed.next = this.tail;
            this.tail.prev = this.hed;
        }

        void set(K k, V v) {
            if (M.containsKey(k)) {
                remove(M.get(k));
            }
            var n = new Node<>(k, v);
            add(n);
            M.put(k, n);
            if (M.size() > len) {
                remove(M.remove(hed.next.k));
            }
        }

        V get(K k) {
            if (M.containsKey(k)) {
                var n = M.get(k);
                remove(n);
                add(n);
                return n.v;
            } else {
                return null;
            }
        }

        private void add(Node<K, V> n) {
            var prev = tail.prev;
            prev.next = n;
            tail.prev = n;
            n.prev = prev;
            n.next = tail;
        }

        private void remove(Node<K, V> n) {
            var prev = n.prev;
            var next = n.next;
            prev.next = next;
            next.prev = prev;
        }
    }

    class Node<K, V> {
        K k;
        V v;

        Node<K, V> prev, next;

        Node(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }
}
