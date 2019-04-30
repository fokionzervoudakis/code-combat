package dailycodingproblem.problems_011_020;

import annotation.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

/**
 Problem #18 [Hard] - Google
 */
@SlidingWindow
class Problem_018 {
    List<Integer> slidingMax(int[] A, int k) {
        var n = A.length;

        var LR = new int[n];
        var RL = new int[n];

        // Scan elements in each window-sized block from left to right.
        for (var i = 0; i < n; i++) {
            if (i % k == 0) {
                LR[i] = A[i]; // Start each block from its leftmost element.
            } else {
                LR[i] = Math.max(LR[i - 1], A[i]);
            }
        }

        // Scan elements in each window-sized block from right to left.
        for (var i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                RL[i] = A[i]; // The end of the array is an edge case.
            } else if (i % k == k - 1) {
                RL[i] = A[i]; // Start each block from its rightmost element.
            } else {
                RL[i] = Math.max(RL[i + 1], A[i]);
            }
        }

        List<Integer> L = new ArrayList<>();
        for (var i = 0; i < n - k + 1; i++) {
            L.add(Math.max(RL[i], LR[i + k - 1]));
        }
        return L;
    }
}
