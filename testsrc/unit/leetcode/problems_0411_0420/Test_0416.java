package leetcode.problems_0411_0420;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_0416 {
    private Problem_0416 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0416();
    }

    @Test
    void itReturnsTrueIfItCanPartitionTheArray() {
        assertTrue(P.canPartition(new int[] { 1, 5, 11, 5 }));
        assertTrue(P.canPartition(new int[] { 1, 2, 3, 4, 5, 6, 7 }));
    }

    @Test
    void itReturnsFalseIfItCannotPartitionTheArray() {
        assertFalse(P.canPartition(new int[] { 1, 2, 3, 5 }));
        assertFalse(P.canPartition(new int[] { 1, 2, 5 }));
    }
}
