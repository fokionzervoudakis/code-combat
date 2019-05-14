package leetcode.problems_0261_0270;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0268 {
    @Test
    void itFindsTheMissingNumber() {
        var P = new Problem_0268();
        assertEquals(2, P.missingNumber(new int[] { 3, 0, 1 }));
        assertEquals(8, P.missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
    }
}
