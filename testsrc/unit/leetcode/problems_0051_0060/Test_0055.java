package leetcode.problems_0051_0060;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Test_0055 {
    private Problem_0055 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0055();
    }

    @Test
    void itReturnsTrueIfItCanReachTheLastIndex() {
        assertTrue(P.canJump(new int[] { 2, 3, 1, 1, 4 }));
    }

    @Test
    void itReturnsFalseIfItCannotReachTheLastIndex() {
        assertFalse(P.canJump(new int[] { 3, 2, 1, 0, 4 }));
    }
}
