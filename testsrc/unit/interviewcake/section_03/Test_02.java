package interviewcake.section_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class Test_02 {
    private Problem_02 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_02();
    }

    @Test
    void itReturnsTheHighestProductWithASmallArray() {
        assertEquals(24, P.highestProductOf3(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    void itReturnsTheHighestProductWithALargeArray() {
        assertEquals(336, P.highestProductOf3(new int[] { 6, 1, 3, 5, 7, 8, 2 }));
    }

    @Test
    void itReturnsTheHighestProductWithOneNegativeNumber() {
        assertEquals(96, P.highestProductOf3(new int[] { -5, 4, 8, 2, 3 }));
    }

    @Test
    void itReturnsTheHighestProductWithTwoNegativeNumbers() {
        assertEquals(300, P.highestProductOf3(new int[] { -10, 1, 3, 2, -10 }));
    }

    @Test
    void itReturnsTheHighestProductWithManyNegativeNumbers() {
        assertEquals(-6, P.highestProductOf3(new int[] { -5, -1, -3, -2 }));
    }

    @Test
    void itFailsWithZeroElements() {
        try {
            P.highestProductOf3(new int[0]);
            fail(new Throwable());
        } catch (RuntimeException ignored) {
        }
    }

    @Test
    void itFailsWithOneElement() {
        try {
            P.highestProductOf3(new int[] { 1 });
            fail(new Throwable());
        } catch (RuntimeException ignored) {
        }
    }

    @Test
    void itFailsWithTwoElements() {
        try {
            P.highestProductOf3(new int[] { 1, 1 });
            fail(new Throwable());
        } catch (RuntimeException ignored) {
        }
    }
}
