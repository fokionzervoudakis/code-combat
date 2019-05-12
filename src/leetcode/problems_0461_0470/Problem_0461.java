package leetcode.problems_0461_0470;

import annotation.Bit;

class Problem_0461 {
    /**
     @param a an unsigned integer
     @param b another unsigned integer
     @return the number of corresponding bits that are different (i.e. the
     Hamming distance) between {@code a} and {@code b}
     */
    @Bit
    int hammingDistance(int a, int b) {
        int c = a ^ b;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int x = 1 << i;
            if ((c & x) == x) {
                count++;
            }
        }
        return count;
    }
}
