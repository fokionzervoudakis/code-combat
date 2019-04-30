package dailycodingproblem.problems_011_020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_011 {
    private Problem_011 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_011();
    }

    @Test
    void itReturnsZeroWords() {
        assertTrue(P.prefix(new String[0], "d").isEmpty());
    }

    @Test
    void itReturnsOneWordThatHasTheQueryStringAsPrefix() {
        var expected = "[dog]";
        var actual = P.prefix(new String[] { "dog" }, "d").toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsManySiblingWordsThatHaveTheQueryStringAsPrefix() {
        var expected = "[deal, deer]";
        var actual = P.prefix(new String[] { "dog", "deer", "deal" }, "de").toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsManyAncestorWordsThatHaveTheQueryStringAsPrefix() {
        var expected = "[deal, deals, dealing, dealings]";
        var actual = P.prefix(new String[] { "deal", "deals", "dealing", "dealings" }, "de").toString();
        assertEquals(expected, actual);
    }
}
