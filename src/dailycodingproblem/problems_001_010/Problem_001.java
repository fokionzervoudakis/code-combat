package dailycodingproblem.problems_001_010;

import annotation.OnePass;
import annotation.pattern.HashTable;

import java.util.HashSet;

/**
 Problem #1 [Easy] - Google
 */
class Problem_001 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param A an array of numbers
     @param k a target number
     @return true if any two numbers in {@code A} add to {@code k}, else false
     */
    @HashTable
    @OnePass
    boolean addUp(int[] A, int k) {
        var S = new HashSet<>();
        for (var n : A) { // O(n)
            if (S.contains(Math.abs(n - k))) { // O(1)
                return true;
            } else {
                S.add(n); // O(1)
            }
        }
        return false;
    }
}
