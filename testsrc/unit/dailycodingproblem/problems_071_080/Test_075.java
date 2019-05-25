package dailycodingproblem.problems_071_080;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_075 {
    @Test
    void itReturnsTheLongestIncreasingSubSequence() {
        var A = new int[] { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
        assertEquals(6, new Problem_075().lis(A));
    }
}
