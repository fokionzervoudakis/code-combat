package dailycodingproblem.problems_021_030;

import annotation.Favorite;

/**
 Problem #30 [Medium] - Facebook
 */
class Problem_030 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of non-negative integers, which represent bar heights on a
     two-dimensional elevation map
     @return the units of negative space on {@code A} that can be filled up
     without running off on either side
     */
    @Favorite
    int calculateSpace(int[] A) {
        int l = 0, r = A.length - 1;
        int n = 0;
        int lMax = 0, rMax = 0;
        while (r >= l) { // O(n)
            if (A[l] < A[r]) {
                if (A[l] > lMax) {
                    lMax = A[l];
                } else {
                    n += lMax - A[l];
                }
                l++;
            } else {
                if (A[r] > rMax) {
                    rMax = A[r];
                } else {
                    n += rMax - A[r];
                }
                r--;
            }
        }
        return n;
    }
}
