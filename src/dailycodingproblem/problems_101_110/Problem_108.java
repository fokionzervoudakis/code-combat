package dailycodingproblem.problems_101_110;

/**
 Problem #108 [Easy] - Google
 */
class Problem_108 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A a character array
     @param B another character array
     @return true if {@code A} can be shifted to derive {@code B}, else false
     */
    boolean canShift(char[] A, char[] B) {
        int n = A.length, i = 0, j = 0;
        while (A[i] != B[j]) { // O(n)
            if (++j == n) {
                return false;
            }
        }
        int k = 0;
        while (k++ < n) { // O(n)
            if ((A[i] != B[j])) {
                return false;
            }
            if (++i == n) {
                i = 0;
            }
            if (++j == n) {
                j = 0;
            }
        }
        return true;
    }
}
