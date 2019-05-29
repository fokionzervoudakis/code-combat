package dailycodingproblem.problems_071_080;

/**
 Problem #79 [Medium] - Facebook
 */
class Problem_079 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of integers
     @return true of {@code A} can be ordered with one edit, else false
     */
    boolean canEdit(int[] A) {
        boolean edited = false;
        for (int i = 0; i < A.length - 1; i++) { // O(n)
            if (A[i] > A[i + 1]) {
                if (edited) {
                    return false;
                } else {
                    edited = true;
                }
            }
        }
        return true;
    }
}
