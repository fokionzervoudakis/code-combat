package leetcode.problems_0021_0030;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0029 {
    private Problem_0029 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0029();
    }

    @Test
    void itCalculatesTheQuotient() {
        assertEquals(0, P.divide(0, 1));
        assertEquals(1, P.divide(1, 1));
        assertEquals(4, P.divide(12, 3));
        assertEquals(4, P.divide(13, 3));
        assertEquals(5, P.divide(25, 5));
        assertEquals(5, P.divide(27, 5));
    }

    @Test
    void itCalculatesTheQuotientWhenDividendOrDivisorAreNegative() {
        assertEquals(-2, P.divide(7, -3));
        assertEquals(-1, P.divide(-1, 1));
    }

    @Test
    void itCalculatesTheQuotientWhenDividendAndDivisorAreNegative() {
        assertEquals(1, P.divide(-1, -1));
    }

    @Ignore
    void itCalculatesTheQuotientWithOverflow() {
        assertEquals(2147483647, P.divide(-2147483648, -1));
    }
}
