package interviewcake.section_12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_01 {
    private Problem_01 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_01();
    }

    @Test
    void itFindsTheUniqueNumberWithOneElement() {
        assertEquals(1, P.findRepeat(new int[] { 1 }));
    }

    @Test
    void itFindsTheUniqueNumberWithManyElements_1() {
        assertEquals(1, P.findRepeat(new int[] { 1, 2, 1 }));
        assertEquals(4, P.findRepeat(new int[] { 4, 1, 3, 4, 2 }));
    }

    @Test
    void itFindsTheUniqueNumberWithManyElements_2() {
        int[] A = { 1, 5, 9, 7, 2, 6, 3, 8, 2, 4 };
        assertEquals(2, P.findRepeat(A));
    }
}
