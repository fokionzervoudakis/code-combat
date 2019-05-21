package interviewcake.section_12;

import annotation.PseudoRandom;

import java.util.HashMap;
import java.util.Random;

/**
 {@link dailycodingproblem.problems_071_080.Problem_071}
 */
public class Problem_04 {
    private Random R = new Random();

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n) where n=5/7
     <li>time_worst=O(infinity)
     <li>space_worst=O(1)
     </ul>

     @return a pseudo-random integer between one and five inclusive
     */
    @PseudoRandom
    int rand5() {
        var n = 7;
        while (n > 5) {
            n = rand7();
        }
        return n;
    }

    private int rand7() {
        int min = 1, max = 7;
        return R.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        var max = 10000;
        var P = new Problem_04();
        var M = new HashMap<Integer, Double>();
        for (var i = 0; i < max; i++) {
            var n = P.rand5();
            M.put(n, M.containsKey(n) ? M.get(n) + 1 : 1);
        }
        for (var E : M.entrySet()) {
            M.put(E.getKey(), E.getValue() / max);
        }
        System.out.println(M);
    }
}
