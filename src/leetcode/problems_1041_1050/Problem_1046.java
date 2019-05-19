package leetcode.problems_1041_1050;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Problem_1046 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n log n)
     <li>space_worst=O(n)
     </ul>

     @param A a non-empty array of integers
     @return
     */
    int lastStoneWeight(int[] A) {
        Queue<Integer> Q = new PriorityQueue<>(Comparator.reverseOrder());
        for (int n : A) { // O(n)
            Q.add(n); // O(log n)
        }
        while (Q.size() > 1) { // O(n)
            Q.add(Q.remove() - Q.remove()); // O(log n)
        }
        return Q.remove();
    }
}
