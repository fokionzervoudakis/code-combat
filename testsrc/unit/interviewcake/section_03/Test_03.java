package interviewcake.section_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class Test_03 {
    private Problem_03 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_03();
    }

    @Test
    void itCalculatesTheProductsWithASmallArray() {
        var expected = "[6, 3, 2]";
        var actual = Arrays.toString(P.products(new int[] { 1, 2, 3 }));
        assertEquals(expected, actual);
    }

    @Test
    void itCalculatesTheProductsWithALargeArray() {
        var expected = "[120, 480, 240, 320, 960, 192]";
        var actual = Arrays.toString(P.products(new int[] { 8, 2, 4, 3, 1, 5 }));
        assertEquals(expected, actual);
    }

    @Test
    void itCalculatesTheProductsWithOneZero() {
        var expected = "[0, 0, 36, 0]";
        var actual = Arrays.toString(P.products(new int[] { 6, 2, 0, 3 }));
        assertEquals(expected, actual);
    }

    @Test
    void itCalculatesTheProductsWithTwoZeroes() {
        var expected = "[0, 0, 0, 0, 0]";
        var actual = Arrays.toString(P.products(new int[] { 4, 0, 9, 1, 0 }));
        assertEquals(expected, actual);
    }

    @Test
    void itCalculatesTheProductsWithOneNegativeNumber() {
        var expected = "[32, -12, -24]";
        var actual = Arrays.toString(P.products(new int[] { -3, 8, 4 }));
        assertEquals(expected, actual);
    }

    @Test
    void itCalculatesTheProductsWithNegativeNumbers() {
        var expected = "[-8, -56, -14, -28]";
        var actual = Arrays.toString(P.products(new int[] { -7, -1, -4, -2 }));
        assertEquals(expected, actual);
    }

    @Test
    void itFailsWithZeroElements() {
        try {
            P.products(new int[0]);
            fail(new Throwable());
        } catch (RuntimeException ignored) {
        }
    }

    @Test
    void itFailsWithOneElement() {
        try {
            P.products(new int[] { 1 });
            fail(new Throwable());
        } catch (RuntimeException ignored) {
        }
    }
}
