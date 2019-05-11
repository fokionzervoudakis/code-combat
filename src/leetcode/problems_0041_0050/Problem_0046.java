package leetcode.problems_0041_0050;

import java.util.ArrayList;
import java.util.List;

/**
 {@link interviewcake.section_06.Problem_01}
 */
public class Problem_0046 {
    private List<List<Integer>> L = new ArrayList<>();

    List<List<Integer>> permute(int[] A) {
        helper(A, A.length);
        return L;
    }

    private void helper(int[] A, int n) {
        if (n == 0) {
            List<Integer> tmp = new ArrayList<>();
            for (int i : A) {
                tmp.add(i);
            }
            L.add(tmp);
        } else {
            int m = n - 1;
            helper(A, m);
            for (int i = 0; i < m; i++) {
                int j = (n % 2 == 0) ? i : 0;
                swap(A, j, m);
                helper(A, m);
            }
        }
    }

    private void swap(int[] A, int i, int j) {
        int n = A[i];
        A[i] = A[j];
        A[j] = n;
    }
}
