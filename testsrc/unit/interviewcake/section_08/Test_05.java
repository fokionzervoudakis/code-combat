package interviewcake.section_08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_05 {
    private Problem_05 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_05();
    }

    @Test
    void itReturnsZeroWithZeroElements() {
        assertEquals(0, P.findDuplicate(new int[0]));
    }

    @Test
    void itReturnsZeroWithOneElement() {
        assertEquals(0, P.findDuplicate(new int[] { 1 }));
    }

    @Test
    void itReturnsZeroWhenTheArrayDoesNotContainDuplicateValues() {
        // All elements are self-referencing.
        assertEquals(0, P.findDuplicate(new int[] { 1, 2, 3, 4 }));

        // Some elements are self-referencing.
        assertEquals(0, P.findDuplicate(new int[] { 1, 3, 2, 4 }));

        // No elements are self-referencing.
        assertEquals(0, P.findDuplicate(new int[] { 4, 3, 2, 1 }));
    }

    @Test
    void itReturnsTheDuplicateValueWhenTheArrayContainsOneDuplicate() {
        assertEquals(1, P.findDuplicate(new int[] { 1, 1 }));
        assertEquals(2, P.findDuplicate(new int[] { 1, 2, 3, 2 }));
    }

    @Test
    void itReturnsTheDuplicateValueWhenTheArrayContainsManyDuplicates() {
        assertEquals(5, P.findDuplicate(new int[] { 1, 2, 5, 5, 5, 5 }));
        assertEquals(4, P.findDuplicate(new int[] { 4, 1, 4, 8, 3, 2, 7, 6, 5 }));
    }

    @Test
    void itReturnsTheFirstDuplicateValue() {
        assertEquals(5, P.findDuplicate(new int[] { 1, 2, 5, 4, 5, 4 }));
    }
}
