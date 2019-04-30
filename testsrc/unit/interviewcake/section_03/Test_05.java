package interviewcake.section_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_05 {
    private Problem_05 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_05();
    }

    @Test
    void itDoesNotShuffleZeroElements() {
        var A = new int[0];
        P.shuffle(A);
        assertEquals("[]", Arrays.toString(A));
    }

    @Test
    void itDoesNotShuffleOneElement() {
        var A = new int[] { 0 };
        P.shuffle(A);
        assertEquals("[0]", Arrays.toString(A));
    }
}
