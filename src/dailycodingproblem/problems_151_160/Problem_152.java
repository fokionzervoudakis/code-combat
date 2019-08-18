package dailycodingproblem.problems_151_160;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

/**
 Problem #152 [Medium] - Triplebyte
 */
class Problem_152 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>
     */
    int generate(int[] A, double[] B) {
        var L = new ArrayList<>();
        int total = 0;
        for (var n : B) { // O(n)
            L.add(total += n * 100);
        }
        int rand = rand(new Random(), 0, 100);
        int i = Arrays.binarySearch(L.toArray(), rand); // O(log n)
        return A[i < 0 ? -(i + 1) : i];
    }

    private static int rand(Random R, int min, int max) {
        return R.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        var max = 10000;
        var A = new int[] { 1, 2, 3, 4 };
        var B = new double[] { 0.1, 0.5, 0.2, 0.2 };
        var P = new Problem_152();
        var M = new HashMap<Integer, Double>();
        for (var i = 0; i < max; i++) {
            var n = P.generate(A, B);
            M.put(n, M.containsKey(n) ? M.get(n) + 1 : 1);
        }
        for (var E : M.entrySet()) {
            M.put(E.getKey(), E.getValue() / max);
        }
        System.out.println(M);
    }
}
