package leetcode.problems_0431_0440;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0438 {
    @Test
    void itFindsAllAnagrams() {
        var P = new Problem_0438();
        assertEquals("[0, 6]", P.findAnagrams("cbaebabacd", "abc").toString());
        assertEquals("[0, 1, 2]", P.findAnagrams("abab", "ab").toString());
        assertEquals("[]", P.findAnagrams("", "a").toString());
        assertEquals("[]", P.findAnagrams("aa", "bb").toString());
        assertEquals("[]", P.findAnagrams("aaaaaaaaaa", "aaaaaaaaaaaaa").toString());
    }
}
