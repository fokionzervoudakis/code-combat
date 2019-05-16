package dailycodingproblem.problems_061_070;

import annotation.PseudoRandom;

import java.util.HashMap;
import java.util.Random;

/**
 Problem #66 [Medium] - Square
 */
class Problem_066 {
    /**
     Implements the Von Neumann randomness extractor for producing a uniform
     distribution from nonuniform input.
     <p>For example, the probability of deriving heads/tails from a coin toss is
     {@code P(H)=p} and {@code P(T)=1-p=q}.
     <p>If a biased coin with {@code p=0.6} is tossed twice and cases {@code HH}
     and {@code TT} are discarded, then {@code HT} and {@code TH} will occur with
     equal probabilities:
     <ul>
     <li>{@code P(HH)=P(H)xP(H)=0.36}
     <li>{@code P(TT)=P(T)xP(T)=0.16}
     <li>{@code P(HT)=P(H)xP(T)=(1-P(HH)+P(TT))/2=0.24}
     <li>{@code P(TH)=P(T)xP(H)=(1-P(HH)+P(TT))/2=0.24}
     </ul>
     <p>Asymptotic analysis:
     <ul>
     <li>time_worst=O(1/pq)
     <li>space_worst=O(1)
     </ul>

     @param R a pseudo random numbers generator
     @return a uniformly distributed pseudo random number
     */
    @PseudoRandom
    private static int tossUnbiased(Random R) {
        while (true) {
            int m = tossBiased(R), n = tossBiased(R);
            if (m != n) {
                return m;
            }
        }
    }

    private static int tossBiased(Random R) {
        return rand(R, 0, 100) < 80 ? 0 : 1;
    }

    private static int rand(Random R, int min, int max) {
        return R.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        var max = 10000;

        var R = new Random();

        var M1 = new HashMap<Integer, Double>();
        var M2 = new HashMap<Integer, Double>();

        for (var i = 0; i < max; i++) {
            int m = tossBiased(R), n = tossUnbiased(R);
            M1.put(m, M1.containsKey(m) ? M1.get(m) + 1 : 1);
            M2.put(n, M2.containsKey(n) ? M2.get(n) + 1 : 1);
        }

        for (var E : M1.entrySet()) {
            M1.put(E.getKey(), E.getValue() / max);
        }

        for (var E : M2.entrySet()) {
            M2.put(E.getKey(), E.getValue() / max);
        }

        System.out.println(M1);
        System.out.println(M2);
    }
}
