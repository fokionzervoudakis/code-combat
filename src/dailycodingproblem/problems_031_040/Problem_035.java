package dailycodingproblem.problems_031_040;

import annotation.InPlace;

/**
 Problem #35 [Hard] - Google
 */
class Problem_035 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A a character sequence
     */
    @InPlace
    void segregate(char[] A) {
        var n = A.length;
        var l = 0;
        while (l < n && A[l] == 'R') {
            l++;
        }
        for (var i = l + 1; i < n; i++) {
            if (A[i] == 'R') {
                swap(A, i, l++);
            }
        }
        for (var i = l + 1; i < n; i++) {
            if (A[i] == 'G') {
                swap(A, i, l++);
            }
        }
    }

    private void swap(char[] A, int i, int j) {
        var c = A[i];
        A[i] = A[j];
        A[j] = c;
    }
}
