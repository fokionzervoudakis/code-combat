package dailycodingproblem.problems_021_030;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

class Test_029 {
    private Problem_029 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_029();
    }

    @Test
    void itEncodesAnEmptyString() {
        assertEquals("", P.encode1(""));
        assertEquals("", P.encode2(""));
    }

    @Test
    void itEncodesAStringWithSingleCharacters() {
        assertEquals("XYZ", P.encode1("XYZ"));
        assertEquals("XYZ", P.encode2("XYZ"));
    }

    @Test
    void itEncodesAStringWithoutSingleCharacters() {
        assertEquals("2A3B4C", P.encode1("AABBBCCCC"));
        assertEquals("2A3B4C", P.encode2("AABBBCCCC"));
    }

    @Test
    void itEncodesAStringWithMixedCharacters_1() {
        var expected = "12WB12W3B24WB";
        var actual = P.encode1("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB");
        assertEquals(expected, actual);
    }

    @Test
    void itEncodesAStringWithMixedCharacters_2() {
        var expected = "12WB12W3B24WB";
        var actual = P.encode2("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB");
        assertEquals(expected, actual);
    }

    @Test
    void itEncodesAStringWithWhitespace() {
        assertEquals("2 hs2q q2w2 ", P.encode1("  hsqq qww  "));
        assertEquals("2 hs2q q2w2 ", P.encode2("  hsqq qww  "));
    }

    @Test
    void itEncodesALowercaseString() {
        assertEquals("2a3b4c", P.encode1("aabbbcccc"));
        assertEquals("2a3b4c", P.encode2("aabbbcccc"));
    }

    @Test
    void itDecodesAnEmptyString() {
        assertEquals("", P.decode(""));
    }

    @Test
    void itDecodesAStringWithSingleCharacters() {
        assertEquals("XYZ", P.decode("XYZ"));
    }

    @Test
    void itDecodesAStringWithoutSingleCharacters() {
        assertEquals("AABBBCCCC", P.decode("2A3B4C"));
    }

    @Test
    void itDecodesAStringWithMixedCharacters() {
        var expected = "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB";
        var actual = P.decode("12WB12W3B24WB");
        assertEquals(expected, actual);
    }

    @Test
    void itDecodesAStringWithWhitespace() {
        assertEquals("  hsqq qww  ", P.decode("2 hs2q q2w2 "));
    }

    @Test
    void itDecodesALowercaseString() {
        assertEquals("aabbbcccc", P.decode("2a3b4c"));
    }

    @Test
    void itEncodesAndDecodesAString() {
        var s = "zzz ZZ  zZ";
        assertEquals(s, P.decode(P.encode1(s)));
        assertEquals(s, P.decode(P.encode2(s)));
    }
}
