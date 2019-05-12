package leetcode.problems_0461_0470;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0461 {
    @Test
    void itCountsTheNumberOfSetBits() {
        var P = new Problem_0461();
        assertEquals(0, P.hammingDistance(0, 0)); // 0000 ^ 0000
        assertEquals(1, P.hammingDistance(0, 1)); // 0000 ^ 0001
        assertEquals(1, P.hammingDistance(1, 3)); // 0001 ^ 0011
        assertEquals(2, P.hammingDistance(1, 7)); // 0001 ^ 0111
        assertEquals(2, P.hammingDistance(1, 11)); // 0001 ^ 1011
        assertEquals(2, P.hammingDistance(1, 128)); // 0001 ^ 1000 0000
        assertEquals(30, P.hammingDistance(1, 2_147_483_647)); // 0001 ^ 11111111111111111111111111111101
    }
}
