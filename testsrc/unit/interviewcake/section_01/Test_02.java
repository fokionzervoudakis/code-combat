package interviewcake.section_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_02 {
    private Problem_02 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_02();
    }

    @Test
    void itReversesZeroCharacters() {
        var A = new char[0];
        P.reverse(A);
        assertEquals("[]", Arrays.toString(A));
    }

    @Test
    void itReversesOneCharacter() {
        var A = new char[] { 'A' };
        P.reverse(A);
        assertEquals("[A]", Arrays.toString(A));
    }

    @Test
    void itReversesManyCharacters() {
        var A = "ABCDE".toCharArray();
        P.reverse(A);
        assertEquals("[E, D, C, B, A]", Arrays.toString(A));
    }
}
