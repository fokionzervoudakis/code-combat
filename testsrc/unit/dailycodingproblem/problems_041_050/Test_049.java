package dailycodingproblem.problems_041_050;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_049 {
    private Problem_049 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_049();
    }

    @Test
    void itCalculatesTheMaxSumOfOneElement() {
        assertEquals(1, P.maxSum(new int[] { 1 }));
    }

    @Test
    void itCalculatesTheMaxSumOfManyPositiveElements() {
        assertEquals(15, P.maxSum(new int[] { 1, 2, 3, 4, 5 }));
    }

    @Test
    void itCalculatesTheMaxSumOfManyNegativeElements() {
        assertEquals(0, P.maxSum(new int[] { -5, -1, -8, -9 }));
    }

    @Test
    void itCalculatesTheMaxSumOfManyMixedElements() {
        assertEquals(137, P.maxSum(new int[] { 34, -50, 42, 14, -5, 86 }));
    }
}
