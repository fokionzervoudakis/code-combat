package leetcode.problems_0031_0040;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Problem_0039 {
    List<List<Integer>> L = new ArrayList<>();

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param A an array of unique positive integers
     @param t a target integer
     @return a list of all unique combinations in {@code A} where the integers
     sum to {@code t}
     */
    List<List<Integer>> combinationSum(int[] A, int t) {
        helper(A, t, 0, new LinkedList<>());
        return L;
    }

    private void helper(int[] A, int t, int i, Deque<Integer> D) {
        if (t == 0) {
            L.add(new ArrayList<>(D)); // O(n)
        } else if (t > 0) {
            for (int j = i; j < A.length; j++) { // O(n)
                D.addLast(A[j]); // O(1)
                helper(A, t - A[j], j, D);
                D.removeLast(); // O(1)
            }
        }
    }
}
