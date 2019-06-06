package leetcode.problems_0231_0240;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0238 {
    @Test
    void itCalculatesTheProducts() {
        var A = new int[] { 1, 2, 3, 4 };
        var expected = "[24, 12, 8, 6]";
        var actual = Arrays.toString(new Problem_0238().productExceptSelf(A));
        assertEquals(expected, actual);
    }
}
