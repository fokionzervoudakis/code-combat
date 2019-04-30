package interviewcake.section_07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class Test_03 {
    private Problem_03 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_03();
    }

    @Test
    void itReturnsTheIndexOfTheCorrespondingClosingParenthesis() {
        assertEquals(7, P.getClosing("((((()))))", 2));
        assertEquals(10, P.getClosing("()()((()()))", 5));
    }

    @Test
    void itFailsWhenACorrespondingClosingParenthesisDoesNotExist() {
        try {
            P.getClosing("()(()", 2);
            fail(new Throwable());
        } catch (RuntimeException ignored) {
        }
    }
}
