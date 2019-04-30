package csdojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClosestPairTest {
    private ClosestPair pair;

    @BeforeEach
    void beforeEach() {
        pair = new ClosestPair();
    }

    @Test
    void itReturnsTheClosestPairWithZeroElements() {
        var A = new int[0];
        var B = new int[0];
        var expected = "[0, 0]";
        var actual = Arrays.toString(pair.getClosest(A, B, 1));
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsTheClosestPairWithOnePairOfElements() {
        var A = new int[] { 1 };
        var B = new int[] { 1 };
        var expected = "[1, 1]";
        var actual = Arrays.toString(pair.getClosest(A, B, 1));
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsTheClosestPairWithManyPairsOfElements_1() {
        var A = new int[] { 1, 4, 5, 7 };
        var B = new int[] { 10, 20, 30, 40 };
        var expected = "[7, 30]";
        var actual = Arrays.toString(pair.getClosest(A, B, 38));
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsTheClosestPairWithManyPairsOfElements_2() {
        var A = new int[] { -1, 2, 3, 5, 8, 9 };
        var B = new int[] { 1, 2, 4, 5, 10, 20 };
        var expected = "[3, 20]";
        var actual = Arrays.toString(pair.getClosest(A, B, 24));
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsTheClosestPairWithManyPairsOfElements_3() {
        var A = new int[] { 1, 4, 7, 10 };
        var B = new int[] { 4, 5, 7, 8 };
        var expected = "[4, 8]";
        var actual = Arrays.toString(pair.getClosest(A, B, 13));
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsTheClosestPairWithManyPairsOfElements_4() {
        var A = new int[] { -8, -3, -1, 6, 8 };
        var B = new int[] { -6, -3, 2, 4, 9 };
        var expected = "[-1, 4]";
        var actual = Arrays.toString(pair.getClosest(A, B, 3));
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsTheClosestPairWithManyPairsOfElements_5() {
        var A = new int[] { -16, -16, -9, 6, 11, 13, 14, 14, 16, 19 };
        var B = new int[] { -18, -15, -11, -7, -2, 2, 9, 13, 16, 17 };
        var expected = "[-16, 2]";
        var actual = Arrays.toString(pair.getClosest(A, B, -15));
        assertEquals(expected, actual);
    }
}
