package leetcode.problems_1011_1020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_1013 {
    private Problem_1013 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_1013();
    }

    @Test
    void itReturnsTrueIfThreePartsHaveEqualSums() {
        assertTrue(P.canThreePartsEqualSum(new int[] { 0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1 }));
        assertTrue(P.canThreePartsEqualSum(new int[] { 3, 3, 6, 5, -2, 2, 5, 1, -9, 4 }));
        assertTrue(P.canThreePartsEqualSum(new int[] { 18, 12, -18, 18, -19, -1, 10, 10 }));
    }

    @Test
    void itReturnsFalseIfThreePartsCannotHaveEqualSums() {
        assertFalse(P.canThreePartsEqualSum(new int[] { 0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1 }));
        assertFalse(P.canThreePartsEqualSum(new int[] { 6, 1, 1, 13, -1, 0, -10, 20 }));
        assertFalse(P.canThreePartsEqualSum(new int[] { 14, 6, -10, 2, 18, -7, -4, 11 }));
    }
}
