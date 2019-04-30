package dailycodingproblem.problems_021_030;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_027 {
    private Problem_027 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_027();
    }

    @Test
    void itReturnsTrueWhenBracketsMatch() {
        assertTrue(P.hasMatchingBrackets("()[]{}"));
    }

    @Test
    void itReturnsTrueWhenNestedBracketsMatch() {
        assertTrue(P.hasMatchingBrackets("([{}])"));
        assertTrue(P.hasMatchingBrackets("([{}])"));
    }

    @Test
    void itReturnsTrueWithoutBrackets() {
        assertTrue(P.hasMatchingBrackets(""));
    }

    @Test
    void itReturnsFalseWhenBracketsDoNotMatch() {
        assertFalse(P.hasMatchingBrackets("(]"));
        assertFalse(P.hasMatchingBrackets("[}"));
        assertFalse(P.hasMatchingBrackets("{)"));
    }

    @Test
    void itReturnsFalseWhenNestedBracketsDoNotMatch() {
        assertFalse(P.hasMatchingBrackets("({[}])"));
        assertFalse(P.hasMatchingBrackets("({[}])"));
    }

    @Test
    void itReturnsFalseWithoutOpeningBrackets() {
        assertFalse(P.hasMatchingBrackets(")]}"));
    }

    @Test
    void itReturnsFalseWithoutClosingBrackets() {
        assertFalse(P.hasMatchingBrackets("([{"));
    }
}
