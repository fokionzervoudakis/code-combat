package leetcode.problems_0201_0210;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_0205 {
    private Problem_0205 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0205();
    }

    @Test
    void itReturnsTrueIfTheStringsAreIsomorphic() {
        assertTrue(P.isIsomorphic("egg", "add"));
        assertTrue(P.isIsomorphic("paper", "title"));
    }

    @Test
    void itReturnsFalseIfTheStringsAreNotIsomorphic() {
        assertFalse(P.isIsomorphic("foo", "bar"));
        assertFalse(P.isIsomorphic("aba", "baa"));
        assertFalse(P.isIsomorphic("abba", "abab"));
        assertFalse(P.isIsomorphic("ab", "aa"));
    }
}
