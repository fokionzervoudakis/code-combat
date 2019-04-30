package interviewcake.section_11;

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
    void itFindsTheUniqueIdWhenItIsTheOnlyId() {
        var expected = 1;
        var actual = P.findUniqueId(new int[] { 1 });
        assertEquals(expected, actual);
    }

    @Test
    void itFindsTheUniqueIdWhenItIsFirst() {
        var expected = 1;
        var actual = P.findUniqueId(new int[] { 1, 2, 2 });
        assertEquals(expected, actual);
    }

    @Test
    void itFindsTheUniqueIdWhenItIsLast() {
        var expected = 1;
        var actual = P.findUniqueId(new int[] { 3, 3, 2, 2, 1 });
        assertEquals(expected, actual);
    }

    @Test
    void itFindsTheUniqueIdInASmallArray() {
        var expected = 1;
        var actual = P.findUniqueId(new int[] { 3, 2, 1, 2, 3 });
        assertEquals(expected, actual);
    }

    @Test
    void itFindsTheUniqueIdInALargeArray() {
        var expected = 8;
        var actual = P.findUniqueId(new int[] { 2, 5, 4, 8, 6, 3, 1, 4, 2, 3, 6, 5, 1 });
        assertEquals(expected, actual);
    }
}
