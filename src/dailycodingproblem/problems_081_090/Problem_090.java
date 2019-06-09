package dailycodingproblem.problems_081_090;

import annotation.PseudoRandom;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 Problem #90 [Medium] - Google
 */
class Problem_090 {
    /**
     @param S a set of integers
     @param n a target integer
     @return a uniformly distributed pseudo random number between {@code 0} and
     {@code n - 1} that is not in {@code S}
     */
    @PseudoRandom
    private int rand(Set<Integer> S, int n) {
        var R = new Random();
        int m;
        while (true) {
            if (!S.contains(m = rand(R, 0, n - 1))) {
                return m;
            }
        }
    }

    private int rand(Random R, int min, int max) {
        return R.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        var max = 10000;
        var S = new HashSet<Integer>() {{
            add(1);
            add(3);
            add(5);
        }};
        var P = new Problem_090();
        var M = new HashMap<Integer, Double>();
        for (var i = 0; i < max; i++) {
            var n = P.rand(S, 6);
            M.put(n, M.containsKey(n) ? M.get(n) + 1 : 1);
        }
        for (var E : M.entrySet()) {
            M.put(E.getKey(), E.getValue() / max);
        }
        System.out.println(M);
    }
}
