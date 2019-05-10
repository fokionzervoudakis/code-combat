package leetcode.problems_0001_0010;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_0001 {
    private Problem_0001 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0001();
    }

    @Test
    void itReturnsTwoIntegersThatSumToK() {
        var expected = "[1, 0]";
        var actual = Arrays.toString(P.twoSum(new int[] { 2, 7, 11, 15 }, 9));
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsNullWhenZeroIntegersSumToK() {
        assertNull(P.twoSum(new int[] { 2, 7, 11, 15 }, 8));
    }
}
