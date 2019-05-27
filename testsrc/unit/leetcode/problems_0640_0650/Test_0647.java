package leetcode.problems_0640_0650;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0647 {
    @Test
    void itCountsPalindromeSubstrings() {
        var P = new Problem_0647();
        assertEquals(3, P.countSubstrings("abc"));
        assertEquals(6, P.countSubstrings("aaa"));
        assertEquals(1, P.countSubstrings("a"));
    }
}
