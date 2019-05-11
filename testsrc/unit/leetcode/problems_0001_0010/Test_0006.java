package leetcode.problems_0001_0010;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0006 {
    private Problem_0006 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0006();
    }

    @Test
    void itDoesNotConvertOneRow() {
        assertEquals("AB", P.convert("AB", 1));
        assertEquals("ABCD", P.convert("ABCD", 1));
    }

    @Test
    void itConvertsThreeRows() {
        var expected = "PAHNAPLSIIGYIR";
        var actual = P.convert("PAYPALISHIRING", 3);
        assertEquals(expected, actual);
    }

    @Test
    void itConvertsFourRows() {
        var expected = "PINALSIGYAHRPI";
        var actual = P.convert("PAYPALISHIRING", 4);
        assertEquals(expected, actual);
    }
}
