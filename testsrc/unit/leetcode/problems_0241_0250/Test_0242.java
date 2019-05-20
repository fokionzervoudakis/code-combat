package leetcode.problems_0241_0250;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_0242 {
    private Problem_0242 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0242();
    }

    @Test
    void itReturnsTrueWhenTheStringsAreAnagrams() {
        assertTrue(P.isAnagram("anagram", "nagaram"));
    }

    @Test
    void itReturnsFalseWhenTheStringsAreNotAnagrams() {
        assertFalse(P.isAnagram("rat", "car"));
    }
}
