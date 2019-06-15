package dailycodingproblem.problems_091_100;

import java.util.ArrayList;
import java.util.List;

/**
 Problem #96 [Easy] - Microsoft
 */
class Problem_096 {
    List<List<Integer>> L = new ArrayList<>();

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n!)
     <li>space_worst=O(n)
     </ul>

     @param A the target array
     @return all possible permutations of {@code A}
     */
    List<List<Integer>> generate(int[] A) {
        helper(A, A.length);
        return L;
    }

    private void helper(int[] A, int n) {
        if (n == 0) {
            var tmp = new ArrayList<Integer>();
            for (var m : A) {
                tmp.add(m);
            }
            L.add(tmp);
        } else {
            var m = n - 1;
            helper(A, m);
            for (var i = 0; i < m; i++) {
                var j = (n % 2 == 0) ? i : 0;
                swap(A, j, m);
                helper(A, m);
            }
        }
    }

    private void swap(int[] A, int i, int j) {
        var n = A[i];
        A[i] = A[j];
        A[j] = n;
    }
}
