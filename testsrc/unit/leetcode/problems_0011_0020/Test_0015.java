package leetcode.problems_0011_0020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0015 {
    private Problem_0015 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0015();
    }

    @Test
    void threeSumTest1() {
        var expected = "[[-2, 0, 2], [-1, 0, 1]]";
        var actual = P.threeSum(new int[] { 1, 0, -1, 0, -2, 2 }).toString();
        assertEquals(expected, actual);
    }

    @Test
    void threeSumTest2() {
        var expected = "[[-3, -1, 4]]";
        var actual = P.threeSum(new int[] { -3, -1, 0, 2, 4, 5 }).toString();
        assertEquals(expected, actual);
    }

    @Test
    void threeSumTest3() {
        var expected = "[[-1, -1, 2], [-1, 0, 1]]";
        var actual = P.threeSum(new int[] { -1, 0, 1, 2, -1, -4 }).toString();
        assertEquals(expected, actual);
    }
}
