package interviewcake.section_11;

import annotation.Bitwise;

class Problem_01 {
    @Bitwise
    int findUniqueId(int[] A) {
        int m = 0;
        for (int n : A) {
            m ^= n;
        }
        return m;
    }
}
