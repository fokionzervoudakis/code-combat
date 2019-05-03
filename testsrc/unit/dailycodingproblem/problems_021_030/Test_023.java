package dailycodingproblem.problems_021_030;

import dailycodingproblem.problems_021_030.Problem_023.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_023 {
    private Problem_023 P;
    private boolean[][] M;

    @BeforeEach
    void beforeEach() {
        P = new Problem_023();
        M = new boolean[][] {
                { false, false, false, false },
                { true, true, false, true },
                { false, false, false, false },
                { false, false, false, false }
        };
    }

    @Test
    void itReturnsTheNumberOfMovesFromStartToEnd() {
        assertEquals(0, P.shortestPath(M, new Point(0, 0), new Point(0, 0)).intValue());
        assertEquals(6, P.shortestPath(M, new Point(3, 0), new Point(0, 3)).intValue());
        assertEquals(7, P.shortestPath(M, new Point(3, 0), new Point(0, 0)).intValue());
    }

    @Test
    void itReturnsNullWhenTheStartPointIsUnreachable() {
        assertNull(P.shortestPath(M, new Point(1, 0), new Point(0, 0)));
    }
}
