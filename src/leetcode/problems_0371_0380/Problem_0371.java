package leetcode.problems_0371_0380;

import annotation.Bit;

class Problem_0371 {
    /**
     @param a an integer
     @param b another integer
     @return the sum of {@code a} and {@code b}
     */
    @Bit
    int it(int a, int b) {
        while (b != 0) {
            int c = (a & b);
            a = a ^ b;
            b = c << 1;
        }
        return a;
    }

    /**
     @param a an integer
     @param b another integer
     @return the sum of {@code a} and {@code b}
     */
    @Bit
    int rec(int a, int b) {
        return b == 0 ? a : rec(a ^ b, (a & b) << 1);
    }
}
