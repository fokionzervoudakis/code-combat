package interviewcake.section_03;

import annotation.Pattern;
import annotation.Pattern.Type;
import annotation.PseudoRandom;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 Links:
 <ul>
 <li>{@link interviewcake.section_12.Problem_03}
 <li>{@link dailycodingproblem.problems_051_060.Problem_051}
 </ul>
 */
public class Problem_05 {
    private Random rand = new Random();

    /**
     Uses the Fisher-Yates (in-place) shuffle to generate a pseudo-random
     permutation of {@code A}. The number of possible permutations is the
     factorial of the length of {@code A}.
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A the input array
     */
    @Pattern(Type.GREEDY)
    @PseudoRandom
    void shuffle(int[] A) {
        for (int i = 0; i < A.length - 1; i++) { // O(n)
            int j = getRandom(i, A.length - 1);
            int n = A[i];
            A[i] = A[j];
            A[j] = n;
        }
    }

    private int getRandom(int min, int max) {
        return rand.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        var A = IntStream.range(0, 10).toArray();
        var P = new Problem_05();
        for (var i = 0; i < 100; i++) {
            var B = A.clone();
            P.shuffle(B);
            System.out.println(Arrays.toString(B));
        }
    }
}
