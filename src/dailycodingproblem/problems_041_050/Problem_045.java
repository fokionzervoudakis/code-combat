package dailycodingproblem.problems_041_050;

import annotation.PseudoRandom;

import java.util.HashMap;
import java.util.Random;

/**
 Problem #45 [Easy] - Two Sigma
 */
class Problem_045 {
    private Random R = new Random();

    private int[][] A = {
            { 1, 2, 3, 4, 5 },
            { 6, 7, 1, 2, 3 },
            { 4, 5, 6, 7, 1 },
            { 2, 3, 4, 5, 6 },
            { 7, 0, 0, 0, 0 }
    };

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n) where n=25/21
     <li>space_worst=O(1)
     </ul>

     @return a pseudo-random integer between one and seven inclusive
     */
    @PseudoRandom
    int rand7() {
        while (true) {
            var n = A[rand5() - 1][rand5() - 1];
            if (n > 0) {
                return n;
            }
        }
    }

    private int rand5() {
        int min = 1, max = 5;
        return R.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        var max = 10000;
        var P = new Problem_045();
        var M = new HashMap<Integer, Double>();
        for (var i = 0; i < max; i++) {
            var n = P.rand7();
            M.put(n, M.containsKey(n) ? M.get(n) + 1 : 1);
        }
        for (var E : M.entrySet()) {
            M.put(E.getKey(), E.getValue() / max);
        }
        System.out.println(M);
    }
}
