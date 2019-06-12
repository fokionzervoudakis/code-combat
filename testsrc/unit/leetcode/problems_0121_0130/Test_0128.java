package leetcode.problems_0121_0130;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0128 {
    @Test
    void longestConsecutiveTest() {
        int[] A = new int[] { 100, 4, 200, 1, 3, 2 };
        assertEquals(4, new Problem_0128().longestConsecutive(A));
    }
}
