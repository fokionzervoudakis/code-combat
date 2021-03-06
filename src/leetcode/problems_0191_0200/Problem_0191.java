package leetcode.problems_0191_0200;

import annotation.Bit;

class Problem_0191 {
    /**
     Uses left shifts to count the number of set bits (also known as the Hamming
     weight) in an unsigned integer.

     @param n an unsigned integer
     @return the number of bits in {@code n}
     */
    @Bit
    int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int x = 1 << i;
            if ((n & x) != 0) {
                count++;
            }
        }
        return count;
    }
}
