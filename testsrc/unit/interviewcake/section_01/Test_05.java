package interviewcake.section_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_05 {
    private Problem_05 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_05();
    }

    @Test
    void bothHalvesAreTheSameLengthTest() {
        var A1 = new int[] { 1, 4, 5 };
        var A2 = new int[] { 2, 3, 6 };
        var B = new int[] { 1, 2, 3, 4, 5, 6 };
        assertTrue(P.isSingleRiffle(A1, A2, B));
    }

    @Test
    void halvesAreDifferentLengthsTest() {
        var A1 = new int[] { 1, 5 };
        var A2 = new int[] { 2, 3, 6 };
        var B = new int[] { 1, 2, 6, 3, 5 };
        assertFalse(P.isSingleRiffle(A1, A2, B));
    }

    @Test
    void oneHalfIsEmptyTest() {
        var A1 = new int[0];
        var A2 = new int[] { 2, 3, 6 };
        var B = new int[] { 2, 3, 6 };
        assertTrue(P.isSingleRiffle(A1, A2, B));
    }

    @Test
    void shuffledDeckIsMissingCardsTest() {
        var A1 = new int[] { 1, 5 };
        var A2 = new int[] { 2, 3, 6 };
        var B = new int[] { 1, 6, 3, 5 };
        assertFalse(P.isSingleRiffle(A1, A2, B));
    }

    @Test
    void shuffledDeckHasExtraCards() {
        var A1 = new int[] { 1, 5 };
        var A2 = new int[] { 2, 3, 6 };
        var B = new int[] { 1, 2, 3, 5, 6, 8 };
        assertFalse(P.isSingleRiffle(A1, A2, B));
    }
}
