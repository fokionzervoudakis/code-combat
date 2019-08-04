package dailycodingproblem.problems_131_140;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 Problem #134 [Easy] - Facebook
 */
class Problem_134 {
    static class SparseArray {
        private final Map<Integer, Integer> M = new LinkedHashMap<>();

        private final int size;

        private int count = 0;

        SparseArray(int[] A, int size) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] != 0) {
                    M.put(i, A[i]);
                }
            }
            this.size = size;
        }

        void set(int i, int val) {
            if (val == 0) {
                M.remove(i);
                count--;
            } else {
                if (count == size) {
                    throw new RuntimeException();
                } else {
                    M.put(i, val);
                    count++;
                }
            }
        }

        Integer get(int i) {
            return M.get(i);
        }

        @Override
        public String toString() {
            return M.toString();
        }
    }
}
