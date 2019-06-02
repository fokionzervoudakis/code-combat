package leetcode.problems_0731_0740;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0739 {
    @Test
    void itCountsPalindromeSubstrings() {
        var A = new int[] { 73, 74, 75, 71, 69, 72, 76, 73 };
        var expected = "[1, 1, 4, 2, 1, 1, 0, 0]";
        var actual = Arrays.toString(new Problem_0739().dailyTemperatures(A));
        assertEquals(expected, actual);
    }
}
