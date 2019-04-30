package interviewcake.section_07;

import java.util.Stack;

class Problem_02 {
    /**
     A <em>first in, first out</em> (FIFO) data structure backed by two stacks.
     <ul>
     <li>space_worst=O(n)
     <li>enqueue_avg=O(1)
     <li>dequeue_avg=O(1)
     <li>dequeue_worst=O(n)
     </ul>
     */
    class Queue<T> {
        private final Stack<T> in = new Stack<>();
        private final Stack<T> out = new Stack<>();

        void enqueue(T t) {
            in.push(t);
        }

        T dequeue() {
            if (out.isEmpty()) {
                while (!in.isEmpty()) {
                    out.push(in.pop());
                }
                if (out.isEmpty()) {
                    return null;
                }
            }
            return out.pop();
        }
    }
}
