package dailycodingproblem.problems_041_050;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_046 {
    private Problem_046 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_046();
    }

    @Nested
    class WhenItUsesBruteForce {
        @Test
        void itReturnsTheEmptyStringWhenTheStringIsEmpty() {
            assertEquals("", P.maxPalindrome1(""));
        }

        @Test
        void itReturnsATrivialPalindromeWhenTheStringHasOneCharacter() {
            assertEquals("a", P.maxPalindrome1("a"));
        }

        @Test
        void itReturnsAPalindromeWhenTheStringHasManyCharacters() {
            assertEquals("bcdcb", P.maxPalindrome1("aabcdcb"));
            assertEquals("anana", P.maxPalindrome1("bananas"));
        }

        @Test
        void itReturnsTheFirstPalindromeWhenTheStringHasManyPalindromes() {
            assertEquals("bcdcb", P.maxPalindrome1("aabcdcbbananas"));
        }
    }

    @Nested
    class WhenItUsesRecursion {
        @Test
        void itReturnsTheEmptyStringWhenTheStringIsEmpty() {
            assertEquals("", P.maxPalindrome2(""));
        }

        @Test
        void itReturnsATrivialPalindromeWhenTheStringHasOneCharacter() {
            assertEquals("a", P.maxPalindrome2("a"));
        }

        @Test
        void itReturnsAPalindromeWhenTheStringHasManyCharacters() {
            assertEquals("bcdcb", P.maxPalindrome2("aabcdcb"));
            assertEquals("anana", P.maxPalindrome2("bananas"));
        }

        @Test
        void itReturnsTheFirstPalindromeWhenTheStringHasManyPalindromes() {
            assertEquals("bcdcb", P.maxPalindrome2("aabcdcbbananas"));
        }
    }
}
