package interviewcake.section_02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_02 {
    private Problem_02 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_02();
    }

    @Test
    void itReturnsTrueWhenTheStringIsEmpty() {
        assertTrue(P.hasPalindromePermutation(""));
    }

    @Test
    void itReturnsTrueWhenTheStringHasOneCharacter() {
        assertTrue(P.hasPalindromePermutation("a"));
    }

    @Nested
    class WhenTheStringHasAnEvenNumberOfCharacters {
        @Test
        void itReturnsTrueIfAPalindromePermutationExists() {
            assertTrue(P.hasPalindromePermutation("aabccbdd"));
        }

        @Test
        void itReturnsFalseIfAPalindromePermutationDoesNotExist() {
            assertFalse(P.hasPalindromePermutation("aabbcd"));
        }
    }

    @Nested
    class WhenTheStringHasAnOddNumberOfCharacters {
        @Test
        void itReturnsTrueIfAPalindromePermutationExists() {
            assertTrue(P.hasPalindromePermutation("aabcbcd"));
        }

        @Test
        void itReturnsFalseIfAPalindromePermutationDoesNotExist() {
            assertFalse(P.hasPalindromePermutation("aabcd"));
        }
    }
}
