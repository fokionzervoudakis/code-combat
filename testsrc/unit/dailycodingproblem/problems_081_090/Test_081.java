package dailycodingproblem.problems_081_090;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_081 {
    private Problem_081 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_081();
    }

    @Test
    void getDigitsToLettersTest1() {
        var expected = "[a, b, c]";
        var actual = P.getDigitsToLetters("2").toString();
        assertEquals(expected, actual);
    }

    @Test
    void getDigitsToLettersTest2() {
        var expected = "[ad, ae, af, bd, be, bf, cd, ce, cf]";
        var actual = P.getDigitsToLetters("23").toString();
        assertEquals(expected, actual);
    }

    @Test
    void getDigitsToLettersTest3() {
        var expected = "[da, db, dc, ea, eb, ec, fa, fb, fc]";
        var actual = P.getDigitsToLetters("32").toString();
        assertEquals(expected, actual);
    }
}
