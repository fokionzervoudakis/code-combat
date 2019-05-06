package dailycodingproblem.problems_051_060;

/**
 Problem #56 [Medium] - Google
 <p>
 https://www.dailycodingproblem.com/blog/graph-coloring/
 */
class Problem_056 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(VE)
     <li>space_worst=O(1)
     </ul>

     @param M an adjacency matrix
     @param k a number of colors
     @return {@code true} if each vertex in {@code M} can be colored such that no
     two adjacent vertices share the same color using at most {@code k} colors
     */
    boolean canColor(int[][] M, int k) {
        for (var A : M) {
            var sum = 0;
            for (var n : A) {
                if (n == 1) {
                    sum++;
                }
            }
            if (sum >= k) {
                return false;
            }
        }
        return true;
    }
}
