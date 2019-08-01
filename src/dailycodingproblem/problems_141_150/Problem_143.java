package dailycodingproblem.problems_141_150;

import java.util.ArrayList;
import java.util.List;

/**
 Problem #143 [Medium] - Amazon
 */
class Problem_143 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>
     */
    List<Integer> partition(int[] A, int pivot) {
        var L = new ArrayList<Integer>();
        for (var n : A) { // O(n)
            if (n < pivot) {
                L.add(n);
            }
        }
        for (var n : A) { // O(n)
            if (n == pivot) {
                L.add(n);
            }
        }
        for (var n : A) { // O(n)
            if (n > pivot) {
                L.add(n);
            }
        }
        return L;
    }
}
