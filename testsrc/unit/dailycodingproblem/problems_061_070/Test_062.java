package dailycodingproblem.problems_061_070;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_062 {
    private Problem_062 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_062();
    }

    @Test
    void itCountsPathsInASquareMatrix() {
        assertEquals(1, P.countWays(1, 1));
        assertEquals(2, P.countWays(2, 2));
        assertEquals(6, P.countWays(3, 3));
        assertEquals(70, P.countWays(5, 5));
    }

    @Test
    void itCountsPathsInARectangularMatrix() {
        assertEquals(1, P.countWays(1, 2));
        assertEquals(3, P.countWays(2, 3));
        assertEquals(10, P.countWays(3, 4));
        assertEquals(126, P.countWays(5, 6));
    }
}
