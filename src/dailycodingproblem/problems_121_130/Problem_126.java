package dailycodingproblem.problems_121_130;

import java.util.Deque;

/**
 Problem #126 [Medium] - Facebook
 */
class Problem_126 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(k)
     <li>space_worst=O(1)
     </ul>
     */
    void rotate(Deque<Integer> L, int k) {
        for (int i = 0; i < k; i++) { // O(k)
            L.addLast(L.removeFirst()); // O(1)
        }
    }
}
