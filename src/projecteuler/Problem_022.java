package projecteuler;

import java.util.Collections;
import java.util.List;

/**
 * Problem 22 - names scores
 */
class Problem_022 {
    long nameScoreTotal(List<String> L) {
        Collections.sort(L);
        long sum = 0;
        for (int i = 0; i < L.size(); i++) {
            int val = 0;
            for (char c : L.get(i).toCharArray()) {
                val += c - 64;
            }
            sum += val * (i + 1);
        }
        return sum;
    }
}
