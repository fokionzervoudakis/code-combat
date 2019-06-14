package leetcode.problems_0151_0160;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0152 {
    @Test
    void maxProductTest() {
        var P = new Problem_0152();
        assertEquals(6, P.maxProduct(new int[] { 2, 3, -2, 4 }));
        assertEquals(0, P.maxProduct(new int[] { -2, 0, -1 }));
        assertEquals(24, P.maxProduct(new int[] { -2, 3, -4 }));
    }
}
