package com.facebook;

import com.facebook.Permutations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PermutationsTest {
    private Permutations P;

    @BeforeEach
    void beforeEach() {
        P = new Permutations();
    }

    @Test
    void itReturnsZeroPermutations() {
        assertTrue(P.getPermutations("", "").isEmpty());
        assertTrue(P.getPermutations("a", "").isEmpty());
    }

    @Test
    void itReturnsThePermutations() {
        var expected = "[babc, bcab, cabb, bbac, abcb, bcba, cbab, babc]";
        var actual = P.getPermutations("abbc", "babcabbacaabcbabcacbb").toString();
        assertEquals(expected, actual);
    }
}
