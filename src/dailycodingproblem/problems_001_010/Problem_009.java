package dailycodingproblem.problems_001_010;

import annotation.DynamicProgramming;
import annotation.DynamicProgramming.Type;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 Problem #9 [Hard] - Airbnb
 */
class Problem_009 {
    class Rec {
        int sum(int[] A) {
            return helper(0, A);
        }

        int helper(int n, int[] A) {
            var len = A.length;
            if (len == 1) return n + A[0];
            if (len == 2) return n + Math.max(A[0], A[1]);
            var A1 = Arrays.copyOfRange(A, 2, len);
            var A2 = Arrays.copyOfRange(A, 1, len);
            return n + Math.max(helper(A[0], A1), helper(0, A2));
        }
    }

    @DynamicProgramming(Type.MEMOIZATION)
    class Mem {
        Map<Integer, Integer> M = new HashMap<>();

        int sum(int[] A) {
            return helper(0, A);
        }

        int helper(int n, int[] A) {
            if (M.containsKey(n)) {
                return M.get(n);
            } else {
                var len = A.length;
                int sum;
                if (len == 1) {
                    sum = n + A[0];
                } else if (len == 2) {
                    sum = n + Math.max(A[0], A[1]);
                } else {
                    var A1 = Arrays.copyOfRange(A, 2, len);
                    var A2 = Arrays.copyOfRange(A, 1, len);
                    sum = n + Math.max(helper(A[0], A1), helper(0, A2));
                }
                M.put(n, sum);
                return sum;
            }
        }
    }

    @DynamicProgramming(Type.TABULATION)
    class Tab {
        int sum(int[] A) {
            var len = A.length;
            var B = new int[len];
            for (var i = 1; i <= len; i++) {
                int sum;
                var j = len - i;
                if (i == 1) {
                    sum = A[j];
                } else if (i == 2) {
                    sum = Math.max(A[j], A[j + 1]);
                } else {
                    sum = Math.max(A[j] + B[j + 2], B[j + 1]);
                }
                B[j] = sum;
            }
            return B[0];
        }
    }
}
