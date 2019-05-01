package interviewcake.section_06;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class Problem_01 {
    List<char[]> L = new ArrayList<>();

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n!)
     <li>space_worst=O(n)
     </ul>

     @param str the target string
     @return all possible permutations of {@code str}
     */
    Set<String> getPermutations(String str) {
        getPermutations(str.toCharArray(), str.length());
        Set<String> S = new LinkedHashSet<>(); // Order for test determinism.
        L.forEach(A -> S.add(new String(A)));
        return S;
    }

    private void getPermutations(char[] A, int n) {
        if (n == 0) {
            L.add(A.clone());
        } else {
            int m = n - 1;
            getPermutations(A, m);
            for (int i = 0; i < m; i++) {
                int j = (n % 2 == 0) ? i : 0;
                swap(A, j, m);
                getPermutations(A, m);
            }
        }
    }

    private void swap(char[] A, int i, int j) {
        char c = A[i];
        A[i] = A[j];
        A[j] = c;
    }
}
