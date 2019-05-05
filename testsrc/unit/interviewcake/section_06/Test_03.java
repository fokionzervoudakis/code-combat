package interviewcake.section_06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_03 {
    private Problem_03 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_03();
    }

    @Test
    void itMakesZeroChangeWithZeroCoins() {
        assertEquals(0, P.makeChange(new int[0], 1));
    }

    @Test
    void itMakesChangeForAnAmountOfZero() {
        assertEquals(1, P.makeChange(new int[] { 1, 2 }, 0));
    }

    @Test
    void itMakesChangeForASmallAmountWithSmallCoins() {
        assertEquals(4, P.makeChange(new int[] { 1, 2, 3 }, 4));
    }

    @Test
    void itMakesChangeForABigAmountWithSmallCoins() {
        assertEquals(6, P.makeChange(new int[] { 5, 10 }, 50));
    }

    @Test
    void itMakesZeroChangeForASmallAmountWithBigCoins() {
        assertEquals(0, P.makeChange(new int[] { 25, 50 }, 5));
    }

    @Test
    void itMakesChangeForOneDollar() {
        assertEquals(292, P.makeChange(new int[] { 1, 5, 10, 25, 50 }, 100));
    }
}
