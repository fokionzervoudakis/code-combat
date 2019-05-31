package leetcode.problems_0441_0450;

import java.util.ArrayList;
import java.util.List;

class Problem_0448 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of integers where {@code 1 <= a[i] <= A.length}
     @return the elements [1, n] that are not in {@code A}
     */
    List<Integer> findDisappearedNumbers(int[] A) {
        for (int i = 0; i < A.length; i++) { // O(n)
            A[Math.abs(A[i]) - 1] = -Math.abs(A[Math.abs(A[i]) - 1]);
        }
        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < A.length; i++) { // O(n)
            if (A[i] > 0) {
                L.add(i + 1);
            }
        }
        return L;
    }
}
