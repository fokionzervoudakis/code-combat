package leetcode.problems_0071_0080;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0076 {
    private Problem_0076 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0076();
    }

    @Test
    void itReturnsTheMinWindow() {
        assertEquals("BANC", P.minWindow("ADOBECODEBANC", "ABC"));
        assertEquals("a", P.minWindow("a", "a"));
        assertEquals("", P.minWindow("a", "aa"));
        assertEquals("cwae", P.minWindow("cabwefgewcwaefgcf", "cae"));
    }
}
