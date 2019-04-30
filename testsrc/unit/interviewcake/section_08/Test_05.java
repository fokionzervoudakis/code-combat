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
    void itReturnsTheDuplicateValue() {
        assertEquals(1, P.findDuplicate(new int[] { 1, 1 }));
        assertEquals(2, P.findDuplicate(new int[] { 1, 2, 3, 2 }));
        assertEquals(5, P.findDuplicate(new int[] { 1, 2, 5, 5, 5, 5 }));
        assertEquals(4, P.findDuplicate(new int[] { 4, 1, 4, 8, 3, 2, 7, 6, 5 }));
    }

    @Test
    void itReturnsZeroIfTheArrayDoesNotHaveADuplicateValue() {
        assertEquals(0, P.findDuplicate(new int[] { 1, 2, 3 }));
    }
}
