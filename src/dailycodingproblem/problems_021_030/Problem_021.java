package dailycodingproblem.problems_021_030;

import annotation.pattern.HashTable;

import java.util.HashMap;

/**
 Problem #21 [Easy] - Snapchat
 */
class Problem_021 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param A an array of time intervals for classroom lectures
     @return the minimum number of rooms that accommodate lectures in {@code A}
     */
    @HashTable
    int getMinRooms(Lecture[] A) {
        if (A.length < 2) {
            return A.length;
        }

        var M1 = new HashMap<Integer, Integer>();
        var M2 = new HashMap<Integer, Integer>();

        for (var L : A) {
            M1.put(L.start, M1.containsKey(L.start) ? (M1.get(L.start) + 1) : 1);
            M2.put(L.end, M2.containsKey(L.end) ? (M2.get(L.end) + 1) : 1);
        }

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (var L : A) {
            min = Math.min(min, L.start);
            max = Math.max(max, L.end);
        }

        int lCount = 0, gCount = 0;

        for (int i = min; i <= max; i++) {
            if (M1.containsKey(i)) {
                lCount += M1.get(i);
            }
            if (M2.containsKey(i)) {
                lCount -= M2.get(i);
            }
            if (lCount > gCount) {
                gCount = lCount;
            }
        }

        return gCount;
    }

    static class Lecture {
        int start;
        int end;

        Lecture(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
