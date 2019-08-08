package dailycodingproblem.problems_131_140;

import java.util.Iterator;

/**
 Problem #139 [Medium] - Google
 */
class Problem_139 {
    static class PeekInterface<T> {
        private Iterator<T> iterator;

        private T next;

        PeekInterface(Iterator<T> iterator) {
            this.iterator = iterator;
        }

        boolean hasNext() {
            return next != null || iterator.hasNext();
        }

        T next() {
            T t = null;
            if (next != null) {
                t = next;
                next = null;
            } else if (iterator.hasNext()) {
                t = iterator.next();
            }
            return t;
        }

        T peek() {
            if (next == null && iterator.hasNext()) {
                next = iterator.next();
            }
            return next;
        }
    }
}
