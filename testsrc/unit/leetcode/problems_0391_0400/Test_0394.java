package leetcode.problems_0391_0400;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0394 {
    @Test
    void itDecodesEncodedStrings() {
        var P = new Problem_0394();
        assertEquals("aaabcbc", P.decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", P.decodeString("3[a2[c]]"));
        assertEquals("abcabccdcdcdef", P.decodeString("2[abc]3[cd]ef"));
    }
}
