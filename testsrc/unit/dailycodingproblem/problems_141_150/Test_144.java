package dailycodingproblem.problems_141_150;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_144 {
    @Test
    void nearestLargerTest() {
        var A = new int[] { 4, 1, 3, 5, 6 };
        var P = new Problem_144();
        assertEquals(3, P.nearestLarger(A, 0).intValue());
        assertEquals(1, P.nearestLarger(A, 1).intValue());
        assertEquals(1, P.nearestLarger(A, 2).intValue());
        assertEquals(4, P.nearestLarger(A, 3).intValue());
        assertNull(P.nearestLarger(A, 4));
    }
}
