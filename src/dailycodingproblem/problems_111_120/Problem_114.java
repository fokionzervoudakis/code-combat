package dailycodingproblem.problems_111_120;

import annotation.InPlace;

import java.util.LinkedList;
import java.util.Set;

/**
 Problem #114 [Hard] - Facebook
 */
class Problem_114 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>
     */
    @InPlace
    void reverse(char[] A, Set<Character> S) {
        var L = new LinkedList<Character>();
        for (char c : A) {
            if (S.contains(c)) {
                L.addLast(c);
            }
        }
        reverse(A, 0, A.length - 1); // O(n)
        int i = 0;
        for (int j = 1; j < A.length; j++) { // O(n)
            if (S.contains(A[j])) {
                reverse(A, i, j - 1);
                i = j + 1;
                A[j] = L.removeFirst();
            }
        }
        reverse(A, i, A.length - 1); // O(n)
    }

    private void reverse(char[] A, int l, int r) {
        while (l < r) { // O(n)
            swap(A, l++, r--);
        }
    }

    private void swap(char[] A, int i, int j) {
        char n = A[i];
        A[i] = A[j];
        A[j] = n;
    }
}
