package leetcode.problems_0731_0740;

import annotation.Favorite;
import annotation.Monotonic;

import java.util.Stack;

class Problem_0739 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param A an array of integers in the range [30, 100]
     @return an array of integers that represent, for each integer in {@code A},
     the number of elements until a larger element
     */
    @Favorite
    @Monotonic
    int[] dailyTemperatures(int[] A) {
        Stack<Integer> S = new Stack<>();
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) { // O(n)
            while (!S.isEmpty() && A[i] > A[S.peek()]) { // O(n)
                int j = S.pop();
                B[j] = i - j;
            }
            S.push(i);
        }
        return B;
    }
}
