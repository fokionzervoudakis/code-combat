package leetcode.problems_0491_0500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0494 {
    @Test
    void itCountsTheNumberOfSetBits() {
        var A = new int[] { 1, 1, 1, 1, 1 };
        assertEquals(5, new Problem_0494().findTargetSumWays(A, 3));
    }
}
