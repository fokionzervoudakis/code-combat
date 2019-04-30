package dailycodingproblem.problems_011_020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_012 {
    private Problem_012 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_012();
    }

    @Test
    void itClimbsFourStairsWithTwoStairSizes() {
        var expected = "[[1, 1, 1, 1], [2, 1, 1], [1, 2, 1], [1, 1, 2], [2, 2]]";
        var actual = P.getStepCombos(4, new int[] { 1, 2 }).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itClimbsFourStairsWithThreeStairSizes() {
        var expected = "[[1, 1, 1, 1], [2, 1, 1], [1, 2, 1], [3, 1], [1, 1, 2], [2, 2], [1, 3]]";
        var actual = P.getStepCombos(4, new int[] { 1, 2, 3 }).toString();
        assertEquals(expected, actual);
    }
}
