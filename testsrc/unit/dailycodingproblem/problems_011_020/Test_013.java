package dailycodingproblem.problems_011_020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_013 {
    private Problem_013 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_013();
    }

    @Test
    void itReturnsZeroWhenTheStringIsEmpty() {
        assertEquals(0, P.maxSub("", 0));
        assertEquals(0, P.maxSub("", 1));
        assertEquals(0, P.maxSub("", 2));
    }

    @Test
    void itReturnsZeroWhenKIsZero() {
        assertEquals(0, P.maxSub("a", 0));
        assertEquals(0, P.maxSub("ab", 0));
        assertEquals(0, P.maxSub("abc", 0));
    }

    @Test
    void itReturnsTheLengthOfTheLongestSubstringWithUniqueCharacters() {
        var s = "abc";
        assertEquals(1, P.maxSub(s, 1));
        assertEquals(2, P.maxSub(s, 2));
        assertEquals(3, P.maxSub(s, 3));
        assertEquals(3, P.maxSub(s, 4));
    }

    @Test
    void itReturnsTheLengthOfTheLongestSubstringWithDuplicateCharacters() {
        var s = "aaa";
        assertEquals(3, P.maxSub(s, 1));
        assertEquals(3, P.maxSub(s, 2));
        assertEquals(3, P.maxSub(s, 3));
        assertEquals(3, P.maxSub(s, 4));
    }

    @Test
    void itReturnsTheLengthOfTheLongestSubstringWithMixedCharacters() {
        assertEquals(3, P.maxSub("abcba", 2));
        assertEquals(5, P.maxSub("abccbba", 2));
        assertEquals(7, P.maxSub("abccbba", 3));
        assertEquals(6, P.maxSub("abcbbbabbcbbadd", 2));
        assertEquals(10, P.maxSub("abcbbbaaaaaaaaaabbcbbadd", 1));
    }
}
