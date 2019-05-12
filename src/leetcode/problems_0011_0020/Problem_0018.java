package leetcode.problems_0011_0020;

import annotation.InPlace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 {@link leetcode.problems_0001_0010.Problem_0001}
 <p>{@link leetcode.problems_0011_0020.Problem_0015}
 */
public class Problem_0018 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^3)
     <li>space_worst=O(n)
     </ul>

     @param A an array of integers
     @param k a target sum
     @return a list of unique integer lists with four elements from {@code A}
     that sum to {@code k}
     */
    @InPlace
    List<List<Integer>> fourSum(int[] A, int k) {
        Set<List<Integer>> S = new HashSet<>();
        Arrays.sort(A); // O(n log n)
        int n = A.length;
        for (int i = 0; i < n - 3; i++) { // O(n)
            for (int j = i + 1; j < n - 2; j++) { // O(n)
                int l = j + 1, r = n - 1;
                while (l < r) { // O(n)
                    int a = A[i], b = A[j], c = A[l], d = A[r];
                    int sum = a + b + c + d;
                    if (sum == k) {
                        S.add(Arrays.asList(a, b, c, d));
                        l++;
                        r--;
                    } else if (sum > k) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return new ArrayList<>(S);
    }
}
