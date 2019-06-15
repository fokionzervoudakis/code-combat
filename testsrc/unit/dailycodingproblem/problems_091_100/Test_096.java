package dailycodingproblem.problems_091_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_096 {
    @Test
    void itReturnsAllPermutations() {
        var P = new Problem_096();
        var expected = "[[1, 2, 3], [2, 1, 3], [3, 1, 2], [1, 3, 2], [2, 3, 1], [3, 2, 1]]";
        var actual = P.generate(new int[] { 1, 2, 3 }).toString();
        assertEquals(expected, actual);
    }
}
