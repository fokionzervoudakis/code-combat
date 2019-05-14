package leetcode.problems_0161_0170;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0169 {
    @Test
    void itFindsTheMajorityElement() {
        var P = new Problem_0169();
        assertEquals(3, P.majorityElement(new int[] { 3, 2, 3 }));
        assertEquals(2, P.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
        assertEquals(3, P.majorityElement(new int[] { 3, 3, 4 }));
    }
}
