package interviewcake.section_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_03 {
    private Problem_03 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_03();
    }

    @Test
    void itReversesOneCharacter() {
        var A = "a".toCharArray();

        P.reverseWords(A);

        var expected = "[a]";
        var actual = Arrays.toString(A);

        assertEquals(expected, actual);
    }

    @Test
    void itReversesOneWord() {
        var A = "vault".toCharArray();

        P.reverseWords(A);

        var expected = "[v, a, u, l, t]";
        var actual = Arrays.toString(A);

        assertEquals(expected, actual);
    }

    @Test
    void itReversesTwoWords() {
        var A = "cake thief".toCharArray();

        P.reverseWords(A);

        var expected = "[t, h, i, e, f,  , c, a, k, e]";
        var actual = Arrays.toString(A);

        assertEquals(expected, actual);
    }

    @Test
    void itReversesThreeWords() {
        var A = "get another one".toCharArray();

        P.reverseWords(A);

        var expected = "[o, n, e,  , a, n, o, t, h, e, r,  , g, e, t]";
        var actual = Arrays.toString(A);

        assertEquals(expected, actual);
    }

    @Test
    void itReversesManyWordsWithSameLengths() {
        var A = "the cat ate the rat".toCharArray();

        P.reverseWords(A);

        var expected = "[r, a, t,  , t, h, e,  , a, t, e,  , c, a, t,  , t, h, e]";
        var actual = Arrays.toString(A);

        assertEquals(expected, actual);
    }

    @Test
    void itReversesManyWordsWithDifferentLengths() {
        var A = "chocolate bundt cake is yummy".toCharArray();

        P.reverseWords(A);

        var expected = "[y, u, m, m, y,  , i, s,  , c, a, k, e,  , b, u, n, d, t,  , c, h, o, c, o, l, a, t, e]";
        var actual = Arrays.toString(A);

        assertEquals(expected, actual);
    }

    @Test
    void itReversesOneSmallWordAndOneBigWord() {
        var A = "a vault".toCharArray();

        P.reverseWords(A);

        var expected = "[v, a, u, l, t,  , a]";
        var actual = Arrays.toString(A);

        assertEquals(expected, actual);
    }

    @Test
    void itReversesOneBigWordAndOneSmallWord() {
        var A = "vault a".toCharArray();

        P.reverseWords(A);

        var expected = "[a,  , v, a, u, l, t]";
        var actual = Arrays.toString(A);

        assertEquals(expected, actual);
    }

    @Test
    void itReversesZeroWords() {
        var A = new char[0];
        P.reverseWords(A);
        assertEquals("[]", Arrays.toString(A));
    }
}
