package com.fundingcircle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

class RunLenEncodingTest {
    private RunLenEncoding rle;

    @BeforeEach
    void beforeEach() {
        rle = new RunLenEncoding();
    }

    @Test
    void itEncodesAnEmptyString() {
        assertEquals("", rle.encode(""));
    }

    @Test
    void itEncodesAStringWithSingleCharacters() {
        assertEquals("XYZ", rle.encode("XYZ"));
    }

    @Test
    void itEncodesAStringWithoutSingleCharacters() {
        assertEquals("2A3B4C", rle.encode("AABBBCCCC"));
    }

    @Test
    void itEncodesAStringWithMixedCharacters() {
        var expected = "12WB12W3B24WB";
        var actual = rle.encode("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB");
        assertEquals(expected, actual);
    }

    @Test
    void itEncodesAStringWithWhitespace() {
        assertEquals("2 hs2q q2w2 ", rle.encode("  hsqq qww  "));
    }

    @Test
    void itEncodesALowercaseString() {
        assertEquals("2a3b4c", rle.encode("aabbbcccc"));
    }

    @Test
    void itDecodesAnEmptyString() {
        assertEquals("", rle.decode(""));
    }

    @Test
    void itDecodesAStringWithSingleCharacters() {
        assertEquals("XYZ", rle.decode("XYZ"));
    }

    @Test
    void itDecodesAStringWithoutSingleCharacters() {
        assertEquals("AABBBCCCC", rle.decode("2A3B4C"));
    }

    @Test
    void itDecodesAStringWithMixedCharacters() {
        var expected = "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB";
        var actual = rle.decode("12WB12W3B24WB");
        assertEquals(expected, actual);
    }

    @Test
    void itDecodesAStringWithWhitespace() {
        assertEquals("  hsqq qww  ", rle.decode("2 hs2q q2w2 "));
    }

    @Test
    void itDecodesALowercaseString() {
        assertEquals("aabbbcccc", rle.decode("2a3b4c"));
    }

    @Test
    void itEncodesAndDecodesAString() {
        var s = "zzz ZZ  zZ";
        assertEquals(s, rle.decode(rle.encode(s)));
    }
}
