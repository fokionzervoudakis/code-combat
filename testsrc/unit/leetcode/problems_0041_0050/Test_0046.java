package leetcode.problems_0041_0050;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0046 {
    private Problem_0046 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0046();
    }

    @Test
    void itPermutesManyIntegers() {
        var expected = "[[1, 2, 3], [2, 1, 3], [3, 1, 2], [1, 3, 2], [2, 3, 1], [3, 2, 1]]";
        var actual = P.permute(new int[] { 1, 2, 3 }).toString();
        assertEquals(expected, actual);
    }
}
