package dailycodingproblem.problems_051_060;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_060 {
    private Problem_060 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_060();
    }

    @Test
    void itCannotSplitZeroOrOneElements() {
        assertFalse(P.canSplit(new int[0]));
        assertFalse(P.canSplit(new int[] { 1 }));
    }

    @Test
    void itCanSplitAnArrayWithAnEvenSum() {
        assertTrue(P.canSplit(new int[] { 15, 5, 20, 10, 35, 15, 10 }));
    }

    @Test
    void itCannotSplitAnArrayWithAnOddSum() {
        assertFalse(P.canSplit(new int[] { 15, 5, 20, 10, 35 }));
    }

    @Test
    void itCannotSplitAnArrayWithAnEvenSumWhenElementCannotBePartitioned() {
        assertFalse(P.canSplit(new int[] { -1, 0, 1, 2 }));
    }
}
