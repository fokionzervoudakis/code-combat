package interviewcake.section_11;

import annotation.Bitwise;

class Problem_01 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array with many duplicate integers and one unique integer
     @return the unique integer in {@code A}
     */
    @Bitwise
    int findUniqueId(int[] A) {
        int m = 0;
        for (int n : A) {
            m ^= n;
        }
        return m;
    }
}
