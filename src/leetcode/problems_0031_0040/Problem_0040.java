package leetcode.problems_0031_0040;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Problem_0040 {
    List<List<Integer>> L = new ArrayList<>();

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param A an array of positive integers
     @param t a target integer
     @return a list of all unique combinations in {@code A} where the integers
     sum to {@code t}
     */
    List<List<Integer>> combinationSum2(int[] A, int t) {
        Arrays.sort(A); // O(n log n)
        helper(A, t, 0, new LinkedList<>());
        return L;
    }

    private void helper(int[] A, int t, int i, Deque<Integer> D) {
        if (t == 0) {
            L.add(new ArrayList<>(D)); // O(n)
        } else if (t > 0) {
            for (int j = i; j < A.length; j++) { // O(n)
                if (j > i && A[j] == A[j - 1]) {
                    continue;
                }
                D.addLast(A[j]); // O(1)
                helper(A, t - A[j], j + 1, D);
                D.removeLast(); // O(1)
            }
        }
    }
}
