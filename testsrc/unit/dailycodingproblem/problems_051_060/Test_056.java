package dailycodingproblem.problems_051_060;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_056 {
    private Problem_056 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_056();
    }

    @Test
    void itCanColorIsolatedVerticesWithOneColor() {
        var M = new int[][] {
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 }
        };
        assertTrue(P.canColor(M, 1));
        assertFalse(P.canColor(M, 0));
    }

    @Test
    void itCanColorKEdgesWithKPlusOneColors() {
        var M = new int[][] {
                { 0, 1, 1, 1 },
                { 1, 0, 1, 1 },
                { 1, 1, 0, 1 },
                { 1, 1, 1, 0 }
        };
        assertTrue(P.canColor(M, 4));
        assertFalse(P.canColor(M, 3));
    }

    @Test
    void itCanColorMaxKEdgesWithKPlusOneColors() {
        var M = new int[][] {
                { 0, 0, 0, 1 },
                { 0, 0, 1, 1 },
                { 0, 1, 1, 1 },
                { 1, 1, 1, 1 }
        };
        assertTrue(P.canColor(M, 5));
        assertFalse(P.canColor(M, 4));
    }
}
