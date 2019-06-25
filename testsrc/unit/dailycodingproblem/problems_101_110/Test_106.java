package dailycodingproblem.problems_101_110;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_106 {
    private Problem_106 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_106();
    }

    @Test
    void itReturnsTrueIfItCanReachTheLastIndex() {
        assertTrue(P.canReach(new int[] { 2, 0, 1, 0 }));
    }

    @Test
    void itReturnsFalseIfItCannotReachTheLastIndex() {
        assertFalse(P.canReach(new int[] { 1, 1, 0, 1 }));
        assertFalse(P.canReach(new int[] { 2, 1 }));
    }
}
