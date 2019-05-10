package leetcode.problems_0011_0020;

import annotation.Favorite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Problem_0015 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^2)
     <li>space_worst=O(n)
     </ul>

     @param A an array of integers
     @return a list of unique integer lists with three elements from {@code A}
     that sum to zero
     */
    @Favorite
    List<List<Integer>> threeSum(int[] A) {
        Set<List<Integer>> S = new HashSet<>();
        Arrays.sort(A); // O(n log n)
        int n = A.length;
        for (int i = 0; i < n - 2; i++) { // O(n)
            int l = i + 1, r = n - 1;
            while (l < r) { // O(n)
                int a = A[i], b = A[l], c = A[r];
                int sum = a + b + c;
                if (sum == 0) {
                    S.add(Arrays.asList(a, b, c));
                    l++;
                    r--;
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }

        }
        return new ArrayList<>(S);
    }
}
