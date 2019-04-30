package interviewcake.section_04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_02 {
    private Problem_02 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_02();
    }

    @Test
    void itReturnsTheDuplicateValue() {
        assertEquals(1, P.findRepeat(new int[] { 1, 1 }));
        assertEquals(2, P.findRepeat(new int[] { 1, 2, 3, 2 }));
        assertEquals(5, P.findRepeat(new int[] { 1, 2, 5, 5, 5, 5 }));
        assertEquals(4, P.findRepeat(new int[] { 4, 1, 4, 8, 3, 2, 7, 6, 5 }));
    }
}
