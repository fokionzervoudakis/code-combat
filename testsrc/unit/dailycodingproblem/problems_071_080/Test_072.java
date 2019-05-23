package dailycodingproblem.problems_071_080;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_072 {
    private Problem_072 P;

    @BeforeEach
    void before() {
        P = new Problem_072();
    }

    @Test
    void itReturnsTheMaxPathValue() {
        var M = new int[][] { { 0, 1 }, { 0, 2 }, { 2, 3 }, { 3, 4 } };
        assertEquals(3, P.dfs("ABACA", M).intValue());
    }

    @Test
    void itReturnsNullWhenTheMaxPathValueIsInfinite() {
        assertNull(P.dfs("A", new int[][] { { 0, 0 } }));
    }
}
