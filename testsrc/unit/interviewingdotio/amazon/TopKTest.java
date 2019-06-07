package interviewingdotio.amazon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TopKTest {
    private TopK topK;
    private int[] A;

    @BeforeEach
    void beforeEach() {
        topK = new TopK();
        A = new int[] { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
    }

    @Test
    void itReturnsZeroElements() {
        var expected = "[]";
        var actual = topK.getTopK(A, 0).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsOneElement() {
        var expected = "[4]";
        var actual = topK.getTopK(A, 1).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsManyElements() {
        var expected = "[4, 3]";
        var actual = topK.getTopK(A, 2).toString();
        assertEquals(expected, actual);
    }
}
