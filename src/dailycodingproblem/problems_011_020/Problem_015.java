package dailycodingproblem.problems_011_020;

import annotation.PseudoRandom;

import java.util.HashMap;
import java.util.Random;
import java.util.stream.IntStream;

/**
 Problem #15 [Medium] - Facebook
 <p>
 https://www.dailycodingproblem.com/blog/how-to-pick-a-random-element-from-an-infinite-stream/
 */
class Problem_015 {
    private Random R = new Random();

    /**
     Uses Algorithm R to uniformly select a random element from {@code A}.
     <p>
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an integer array
     @return a random element selected uniformly from {@code A}
     */
    @PseudoRandom
    int pick(int[] A) {
        int i = 0, out = 0;
        for (var n : A) {
            if (i == 0 || rand(1, i + 1) == 1) {
                out = n;
            }
            i++;
        }
        return out;
    }

    private int rand(int min, int max) {
        return R.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        var max = 10000;
        var A = IntStream.range(0, 10).toArray();
        var P = new Problem_015();
        var M = new HashMap<Integer, Double>();
        for (var i = 0; i < max; i++) {
            var n = P.pick(A);
            M.put(n, M.containsKey(n) ? M.get(n) + 1 : 1);
        }
        for (var E : M.entrySet()) {
            M.put(E.getKey(), E.getValue() / max);
        }
        System.out.println(M);
    }
}
