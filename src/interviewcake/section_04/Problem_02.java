package interviewcake.section_04;

import annotation.Bitwise;

/**
 {@link interviewcake.section_05.Problem_06}
 <p>{@link interviewcake.section_08.Problem_05}
 */
public class Problem_02 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n log n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of length {@code n + 1} with one or more duplicate
     integers in the range [1, n]
     @return a duplicate integer in {@code A}
     */
    @Bitwise
    int findRepeat(int[] A) {
        int l = 1, r = A.length - 1;
        while (l < r) { // O (log n)
            int mid = (l + r) >>> 1;
            int count = 0;
            for (int n : A) { // O(n)
                if (n >= l && n <= mid) {
                    count++;
                }
            }
            int total = mid - l + 1;
            if (count > total) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
