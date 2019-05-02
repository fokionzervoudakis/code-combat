package interviewcake.section_08;

import annotation.Favorite;

/**
 Links:
 <ul>
 <li>{@link interviewcake.section_04.Problem_02}
 <li>{@link interviewcake.section_05.Problem_06}
 </ul>
 */
public class Problem_05 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of length n+1 with integers in the range [1, n]
     @return the duplicate integer in {@code A}, or zero if a duplicate integer
     does not exist
     */
    @Favorite
    int findDuplicate(int[] A) {
        int i = 0;
        outer:
        while (i < A.length) { // O(n)
            if (A[i] == -1) {
                // If the current value is negative, ignore it when moving from left to right.
                i++;
            } else if (A[i] == i + 1) {
                // If the current value is pointing to itself, mark it as visited.
                A[i++] = -1;
            } else {
                int prev = A[i], j = prev - 1;
                A[i] = -1;
                while (true) {
                    if (A[j] == -1) {
                        // If the current value has been visited before,
                        if (j == i) {
                            // then ignore it if it's pointing to the outer loop index currently being visited,
                            continue outer;
                        } else {
                            // otherwise it's a duplicate.
                            return prev;
                        }
                    } else {
                        prev = A[j];
                        A[j] = -1;
                        j = prev - 1;
                    }
                }
            }
        }
        return 0;
    }
}
