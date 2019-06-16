package leetcode.problems_0031_0040;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0040 {
    private Problem_0040 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0040();
    }

    @Test
    void combinationSum2Test1() {
        var expected = "[[1, 1, 6], [1, 2, 5], [1, 7], [2, 6]]";
        var actual = P.combinationSum2(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8).toString();
        assertEquals(expected, actual);
    }

    @Test
    void combinationSum2Test2() {
        var expected = "[[1, 2, 2], [5]]";
        var actual = P.combinationSum2(new int[] { 2, 5, 2, 1, 2 }, 5).toString();
        assertEquals(expected, actual);
    }
}
