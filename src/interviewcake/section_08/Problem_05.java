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
     @return a duplicate integer, which can be discovered by converting values in
     {@code A} to array indices, or zero if a duplicate integer does not exist
     */
    @Favorite
    int findDuplicate(int[] A) {
        int i = 0;
        while (i < A.length) {
            if (A[i] == -1) {
                i++;
            } else {
                int j = i, curr = A[j], prev = curr;
                while (true) {
                    if (curr == -1) {
                        if (i != j) {
                            return prev;
                        } else {
                            break;
                        }
                    } else {
                        A[j] = -1;
                        j = curr - 1;
                    }
                    prev = curr;
                    curr = A[j];
                }
            }
        }
        return 0;
    }
}
