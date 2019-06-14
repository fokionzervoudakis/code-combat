package leetcode.problems_0061_0070;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0070 {
    @Test
    void climbStairsTest() {
        var P = new Problem_0070();
        assertEquals(2, P.climbStairs(2));
        assertEquals(3, P.climbStairs(3));
    }
}
