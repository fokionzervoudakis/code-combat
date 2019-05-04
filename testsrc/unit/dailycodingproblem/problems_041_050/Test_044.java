package dailycodingproblem.problems_041_050;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_044 {
    private Problem_044 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_044();
    }

    @Test
    void itReturnsZeroInversionsWhenTheArrayHasZeroElements() {
        assertEquals(0, P.invCount(new int[0]));
    }

    @Test
    void itReturnsZeroInversionsWhenTheArrayHasOneElement() {
        assertEquals(0, P.invCount(new int[] { 1 }));
    }

    @Test
    void itReturnsZeroInversionsWhenTheArrayDoesNotContainUniqueElements() {
        assertEquals(0, P.invCount(new int[] { 1, 1 }));
    }

    @Test
    void itReturnsZeroInversionsWhenTheArrayIsSorted() {
        assertEquals(0, P.invCount(new int[] { 1, 2, 3, 4, 5 }));
    }

    @Test
    void itReturnsOneInversion() {
        assertEquals(1, P.invCount(new int[] { 2, 1 }));
    }

    @Test
    void itReturnsTwoInversions() {
        assertEquals(2, P.invCount(new int[] { 3, 1, 2 }));
    }

    @Test
    void itReturnsManyInversions() {
        assertEquals(3, P.invCount(new int[] { 2, 4, 1, 3, 5 }));
        assertEquals(10, P.invCount(new int[] { 5, 4, 3, 2, 1 }));
    }

    @Test
    void itReturnsManyInversionsWhenTheArrayContainsOneDuplicateElement() {
        assertEquals(4, P.invCount(new int[] { 2, 4, 1, 1, 5 }));
    }

    @Test
    void itReturnsManyInversionsWhenTheArrayContainsManyDuplicateElements() {
        assertEquals(6, P.invCount(new int[] { 2, 4, 4, 1, 1, 5 }));
    }
}
