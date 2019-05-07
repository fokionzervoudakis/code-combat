package dailycodingproblem.problems_021_030;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_30 {
    private Problem_030 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_030();
    }

    @Test
    void itCalculatesTheSpaceWithZeroElements() {
        assertEquals(0, P.calculateSpace(new int[0]));
    }

    @Test
    void itCalculatesTheSpaceWithOneElement() {
        assertEquals(0, P.calculateSpace(new int[] { 1 }));
    }

    @Test
    void itCalculatesTheSpaceWithTwoElements() {
        assertEquals(0, P.calculateSpace(new int[] { 1, 2 }));
    }

    @Test
    void itCalculatesTheSpaceWithOrderedElements() {
        assertEquals(0, P.calculateSpace(new int[] { 1, 2, 3 }));
        assertEquals(0, P.calculateSpace(new int[] { 3, 2, 1 }));
    }

    @Test
    void itCalculatesTheSpaceWithUnorderedElements() {
        assertEquals(1, P.calculateSpace(new int[] { 2, 1, 2 }));
        assertEquals(8, P.calculateSpace(new int[] { 3, 0, 1, 3, 0, 5 }));
        assertEquals(6, P.calculateSpace(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
    }
}
