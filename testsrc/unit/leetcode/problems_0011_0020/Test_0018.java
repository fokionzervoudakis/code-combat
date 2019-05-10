package leetcode.problems_0011_0020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0018 {
    private Problem_0018 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0018();
    }

    @Test
    void fourSumTest1() {
        var expected = "[[-2, 0, 0, 2], [-2, -1, 1, 2], [-1, 0, 0, 1]]";
        var actual = P.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0).toString();
        assertEquals(expected, actual);
    }

    @Test
    void fourSumTest2() {
        var expected = "[[-3, -1, 0, 4]]";
        var actual = P.fourSum(new int[] { -3, -1, 0, 2, 4, 5 }, 0).toString();
        assertEquals(expected, actual);
    }

    @Test
    void fourSumTest3() {
        var expected = "[[-1, -1, 0, 2]]";
        var actual = P.fourSum(new int[] { -1, 0, 1, 2, -1, -4 }, 0).toString();
        assertEquals(expected, actual);
    }
}
