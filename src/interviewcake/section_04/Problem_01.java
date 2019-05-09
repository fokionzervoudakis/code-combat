package interviewcake.section_04;

import annotation.Bitwise;

/**
 {@link dailycodingproblem.problems_051_060.Problem_058}
 */
public class Problem_01 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(log n)
     <li>space_worst=O(1)
     </ul>

     @param A an alphabetically ordered array of strings that has been rotated
     @return the rotation index of {@code A}
     */
    @Bitwise
    int findRotationPoint(String[] A) {
        int l = 0, r = A.length - 1;
        int mid = (l + r) >>> 1;
        do {
            String midVal = A[mid];
            if (midVal.compareTo(A[0]) < 0) {
                r = mid - 1;
            } else if (midVal.compareTo(A[0]) > 0) {
                l = mid + 1;
            } else {
                break;
            }
            mid = (l + r) >>> 1;
        } while (r >= l); // O(log n)
        return mid + 1;
    }
}
