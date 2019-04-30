package dailycodingproblem.problems_001_010;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_004 {
    private Problem_004 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_004();
    }

    @Test
    void itReturnsTheFirstMissingNumberWhenItIsLessThanAllOtherNumbers() {
        assertEquals(1, P.firstMissing(new int[] { 7, 8, 9, 11, 12 }));
    }

    @Test
    void itReturnsTheFirstMissingNumberWhenItIsGreaterThanAllOtherNumbers() {
        assertEquals(5, P.firstMissing(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    void itReturnsTheFirstMissingNumberWhenTheArrayHasTheNumberZero() {
        assertEquals(3, P.firstMissing(new int[] { 1, 2, 0 }));
    }

    @Test
    void itReturnsTheFirstMissingNumberWhenTheArrayHasDuplicateNumbers() {
        assertEquals(4, P.firstMissing(new int[] { 1, 2, 3, 3 }));
    }

    @Test
    void itReturnsTheFirstMissingNumberWhenTheArrayHasNegativeNumbers() {
        assertEquals(2, P.firstMissing(new int[] { 3, 4, -1, 1 }));
    }
}
