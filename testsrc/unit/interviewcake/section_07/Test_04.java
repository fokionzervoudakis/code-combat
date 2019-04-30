package interviewcake.section_07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_04 {
    private Problem_04 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_04();
    }

    @Test
    void itReturnsTrueWhenBracketsMatch() {
        assertTrue(P.isValid("()"));
    }

    @Test
    void itReturnsTrueWhenNestedBracketsMatch() {
        assertTrue(P.isValid("([]{[]})[]{{}()}"));
    }

    @Test
    void itReturnsFalseWhenNestedBracketsDoNotMatch() {
        assertFalse(P.isValid("([][]}"));
        assertFalse(P.isValid("([)]"));
        assertFalse(P.isValid("[[]()"));
        assertFalse(P.isValid("[[]]())"));
    }

    @Test
    void itReturnsTrueWithoutBrackets() {
        assertTrue(P.isValid(""));
    }
}
