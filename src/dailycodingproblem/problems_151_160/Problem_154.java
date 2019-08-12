package dailycodingproblem.problems_151_160;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 Problem #154 [Easy] - Amazon
 */
class Problem_154 {
    static class HeapStack {
        Queue<Node> Q = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.val, o1.val));

        void push(int item) {
            Q.add(new Node(Q.size(), item));
        }

        Integer pop() {
            return Q.isEmpty() ? null : Q.remove().item;
        }
    }

    static class Node {
        int val, item;

        Node(int val, int item) {
            this.val = val;
            this.item = item;
        }
    }
}
