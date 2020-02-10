package dailycodingproblem.problems_141_150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 Problem #141 [Hard] - Microsoft
 */
class Problem_141 {
    static class ListStack<T> {
        List<T> L = new ArrayList<>();

        Map<Integer, Integer> M = new HashMap<>() {{
            put(0, 0);
            put(1, 0);
            put(2, 0);
        }};

        void push(T t, int i) {
            L.add(getOffset(i), t);
            increment(i);
        }

        T pop(int i) {
            var t = L.remove(getOffset(i));
            decrement(i);
            return t;
        }

        private int getOffset(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return M.get(0);
                case 2:
                    return M.get(0) + M.get(1);
                default:
                    throw new RuntimeException();
            }
        }

        private void increment(int i) {
            M.put(i, M.get(i) + 1);
        }

        private void decrement(int i) {
            M.put(i, M.get(i) - 1);
        }

        @Override
        public String toString() {
            return L.toString();
        }
    }
}
