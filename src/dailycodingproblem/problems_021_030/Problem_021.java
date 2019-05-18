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

        var M = new HashMap<Integer, Integer>();

        for (var L : A) { // O(m)
            M.put(L.start, M.containsKey(L.start) ? (M.get(L.start) + 1) : 1);
            M.put(L.end, M.containsKey(L.end) ? (M.get(L.end) - 1) : -1);
        }

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (var L : A) { // O(m)
            min = Math.min(min, L.start);
            max = Math.max(max, L.end);
        }


        int lMax = 0, gMax = 0;

        for (int i = min; i <= max; i++) { // O(n)
            if (M.containsKey(i)) {
                lMax += M.get(i);
                gMax = Math.max(gMax, lMax);
            }
        }

        return gMax;
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
