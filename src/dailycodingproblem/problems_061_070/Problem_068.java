package dailycodingproblem.problems_061_070;

import java.util.List;

/**
 Problem #68 [Medium] - Google
 */
class Problem_068 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^2)
     <li>space_worst=O(1)
     </ul>
     <p>Two points {@code (x1,y1)} and  {@code (x2,y2)} are are opposite vertices
     of a square if: {@code |x1-x2|=|y1-y2|}
     <p>https://math.stackexchange.com/a/1194580

     @param L a list of bishops represented as (row, column) tuples
     @return the number of pairs of bishops that attack each other
     */
    int countAttacks(List<Tuple> L) {
        if (L.size() < 2) {
            return 0;
        }
        int n = 0;
        for (int i = 0; i < L.size() - 1; i++) { // O(n)
            for (int j = i + 1; j < L.size(); j++) { // O(n)
                Tuple t1 = L.get(i), t2 = L.get(j);
                if (Math.abs(t1.x - t2.x) == Math.abs(t1.y - t2.y)) {
                    n++;
                }
            }
        }
        return n;
    }

    static class Tuple {
        int x, y;

        Tuple(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
