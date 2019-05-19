package leetcode.problems_0021_0030;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0028 {
    private Problem_0028 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0028();
    }

    @Test
    void itReturnsTheIndexOfTheFirstOccurrenceOfThePatternInTheString() {
        assertEquals(2, P.strStr("hello", "ll"));
    }

    @Test
    void itReturnsMinusOneIfThePatternIsNotInTheString() {
        assertEquals(-1, P.strStr("aaaaa", "bba"));
    }
}
