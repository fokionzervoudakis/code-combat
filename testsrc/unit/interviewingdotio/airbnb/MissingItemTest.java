package interviewingdotio.airbnb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingItemTest {
    private MissingItem item;

    @BeforeEach
    void beforeEach() {
        item = new MissingItem();
    }

    @Test
    void itFindsTheMissingElementNaively() {
        var A = new int[] { 4, 12, 9, 5, 6 };
        var B = new int[] { 4, 9, 12, 6 };
        assertEquals(5, item.naive(A, B));
    }

    @Test
    void itFindsTheMissingElement() {
        var A = new int[] { 4, 12, 9, 5, 6 };
        var B = new int[] { 4, 9, 12, 6 };
        assertEquals(5, item.optimized(A, B));
    }

    @Test
    void itFindsTheMissingElementWithXor() {
        var A = new int[] { 4, 12, 9, 5, 6 };
        var B = new int[] { 4, 9, 12, 6 };
        assertEquals(5, item.optimizedWithXor(A, B));
    }
}
