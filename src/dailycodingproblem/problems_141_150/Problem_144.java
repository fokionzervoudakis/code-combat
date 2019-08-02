package dailycodingproblem.problems_141_150;

/**
 Problem #144 [Medium] - Google
 */
class Problem_144 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>
     */
    Integer nearestLarger(int[] A, int i) {
        int l = i - 1, r = i + 1;
        boolean foundL = false, foundR = false;
        while (l >= 0) { // O(n)
            if (A[l] > A[i]) {
                foundL = true;
                break;
            } else {
                l--;
            }
        }
        while (r < A.length) { // O(n)
            if (A[r] > A[i]) {
                foundR = true;
                break;
            } else {
                r++;
            }
        }
        if (foundL && foundR) {
            return Math.min(i - l, r - i);
        } else if (foundL) {
            return l;
        } else if (foundR) {
            return r;
        } else {
            return null;
        }
    }
}
