package dailycodingproblem.problems_031_040;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_034 {
    private Problem_034 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_034();
    }

    @Test
    void itReturnsAnEmptyStringWhenTheStringIsEmpty() {
        assertTrue(P.minPalindrome("").isEmpty());
    }

    @Test
    void itReturnsAPalindromeWithAnEvenNumberOfCharacters() {
        assertEquals("elgoogle", P.minPalindrome("google"));
    }

    @Test
    void itReturnsAPalindromeWithAnOddNumberOfCharacters() {
        assertEquals("ecarace", P.minPalindrome("race"));
    }

    @Test
    void itReturnsAnExistingPalindrome() {
        assertEquals("racecar", P.minPalindrome("racecar"));
    }
}
