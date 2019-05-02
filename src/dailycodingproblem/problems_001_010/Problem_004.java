package dailycodingproblem.problems_001_010;

import annotation.Favorite;
import annotation.InPlace;

/**
 Problem #4 [Hard] - Stripe
 */
class Problem_004 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of numbers
     @return the lowest positive integer that does not exist in {@code A}
     */
    @InPlace
    @Favorite
    int firstMissing(int[] A) {
        // Move each positive integer to its corresponding one-based index position.
        // For example: [3, 4, -1, 1] => [1, -1, 3, 4]
        var len = A.length;
        var i = 0;
        while (i < len) { // O(n)
            var j = A[i] - 1;
            if (A[i] > 0 && A[i] <= len && A[i] != A[j]) {
                var n = A[i];
                A[i] = A[j];
                A[j] = n;
            } else {
                i++;
            }
        }

        // Return either the first integer that does not match its one-based index position...
        for (i = 0; i < len; i++) { // O(n)
            if (A[i] != i + 1) {
                return i + 1;
            }
        }

        // or the length of the array plus one if all integers match their respective positions.
        return len + 1;
    }
}
