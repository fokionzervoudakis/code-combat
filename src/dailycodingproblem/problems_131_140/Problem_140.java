package dailycodingproblem.problems_131_140;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 Problem #140 [Medium] - Facebook
 */
class Problem_140 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>
     */
    int[] singleNumber(int[] A) {
        Set<Integer> S = new LinkedHashSet<>();
        for (int n : A) { // O(n)
            if (S.contains(n)) {
                S.remove(n); // O(1)
            } else {
                S.add(n); // O(1)
            }
        }
        int[] B = new int[2];
        int i = 0;
        for (int n : S) {
            B[i++] = n;
        }
        return B;
    }
}
