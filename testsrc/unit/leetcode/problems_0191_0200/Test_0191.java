package leetcode.problems_0191_0200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0191 {
    @Test
    void itCountsTheNumberOfSetBits() {
        var P = new Problem_0191();
        assertEquals(0, P.hammingWeight(0)); // 0000
        assertEquals(1, P.hammingWeight(1)); // 0001
        assertEquals(2, P.hammingWeight(3)); // 0011
        assertEquals(3, P.hammingWeight(7)); // 0111
        assertEquals(3, P.hammingWeight(11)); // 1011
        assertEquals(1, P.hammingWeight(128)); // 1000 0000
        assertEquals(31, P.hammingWeight(2_147_483_647)); // 11111111111111111111111111111101
    }
}
