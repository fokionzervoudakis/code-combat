package dailycodingproblem.problems_071_080;

import annotation.Favorite;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 Problem #78 [Medium] - Google
 <p>https://medium.com/outco/how-to-merge-k-sorted-arrays-c35d87aa298e
 */
class Problem_078 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(nk log k)
     <li>space_worst=O(nk+k)
     </ul>

     @param M an array of k sorted integer arrays
     @return a list of sorted integers from all arrays in {@code M}
     */
    @Favorite
    List<Integer> kWayMerge(int[][] M) {
        var Q = new PriorityQueue<Tuple>(Comparator.comparingInt(t -> M[t.i][t.j]));
        for (var i = 0; i < M.length; i++) {
            Q.add(new Tuple(i, 0));
        }
        var L = new ArrayList<Integer>();
        while (!Q.isEmpty()) {
            var T = Q.remove();
            L.add(M[T.i][T.j]);
            if (++T.j < M[T.i].length) {
                Q.add(T);
            } else if (!Q.isEmpty()) {
                Q.add(Q.remove()); // Update the heap.
            }
        }
        return L;
    }

    private class Tuple {
        int i, j;

        Tuple(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
