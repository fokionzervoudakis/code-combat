package leetcode.problems_0031_0040;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0039 {
    private Problem_0039 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0039();
    }

    @Test
    void combinationSumTest1() {
        var expected = "[[2, 2, 3], [7]]";
        var actual = P.combinationSum(new int[] { 2, 3, 6, 7 }, 7).toString();
        assertEquals(expected, actual);
    }

    @Test
    void combinationSumTest2() {
        var expected = "[[2, 2, 2, 2], [2, 3, 3], [3, 5]]";
        var actual = P.combinationSum(new int[] { 2, 3, 5 }, 8).toString();
        assertEquals(expected, actual);
    }

    @Test
    void combinationSumTest3() {
        var expected = "[[1, 1, 1, 1], [1, 1, 2], [2, 2]]";
        var actual = P.combinationSum(new int[] { 1, 2 }, 4).toString();
        assertEquals(expected, actual);
    }
}
