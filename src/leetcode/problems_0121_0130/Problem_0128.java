package leetcode.problems_0121_0130;

import java.util.HashSet;
import java.util.Set;

class Problem_0128 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param A an unsorted array of integers
     @return the length of the longest sequence with consecutive elements
     */
    int longestConsecutive(int[] A) {
        Set<Integer> S = new HashSet<>();
        for (int n : A) { // O(n)
            S.add(n);
        }
        int gMax = 0;
        for (int n : A) { // O(n)
            int lMax = 1;
            while (S.contains(++n)) {
                lMax++;
            }
            gMax = Math.max(gMax, lMax);
        }
        return gMax;
    }
}
