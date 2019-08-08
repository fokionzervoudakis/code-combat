package dailycodingproblem.problems_141_150;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_149 {
    private Problem_149 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_149();
    }

    @Test
    void itSumsAscendingNumbers() {
        assertEquals(5, P.sum(new int[] { 1, 2, 3, 4, 5 }, 1, 3));
    }

    @Test
    void itSumsDescendingNumbers() {
        assertEquals(7, P.sum(new int[] { 5, 4, 3, 2, 1 }, 1, 3));
    }

    @Test
    void itSumsAscendingAndDescendingNumbers() {
        assertEquals(4, P.sum(new int[] { 2, 3, 1, 5, 4 }, 1, 3));
    }

    @Test
    void itSumsPositiveAndNegativeNumbers() {
        assertEquals(2, P.sum(new int[] { -2, 3, -1, 5, 4 }, 1, 3));
    }
}
